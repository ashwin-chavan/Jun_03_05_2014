import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.service.AccountService;

public class Main {

	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AccountService accountService = context.getBean("accountService",AccountService.class);
		System.out.println(accountService.getClass());
		System.out.println(accountService.getClass().getSuperclass());
		//accountService.deleteAllStatements();
		accountService.deposit(1, "Depositttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt", 1000);
		//accountService.withdraw(1, "Interest", 20);
		System.out.println("Done");
	}

}






