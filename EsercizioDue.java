import java.util.Scanner;

public class EsercizioDue {
    public static void main(String[] args) {


        String[] words = new String[3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.println("Inserire parola N° " + (i + 1));
            words[i] = in.nextLine();
        }
        System.out.println("LE PAROLE CHE HAI SCELTO SONO:");
        printArray(words);
        System.out.println("LE PAROLE CHE HAI SCELTO AL COTRARIO SONO:");
        printArray(inverse(words));
    }


    public static String[] inverse(String[] args) {
        if (args == null) {
            return null;
        }
        String[] tmp = new String[args.length];
        int j = 0;
        for (int i = args.length - 1; i >= 0; i--) {
            tmp[j] = args[i];
            j++;
        }
        return tmp;
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
