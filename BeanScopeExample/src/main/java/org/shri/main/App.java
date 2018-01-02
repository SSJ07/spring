package org.shri.main;

import org.shri.models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shri
 * 
 * Spring framework has defined scope for spring bean, those are:
 * 1. singleton - It's default spring bean scope. Only one object for container
 * 2. prototype - It will create each time new object of spring bean
 * 3. request   - It will create each time new object of every http request.
 * 4. session   - It will create instance for session.
 * 
 *  1 and 2 supports standalone application
 *  3 and 4 supports web application
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = (Employee) context.getBean("employee");
        Employee employee1 = (Employee) context.getBean("employee");
        Employee employee2 = (Employee) context.getBean("employee");
        /**  How many time you call .getBean() method doens't matter, it will create one time object **/
        System.out.println(employee);
        
        /**
         * This will create new object for each request of .getBean()
         */
        Employee emp = (Employee) context.getBean("employee1");
        Employee emp1 = (Employee) context.getBean("employee1");
        Employee emp2 = (Employee) context.getBean("employee1");
        System.out.println(emp);
        
        
    }
}
