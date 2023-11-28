package es4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci numero : ");
        int n = scanner.nextInt();

        System.out.println("Contdown:");

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}

