package net.lamthun.marsrover.context;

import java.util.HashMap;
import java.util.Map;

import net.lamthun.marsrover.moving.MoveToE;
import net.lamthun.marsrover.moving.MoveToN;
import net.lamthun.marsrover.moving.MoveToS;
import net.lamthun.marsrover.moving.MoveToW;

public class ApplicationContext {
    private static Map<String, Object> context = new HashMap<String, Object>();
    
    private static MoveToE moveToE = new MoveToE();
    private static MoveToS moveToS = new MoveToS();
    private static MoveToW moveToW = new MoveToW();
    private static MoveToN moveToN = new MoveToN();
    
    static 
    {
    	context.put("E", moveToE);
    	context.put("S", moveToS);
    	context.put("W", moveToW);
    	context.put("N", moveToN);
    }
    
    public static Object getBean(String key)
    {
    	return context.get(key);
    }
}
