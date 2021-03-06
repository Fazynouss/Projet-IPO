package gameCommons;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JeuInfini.FrogInf;
import JeuInfini.EnvInf;


import javax.swing.Timer;

import graphicalElements.FroggerGraphic;
import graphicalElements.IFroggerGraphics;

public class Main {


	public static void main(String[] args) {

		//Caract�ristiques du jeu
		int width = 26;
		int height = 20;
		int tempo = 100;
		int minSpeedInTimerLoops = 3;
		double defaultDensity = 0.25;
		
		//Cr�ation de l'interface graphique
		IFroggerGraphics graphic = new FroggerGraphic(width, height);
		//Cr�ation de la partie
		Game game = new Game(graphic, width, height, minSpeedInTimerLoops, defaultDensity);
		//Cr�ation et liason de la grenouille
		IFrog frog = new FrogInf(game);
		game.setFrog(frog);
		graphic.setFrog(frog);
		//Cr�ation et liaison de l'environnement
		IEnvironment env = new EnvInf(game);
		game.setEnvironment(env);
		java.lang.System.out.println(env);


		for(int i = 0; i < width+10; i++){
			game.update();
		}


		//Boucle principale : l'environnement s'acturalise tous les tempo milisecondes
        final long timerini = System.currentTimeMillis();
		Timer timer = new Timer(tempo, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				game.update();
				graphic.repaint();
				long timermilli =  System.currentTimeMillis()-timerini;
				long timer = timermilli/1000;
				System.out.println(timer);


			}




		});
		timer.setInitialDelay(0);
		timer.start();





	}
}
