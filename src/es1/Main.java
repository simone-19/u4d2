package es1;


public class Main {
    //********** 1 ************

    public static void main(String[] args) {
        String Stringa = "Simone";


        boolean PariDispari = Stringa.length() % 2 == 0;


        if (PariDispari) {
            System.out.println("è pari");
        } else {
            System.out.println("è dispari");
        }
    }


    //*********** 2 ************
    public static boolean annoBisestile(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}