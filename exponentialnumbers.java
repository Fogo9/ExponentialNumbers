import java.util.Scanner;

public class exponentialnumbers{
    public static void main(String[] args) {

        int n, i;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Limit Number : ");

        n = scan.nextInt();


        for(i = 1; i <= n; i *= 4){

            System.out.println("Multiples of 4 : " + i);

        }

        System.out.println("------------------");

        for(i = 1; i <= n; i *= 5){

            System.out.println("Multiples of 5 : " + i);

        }
    }
}
