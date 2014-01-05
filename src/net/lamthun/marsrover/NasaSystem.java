package net.lamthun.marsrover;

public class NasaSystem {
    private static final NasaSystem instance = new NasaSystem();

    private NasaSystem(){}

    public static NasaSystem getInstance() {
        return instance;
    }

	public String sendToOneRover(String inputCommand)
	{
		Rover rover = new Rover();
		try {
			String[] messages = inputCommand.split("\n");
			if (messages == null || messages.length != 3) {
				return null;
			}
			String[] drawCommands = messages[0].split(" ");
			rover.setPlat(Integer.parseInt(drawCommands[0]), Integer.parseInt(drawCommands[1]));

			String[] gpsCommands = messages[1].split(" ");
			rover.setPosition(Integer.parseInt(gpsCommands[0]), Integer.parseInt(gpsCommands[1]));
			rover.setDirection(gpsCommands[2]);
			
			String[] moveCommands = messages[2].split("");
			for (int i = 0; i < moveCommands.length; i++) {
				rover.execute(moveCommands[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rover.reportMyCurrentStatus();
	}
	
	public String sendToManyAndroid(String inputCommand)
	{
		String result = "";
		try {
			String[] messages = inputCommand.split("\n");
			if (messages == null || (messages.length)%2 != 1) {
				return null;
			}
			int numberOfAndroid = messages.length-1;
			String[] drawCommands = messages[0].split(" ");
			for (int i = 0; i < numberOfAndroid; i=i+2) {
				Rover roverAndroid = new Rover();
				roverAndroid.setPlat(Integer.parseInt(drawCommands[0]), Integer.parseInt(drawCommands[1]));

				String[] gpsCommands = messages[i+1].split(" ");
				roverAndroid.setPosition(Integer.parseInt(gpsCommands[0]), Integer.parseInt(gpsCommands[1]));
				roverAndroid.setDirection(gpsCommands[2]);
				
				String[] moveCommands = messages[i+2].split("");
				for (int j = 0; j < moveCommands.length; j++) {
					roverAndroid.execute(moveCommands[j]);
				}
				if(i==numberOfAndroid-2)
				{
					result = result + roverAndroid.reportMyCurrentStatus();
				}
				else
				{
					result = result + roverAndroid.reportMyCurrentStatus() + "\n";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
