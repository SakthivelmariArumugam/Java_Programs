import java.util.Scanner;

public class Staris_Peak {
    public static String fun(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a < b) && (b < c) && (a < c)) {
            return "STAIR";
        } else if ((a < b) && (b > c)) {
            return "PEAK";
        } else {
            return "NONE";
        }
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String m = fun(sc);
            System.out.println(m);
        }
        sc.close(); 
    }
}
