package com.example.prg7;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Prg7Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Prg7Application.class, args);
		StudentService ss=ac.getBean(StudentService.class);
		//create a menu driven program to execute the crud operations
		
		
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("\nMenu");
			System.out.println("1.Add student\n 2.View all student \n3.Delete student\n4.Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter student usn");
				String usn=sc.next();
				System.out.println("Enter student Name");
				String name=sc.next();
				System.out.println("Enter student Address");
				String address=sc.next();
				ss.insert(usn, name, address);
				System.out.println("Student added successfully");
				break;
			case 2:
				System.out.println("All student:");
				System.out.println(ss.display());
				break;
			case 3:
				System.out.println("Enter student usn to delete:");
				String usn1=sc.next();
				ss.delete(usn1);
				System.out.println("Student deleted");
				break;
			case 4:
				System.out.println("Exitiing..........");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
			
		}
		
	}

}