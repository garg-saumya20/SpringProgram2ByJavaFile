package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
		
		System.out.println("_________");
		
		Student std1 = (Student) context.getBean("stdId1");
		std1.display();
		
//		Student std = context.getBean(Student.class);
//		std.display();

	}

}
