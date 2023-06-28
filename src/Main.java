import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        exOne();
    }

    public static void exOne(){
        Person[] person = new Person[8];
        Scanner scanner = new Scanner(System.in);

        for (int i= 0; i < person.length; i++) {
            System.out.println("¬ведите им€:");
            String firstName = scanner.nextLine();
            System.out.println("¬ведите фамилию:");
            String lastName = scanner.nextLine();
            person[i] = new Person(firstName,lastName);
        }
        scanner.close();

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }
}

