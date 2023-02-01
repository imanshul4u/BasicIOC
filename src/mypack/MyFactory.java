package mypack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyFactory {

	private static BeanFactory factory;
	
	static
	{
		Resource r = new ClassPathResource(
				"applicationContext.xml");
		factory = new XmlBeanFactory(r);
		
	}
	public static BeanFactory getBeanFactory()
	{
		return factory;
		
	}
	
}







