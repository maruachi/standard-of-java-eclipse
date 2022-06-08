package Task;

public class Execute extends Command{
	private final int tagNum;
	
	public Execute(String command) {
		super("command");
		String[] commands = command.split(" ");
		this.tagNum = Integer.parseInt(commands[1]);
	}
	
	public void run(UsableTag usableTag) {
		
	}
}
