package Task;

public class Create extends Command {	
	public Create() {
		super("create");
	}
	
	public void run(UsableTag usableTag) {
		usableTag.use();
	}
}
