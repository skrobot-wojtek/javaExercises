import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("---Kalulator---");
        System.out.println("Podaj 1 liczbe: ");
        double a = scan.nextDouble();
        System.out.println("Podaj 2 liczbe: ");
        double b = scan.nextDouble();
        System.out.println("Co chcesz zrobić?...");
        System.out.println("----Wybierz 1 aby dodać a do b");
        System.out.println("----Wybierz 2 aby odjąć b od a");
        System.out.println("----Wybierz 3 aby pomnozyć a przez b");
        System.out.println("----Wybierz 4 aby podzielić b przez a");
        int nr = scan.nextInt();
        scan.close();
        switch (nr) {

            case 1 -> {
                System.out.println("Wersja nie zaokrąglona: " + (a+b));
                double x = Math.round(a + b);
                System.out.println("Zaokrąglona wersja: "+ x);
            }
            case 2 -> {
                System.out.println("Wersja nie zaokrąglona: " + (a-b));
                double x = Math.round(a - b);
                System.out.println("Zaokrąglona wersja: "+ x);
            }
            case 3 -> {
                System.out.println("Wersja nie zaokrąglona: " + (a*b));
                double x = Math.round(a * b);
                System.out.println("Zaokrąglona wersja: "+ x);
            }
            case 4 -> {
                System.out.println("Wersja nie zaokrąglona: " + (a/b));
                double x = Math.round(a / b);
                System.out.println("Zaokrąglona wersja: "+ x);
            }
            default -> System.out.println("Nie ma takiej opcji wyboru");

        }
    }
}
