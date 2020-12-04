package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import util.Case;
import util.Direction;





public class Frog implements IFrog {

	private Game game;
	private Case c;

	public Frog(Game game) {
		this.game = game;
		this.c = new Case(game.width/2,0);
	}

	@Override
	public Case getPosition() {
		return c;
	}

	@Override
	public Case getDirection() {
		return c;
	}

	@Override
	public void move(Direction key) {
		if( key == Direction.up) {
			this.c = new Case(c.absc, c.ord+1);
		}else if( key == Direction.down) {
			this.c = new Case(c.absc, c.ord - 1);
		}else if( key == Direction.right) {
			this.c = new Case(c.absc + 1, c.ord);
		}else if( key == Direction.left) {
			this.c = new Case(c.absc - 1, c.ord);
		}
	}

}