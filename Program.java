import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String name;
        System.out.println("Hello, what’s your name?");
        // get name from user input
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}