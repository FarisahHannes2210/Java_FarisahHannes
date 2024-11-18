import java.util.Scanner;

public class NameImport {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.print("Enter your Name: ");
        name = scanner.nextLine();

        System.out.println("Hello " + name + "!!");
    }

}
