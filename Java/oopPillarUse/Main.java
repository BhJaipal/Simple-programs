import java.util.Scanner;
import java.lang.Integer;

public class Main {
	public static void main(String[] args) {
		System.out.print("Enter name: ");
		Scanner scan = new Scanner(System.in);
		String name= scan.next();

		System.out.print("Enter age: ");
		Integer age= Integer.valueOf(scan.nextInt());

		System.out.print("Enter salary: ");
		Integer salary= Integer.valueOf(scan.nextInt());
		System.out.println("");

		Person person;

		System.out.println("Choose any one: ");
		System.out.println("1. Programmer");
		System.out.println("2. Manager");
		System.out.print("Enter your choice: ");

		Integer choice1= Integer.valueOf(scan.nextInt());

		if (choice1.intValue() == 1) {
			person= new Programmer(name, age, salary);
		} else {
			person= new Manager(name, age, salary);
		}
		System.out.println("");

		while (true) {
			System.out.println("Choose any one: ");
			System.out.println("1. Change name\n2. Change age\n3. Change salary\n4. Get current data\n5. Exit");
			System.out.print("Enter your choice: ");
			Integer choice = Integer.valueOf(scan.nextInt());
			System.out.println("");
			
			if (choice.intValue() == 1) {
				System.out.print("Enter new name: ");
				String newName= scan.next();
				person.setName(newName);
				System.out.println("");
			} else if (choice.intValue() == 2) {
				System.out.print("Enter new age: ");
				Integer newAge= Integer.valueOf(scan.nextInt());
				person.setAge(newAge);
				System.out.println("");
			} else if (choice.intValue() == 3) {
				System.out.print("Enter new salary: ");
				Integer newSalary= Integer.valueOf(scan.nextInt());
				person.setSalary(newSalary);
				System.out.println("");
			} else if (choice.intValue() == 4) {
				System.out.printf("Name: %s\n", person.getName());
				System.out.printf("Age: %d\n", person.getSalary());
				System.out.printf("Salary: %d\n", person.getSalary());
				System.out.print("Location: ");
				System.out.println(person);
				System.out.println("");
			} else if (choice.intValue() == 5) {
				scan.close();
				break;
			} else {
				System.out.println("Invalid input, please try again");
				System.out.println("");
			}
		}
	}
}
