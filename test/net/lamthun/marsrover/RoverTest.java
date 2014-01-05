package net.lamthun.marsrover;

import junit.framework.Assert;

import org.junit.Test;

public class RoverTest {

	@Test
	public void 测试地图是否绘制成功() {
		Rover roverAndroid = new Rover();
		Plat expectPlat = new Plat(6, 6);

		roverAndroid.setPlat(6, 6);
		Plat plat = roverAndroid.getPlat();

		Assert.assertEquals(expectPlat, plat);
	}

	@Test
	public void 测试自己是否在指定的位置() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);

		Position expectPosition = new Position(1, 2);
		Position position = roverAndroid.getPosition();

		Assert.assertEquals(expectPosition, position);
	}

	@Test
	public void 测试自己是否面向指定的方向() {
		Rover roverAndroid = new Rover();
		roverAndroid.setDirection("E");

		Assert.assertEquals(Direction.E, roverAndroid.getDirection());
	}

	@Test
	public void 测试面向东方的时候向右转() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("E");

		Direction expectDirection = Direction.S;
		roverAndroid.execute("R");
		Assert.assertEquals(expectDirection, roverAndroid.getDirection());
	}

	@Test
	public void 测试面向东方的时候向左转() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("E");

		Direction expectDirection = Direction.N;
		roverAndroid.execute("L");
		Assert.assertEquals(expectDirection, roverAndroid.getDirection());
	}

	@Test
	public void 测试面向南方的时候向右转() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("S");

		Direction expectDirection = Direction.W;
		roverAndroid.execute("R");
		Assert.assertEquals(expectDirection, roverAndroid.getDirection());
	}

	@Test
	public void 测试面向南方的时候向左转() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("S");

		Direction expectDirection = Direction.E;
		roverAndroid.execute("L");
		Assert.assertEquals(expectDirection, roverAndroid.getDirection());
	}

	@Test
	public void 测试面向西方的时候向右转() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("W");

		Direction expectDirection = Direction.N;
		roverAndroid.execute("R");
		Assert.assertEquals(expectDirection, roverAndroid.getDirection());
	}

	@Test
	public void 测试面向西方的时候向左转() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("W");

		Direction expectDirection = Direction.S;
		roverAndroid.execute("L");
		Assert.assertEquals(expectDirection, roverAndroid.getDirection());
	}

	@Test
	public void 测试面向北方的时候向右转() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("N");

		Direction expectDirection = Direction.E;
		roverAndroid.execute("R");
		Assert.assertEquals(expectDirection, roverAndroid.getDirection());
	}

	@Test
	public void 测试面向北方的时候向左转() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("N");

		Direction expectDirection = Direction.W;
		roverAndroid.execute("L");
		Assert.assertEquals(expectDirection, roverAndroid.getDirection());
	}

	@Test
	public void 测试向东走一步() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("E");

		Position expectPosition = new Position(2, 2);
		roverAndroid.execute("M");
		Assert.assertEquals(expectPosition, roverAndroid.getPosition());
	}

	@Test
	public void 测试向南走一步() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("S");

		Position expectPosition = new Position(1, 1);
		roverAndroid.execute("M");
		Assert.assertEquals(expectPosition, roverAndroid.getPosition());
	}

	@Test
	public void 测试向西走一步() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("W");

		Position expectPosition = new Position(0, 2);
		roverAndroid.execute("M");
		Assert.assertEquals(expectPosition, roverAndroid.getPosition());
	}

	@Test
	public void 测试向北走一步() {
		Rover roverAndroid = new Rover();
		roverAndroid.setPlat(5, 5);
		roverAndroid.setPosition(1, 2);
		roverAndroid.setDirection("N");

		Position expectPosition = new Position(1, 3);
		roverAndroid.execute("M");
		Assert.assertEquals(expectPosition, roverAndroid.getPosition());
	}
}