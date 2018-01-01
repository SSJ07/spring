package org.shri.main;

import org.shri.models.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        Product product = (Product)beanFactory.getBean("product");
        System.out.println(product);
    }
}
