import java.util.Scanner;

public class EsercizioTre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza dei due lati di un rettangolo!");


        double lato1 = inputValidateDouble(1, in);

        double lato2 = inputValidateDouble(2, in);
        System.out.println("Il Perimetro del rettangolo è " + perimetroRettangolo(lato1, lato2));

        System.out.println("Inserisci la lunghezza di 3 lati di un rettangolo!");
        double catetoUno = inputValidateDouble(1, in);
        double catetoDue = inputValidateDouble(2, in);
        double catetoTre = inputValidateDouble(3, in);
        System.out.println("L'area del triangolo è " + perimetroTriangolo(catetoUno, catetoDue, catetoTre));
        System.out.println("------------------------------------------------");
        System.out.println(pariDispari(7));
        in.close();

    }

    public static double perimetroRettangolo(double lat1, double lat2) {
        return (lat1 * 2) + (lat2 * 2);
    }

    public static int pariDispari(int num) {
        return num % 2;
    }

    public static double perimetroTriangolo(double x, double y, double z) {
        double p = x + y + z;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public static double inputValidateDouble(int n, Scanner in) {

        double number;
        do {
            System.out.println("Lato " + n + ":");
            while (!in.hasNextDouble()) {

                System.out.println("QUESTO NON é UN NUMERO DECIMALE POSITIVO!");
                System.out.println("Lato " + n + ":");
                in.next();
            }
            number = in.nextDouble();
        } while (number <= 0);


        return number;
    }
}
