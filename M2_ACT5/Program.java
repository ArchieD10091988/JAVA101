package module2.abstractclasses;

public abstract class Program {
	
	private String name;
	private boolean isRunning = false;
	
	public Program() {
		
	}
	
	public Program(String name) {
		this.name = name;
	}
	
	abstract void run();
	abstract void stop();
   
	public void setIsRunning(boolean myVar) {
		this.isRunning = myVar;
	}

	public boolean getIsRunning() {
		return isRunning;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	
	
}
