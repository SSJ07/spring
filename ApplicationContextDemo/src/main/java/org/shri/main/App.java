package org.shri.main;

import org.shri.models.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext container Demo
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/** 
    	 * ApplicationContext support pre-instantiation. 
    	 * It means when we start Application container, It will create product obejct.
    	 * Not when, we call .getBean() method.
    	 */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Product product = (Product)context.getBean("product");
        System.out.println(product);
        ((ConfigurableApplicationContext)context).close();
    }
}
