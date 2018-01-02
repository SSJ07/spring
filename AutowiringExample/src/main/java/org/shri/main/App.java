package org.shri.main;

import org.shri.models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Spring framework support 4 different types of autowiring.
 * Default is no any autowiring
 * 1. byName - It's detect by matching bean id with java bean reference name.
 * 2. byType - It's detect by matching bean class type with java bean class type.
 * 3. constructor - It's detect by matching suitable constructor
 * 4. autodetect - It's checks first byName, then byType else constructor
 * 
 * @author Shri
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
