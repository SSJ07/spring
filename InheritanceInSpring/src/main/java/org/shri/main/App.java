package org.shri.main;

import org.shri.models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Bean inheritance in spring framework
 * We can use parent attribute in bean tag to inherit parent bean properties in child.
 * @author Shri
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp);
        ((ConfigurableApplicationContext)context).close();
    }
}
