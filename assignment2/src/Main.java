import sub.Person;
import sub.Employee;
import sub.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            printMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    addEmployee(scanner, people);
                    break;
                case 2:
                    addStudent(scanner, people);
                    break;
                case 3:
                    Collections.sort(people);
                    printData(people);
                case 4:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Error.");
            }
        } while (option != 4);
    }

    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add employee");
        System.out.println("2. Add student");
        System.out.println("3. Output");
        System.out.println("4. Exit program");
        System.out.print("Enter option: ");
    }
    private static void addEmployee(Scanner scanner, ArrayList<Person> people){
        System.out.print("Enter employee name: ");
        String name = scanner.next();

        System.out.print("Enter employee surname: ");
        String surname = scanner.next();

        System.out.print("Enter employee position: ");
        String position = scanner.next();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        people.add(new Employee(name, surname, position, salary));
        System.out.println("Employee added");
    }

    private static void addStudent(Scanner scanner, ArrayList<Person> people){
        System.out.print("Enter student name: ");
        String name = scanner.next();

        System.out.print("Enter student surname: ");
        String surname = scanner.next();

        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();

        people.add(new Student(name, surname, gpa));
        System.out.println("Student added");

    }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " salary is " + person.getPaymentAmount() + " tenge");
        }
    }
}
