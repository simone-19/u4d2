package es2;

public class main {
    public static void main(String[] args) {
        int n = 2; // Puoi modificare questo valore per testare

        switch (n) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("non è tra 0 e 3");
                break;
        }
    }
}