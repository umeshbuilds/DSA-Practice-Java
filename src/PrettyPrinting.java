import java.util.Scanner;

public class PrettyPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int Input = sc.nextInt();
        float a = 4.12345f;
        System.out.printf("formatted number is %.2f",a);
        System.out.println("\n-------");
        System.out.printf("PIE: %.3f ",Math.PI);
    }
}
