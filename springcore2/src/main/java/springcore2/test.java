package springcore2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("beans.xml");
		BeanFactory bn = new XmlBeanFactory(rs);
		customer c = (customer)bn.getBean("Cst1");
		c.disp();
		

	}

}
