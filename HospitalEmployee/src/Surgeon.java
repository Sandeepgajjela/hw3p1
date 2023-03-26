
public class Surgeon extends Doctor {
	
	boolean isOperating;

	public boolean isOperating() {
		return isOperating;
	}

	public void setOperating(boolean isOperating) {
		this.isOperating = isOperating;
	}

	@Override
	public String toString() {
		return "" +name + " " + specialty+ " "+isOperating;
		
	}

	public Surgeon(String name, int number, String specialty, boolean isOperating) {
		super(name, number, specialty);
		this.isOperating = isOperating;
	}
		
	@Override
	public void work() {
		String Operating = "not operating"; 
		if(isOperating) {
			Operating = "operating";
		}
		System.out.println(name+ "works for the hospital"+name+"is" +Operating+"now");
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	


