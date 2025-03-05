package rvce.lab.prg1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Prg1Application {

	public static void main(String[] args) {
		SpringApplication.run(Prg1Application.class, args);
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		
//		Customer c = ac.getBean(Customer.class);
//		Ticket t = ac.getBean(Ticket.class);
//		
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

	        Customer c = context.getBean("customer", Customer.class);
	        Ticket t = context.getBean("ticketA", Ticket.class);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Customer Details");
		System.out.println("Name:");
		c.setName(sc.nextLine());
		
		System.out.println("Address:");
		c.setAddress(sc.nextLine());
		
		
		System.out.println("Enter Ticket Details");
		System.out.println("Ticket Number");
		t.setTicket_no(sc.nextInt());
		System.out.println("Price");
		t.setPrice(sc.nextInt());
		
		System.out.println("Seat Number");
		t.setSeatno(sc.nextInt());
		
		
		System.out.println("Ticket Type");
		t.setTictype(sc.nextLine());
		
		System.out.println("Customer Details");
		System.out.println(c.getName());
		System.out.println(c.getAddress());
		
		System.out.println("Ticket Details");
		System.out.println(t.getPrice());
		System.out.println(t.getSeatno());
		System.out.println(t.getTicket_no());
		System.out.println(t.getTictype());
		
		
		sc.close();
//		ac.close();
		((ClassPathXmlApplicationContext) context).close(); 
	}
}