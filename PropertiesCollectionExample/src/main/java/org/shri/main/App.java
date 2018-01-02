package org.shri.main;

import org.shri.models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shri
 * 
 * This is properties collection example in spring framework
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = (Employee)context.getBean("employee");
        System.out.println(employee);
        ((ConfigurableApplicationContext)context).close();
    }
}
