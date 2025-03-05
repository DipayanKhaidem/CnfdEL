package rvce.lab.prog2;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("rvce.lab.prog2")
public class Prog2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Prog2Application.class, args);
        Scanner sc = new Scanner(System.in);
        Department dt = context.getBean(Department.class);

        while (true) {
            System.out.println("1. Insert the Department details \n2. Display dept with college details \n3. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) { // Handle invalid input
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Consume invalid input
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter Department Name: ");
                    String name = sc.nextLine(); // Read full line to avoid issues with spaces
                    dt.setName(name);

                    System.out.print("Enter Department Number: ");
                    while (!sc.hasNextInt()) { 
                        System.out.println("Invalid input. Please enter a valid department number.");
                        sc.next(); 
                    }
                    dt.setId(sc.nextInt());
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Department Description: ");
                    dt.setDescription(sc.nextLine());

                    System.out.println("Thanks");
                    break;

                case 2:
                    System.out.println("Department Details:");
                    System.out.println("Name: " + dt.getName() + " | ID: " + dt.getId() + " | Dept Desc: " + dt.getDescription());

                    System.out.println("College Details:");
                    College c = dt.getCollege();
                    if (c != null) {
                        System.out.println("College Name: " + c.getName());
                        System.out.println("College Address: " + c.getAddress());
                    } else {
                        System.out.println("No college details available.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
