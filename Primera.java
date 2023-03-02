public class Primera {

    public static void main(String[] arg) {
        int total = 0;
        total = suma(5, 85, 804);
        System.out.println("La súma de los 3 números da como resultado: " + total);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}