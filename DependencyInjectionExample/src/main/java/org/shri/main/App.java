package org.shri.main;

import org.shri.models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * SpringFramework supports three types of dependency injection.
 * 1. Setter/Getter - used <property> tag
 * 2. Constructor - <constructor-arg> tag
 * 3. Interface
 * 
 * @author shri
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Employee emp = (Employee) context.getBean("employee");
    	System.out.println(emp);
    	((ConfigurableApplicationContext)context).close();
    }
}
