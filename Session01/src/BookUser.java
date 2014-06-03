import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ds.Book;
import com.ds.Company;
import com.ds.Person;


public class BookUser {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("bin/beans.xml");
		Company c1 = context.getBean("company",Company.class);
		System.out.println(c1.getName());
		System.out.println(c1.getCountry());
		System.out.println(c1.getCity());
		
		Person p1 = context.getBean("person",Person.class);
		System.out.println(p1.getEmails());
		
/*		System.out.println("BEFORE CALLING getBean('book')");
		Book book1 = context.getBean("book",Book.class);
		System.out.println(book1);
		Book book2 = context.getBean("book",Book.class);
		System.out.println(book2);*/
	}

}




