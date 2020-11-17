import gameCommons.Game;
		import gameCommons.IFrog;
		import util.Case;
		import util.Direction;

		import java.awt.event.KeyEvent;

public class Frog implements IFrog {


	//*********Attributs********//

	private Game game;
	private Case c;
	private int x;
	private int y;

	//*********Constructeur*********//

	public Frog(Game game){
		this.game = game;
		this.x = game.width/2;
		this.y = 0;
		this.c = case(x, y);
	}

	//*********Methodes*********//
	public static void Case getPosition(){
		return c;
	}


	public static void Direction getDirection(){
	}
}
