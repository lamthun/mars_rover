package net.lamthun.marsrover.moving;

import net.lamthun.marsrover.Position;

public class MoveToW implements MoveInterface {
	@Override
	public Position moving(Position position) {
		return new Position(position.getX()-1, position.getY());
	}
}
