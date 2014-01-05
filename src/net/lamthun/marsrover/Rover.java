package net.lamthun.marsrover;

import java.util.HashMap;
import java.util.Map;

import net.lamthun.marsrover.context.ApplicationContext;
import net.lamthun.marsrover.moving.MoveInterface;

public class Rover {
	private Plat plat;
	private Position position;
	private Direction direction;
	
	public Plat getPlat() {
		return this.plat;
		
	}

	public void setPlat(int width, int length) {
		this.plat = new Plat(width,length);
	}

	public void setPosition(int x, int y) {
		this.position = new Position(x,y);
	}

	public Position getPosition() {
		return position;
	}

	public Direction getDirection() {
		return this.direction;
	}
	
	public void setDirection(String direction) {
		Map<String, Direction> gpsMap = new HashMap<String, Direction>();
		gpsMap.put("E", Direction.E);
		gpsMap.put("S", Direction.S);
		gpsMap.put("W", Direction.W);
		gpsMap.put("N", Direction.N);
		this.direction = gpsMap.get(direction);
	}

	public void execute(String command) {
		if("L".equals(command))
		{
			trunLeft();
		}
		
		if("R".equals(command))
		{
			trunRight();
		}
		
		if("M".equals(command))
		{
			move();
		}
	}

	private void trunLeft() {
		Map<Direction, Direction> directionMap = new HashMap<Direction, Direction>();
		directionMap.put(Direction.E, Direction.N);
		directionMap.put(Direction.S, Direction.E);
		directionMap.put(Direction.W, Direction.S);
		directionMap.put(Direction.N, Direction.W);
		
		this.direction = directionMap.get(this.direction);
	}

	private void trunRight() {
		
		Map<Direction, Direction> directionMap = new HashMap<Direction, Direction>();
		directionMap.put(Direction.E, Direction.S);
		directionMap.put(Direction.S, Direction.W);
		directionMap.put(Direction.W, Direction.N);
		directionMap.put(Direction.N, Direction.E);
		
		this.direction = directionMap.get(this.direction);
		
		
	}
	
	private void move() 
	{	
		this.position = ((MoveInterface)ApplicationContext.getBean(this.direction.name())).moving(this.position);
	}
	
	public String reportMyCurrentStatus()
	{
		return this.position.getX() + " " + this.position.getY() + " " + this.direction.name();
	}
}
