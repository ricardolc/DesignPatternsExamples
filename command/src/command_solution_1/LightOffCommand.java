package command_solution_1;

public class LightOffCommand implements Command { 

	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
	
	public void undo(){}
	
}