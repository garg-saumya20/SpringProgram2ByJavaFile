package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Student stdId()
	{
		Student std=new Student();
		std.setName("Saumya");
		std.setRollno(101);
		std.setEmail("Saumya@gmail.com");
		return std;
	}
	
	@Bean
	public Student stdId1()
	{
		Student std=new Student();
		std.setName("Sanyam");
		std.setRollno(102);
		std.setEmail("Sanyam@gmail.com");
		return std;
	}
}
