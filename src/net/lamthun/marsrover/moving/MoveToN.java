package net.lamthun.marsrover.moving;

import net.lamthun.marsrover.Position;

public class MoveToN implements MoveInterface {
	@Override
	public Position moving(Position position) {
		return new Position(position.getX(), position.getY()+1);
	}
}