package net.lamthun.marsrover;

public class Plat {
	/*
	 * ¿í¶È
	 */
	private int width;
	
	/*
	 * ³¤¶È
	 */
	private int length;
	
	public Plat(int width, int length) {
		this.width = width;
		this.length = length;
	}

    @Override
    public boolean equals(Object another) {
        if(another == null)
        {
        	return false;
        }
        if(!(another instanceof Plat))
        {
        	return false;
        }
        Plat anotherPlat = (Plat)another;
        return this.width == anotherPlat.width && this.length == anotherPlat.length;
    }

    @Override
    public int hashCode() {
        return width*length + width*5 + length*11;
    }

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
}
