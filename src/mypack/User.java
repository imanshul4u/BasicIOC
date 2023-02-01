package mypack;

import org.springframework.beans.factory.BeanFactory;

public class User {

	public static void main(String[] args) {
		// Obtaining the reference of the BeanFactory
		BeanFactory factory = MyFactory.getBeanFactory();
		System.out.println("Obtaining two Number objects:");
		Number n1 = (Number) factory.getBean("num1");
		Number n2 = (Number) factory.getBean("num2");
		System.out.print("First Number is: ");
		n1.display();
		System.out.print("Second Number is: ");
		n2.display();
		Number n3 = n1.add(n2);
		System.out.print("Their sum is: ");
		n3.display();
	}

}
