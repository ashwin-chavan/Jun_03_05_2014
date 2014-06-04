public class Employee{
	private String id;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void work(){
		try{Thread.sleep(3000);}catch(Exception ex){}
		System.out.println("On Facebook");
	}
}