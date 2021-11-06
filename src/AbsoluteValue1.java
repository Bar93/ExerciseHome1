import java.util.Scanner ;

public class AbsoluteValue1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("enter a number");
        int num= scanner.nextInt();
        num = Math.abs(num);
        System.out.println("The absolute value is " + num);

    }
}
