public class EsercizioUno {
    public static void main(String[] args) {
        System.out.println(multiplication(2, 5));
        /*printf non funziona*/
        System.out.println(concat("ssdvdcvf", 55453));

        String[] arrString = {"ciao", "sono", "ciao", "tutti", ""};
        printArray(inserisciInArray(arrString, "Massimo"));
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static String concat(String str, int num) {
        return str + num;
    }

    public static String[] inserisciInArray(String[] arrStr, String stringaUno) {
        if (arrStr.length != 5) {
            System.out.println("Accetto array di stringhe solo di lunghezza 5!");
            return null;
        } else {
            String tmp;
            String[] result = new String[6];
            for (int i = 0, j = 0; i < arrStr.length; i++, j++) {
                if (j == 2) {
                    result[j] = stringaUno;
                    i--;
                } else {
                    result[j] = arrStr[i];
                }
            }
            return result;
        }
    }

    public static void printArray(String[] args) {
        if (args == null) {
            System.out.println("array nullo non è possibile stamparlo!");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.printf(args[i] + ",");
            }
        }

    }
}
