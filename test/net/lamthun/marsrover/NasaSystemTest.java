package net.lamthun.marsrover;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class NasaSystemTest {
	@Test
	public void 发送命令给一台()
	{
		NasaSystem nasaSystem = NasaSystem.getInstance();
        assertEquals("1 3 N", nasaSystem.sendToOneRover(
                "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM\n"));
	}
	
//	@Test
//	public void 发送命令给多台()
//	{
//		NasaSystem nasaSystem = NasaSystem.getInstance();
//        assertEquals("1 3 N", nasaSystem.sendToManyAndroid(
//                "5 5\n" +
//                "1 2 N\n" +
//                "LMLMLMLMM\n"));
//	}
	
	@Test
	public void 发送命令给更多台()
	{
		NasaSystem nasaSystem = NasaSystem.getInstance();
        assertEquals("1 3 N\n" + "5 1 E", nasaSystem.sendToManyAndroid(
                "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM\n" +
                "3 3 E\n" +
                "MMRMMRMRRM\n"));
	}
}
