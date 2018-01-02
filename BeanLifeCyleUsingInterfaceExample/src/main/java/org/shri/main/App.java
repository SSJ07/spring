package org.shri.main;

import org.shri.models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shri
 * 
 * Spring supports two interfaces to manage bean life cycle to alternate init-method and
 * destory-method
 * 
 * 1. InitializingBean
 * 2. DisposableBean
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee emp = (Employee)context.getBean("employee");
        System.out.println(emp);
        ((ConfigurableApplicationContext)context).close();
    }
}
