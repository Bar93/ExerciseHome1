import java.util.Scanner;

public class QuadraticEquation4 {
    public static void main (String [] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.println("Enter a,b,c");
        int a,b,c;
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();
        double x1,x2,sqrt;
        if (a == 0 || b*b-4*a*c<0){
            System.out.println("No solution");
        }
        if (b*b-4*a*c==0){
            x1 = -1*b/2*a;
            System.out.println("Have one solution" + x1);
        }
        if (a != 0 && b*b-4*a*c>0) {
            sqrt = b * b - 4 * a * c;
            sqrt = Math.sqrt(sqrt);
            x1 = (-1 * b + sqrt) / 2 * a;
            x2 = (-1 * b - sqrt) / 2 * a;
            System.out.println("Have two solutions" + x1 + x2);
        }
    }

}
