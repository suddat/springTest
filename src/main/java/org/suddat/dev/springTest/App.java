package org.suddat.dev.springTest;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        /*DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("springConfig.xml"));*/
        /*HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
		hello.greet();*/
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
    }
}
