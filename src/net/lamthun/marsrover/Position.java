package net.lamthun.marsrover;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object another) {
        if(another == null) 
        {
        	return false;
        }
        if(!(another instanceof Position)) 
        {
        	return false;
        }
        
        Position anotherPosition = (Position)another;
        return x == anotherPosition.x && y == anotherPosition.y;
    }

    @Override
    public int hashCode() {
        return x*y + x*17 + y*29;
    }

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
