import java.util.Date;

interface Greeting{
	void greet(String name);
}
interface Printer{
	void printDate();
}
public class LambdaEx {

	public static void main(String[] args) {
		Printer printer = () -> System.out.println(new Date());
		printer.printDate();
		
		/*Greeting greeting = new Greeting(){
			public void greet(String name){
				System.out.println("Hello " + name);
			}
		};*/
		Greeting greeting = (name) -> System.out.println("Hello " + name);
		greeting.greet("Sam");
	}
}









