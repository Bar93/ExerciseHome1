import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = positive();
        while (num!=0) {
            if (primeNum(num) == true) {
                System.out.print("," + num);
            }
            num--;
        }
    }


    public static boolean division(int num1, int num2) {
        Scanner scanner = new Scanner(System.in);
        boolean remainder = false;
        if (num1 % num2 == 0) {
            remainder = true;
        } else {
            remainder = false;
        }
        return remainder;
    }

    public static boolean primeNum(int number) {
        Scanner scanner = new Scanner(System.in);
        boolean ifprime, prime=false;
        int i=0,x=number;
        while (x!=0){
            ifprime = division(number,x);
            if (ifprime==true){
                i++;
            }
            x--;
        if (i==2) {
           prime =  true;
        }
            else{
                prime = false;
            }
        }
        return prime;
    }



    public static int positive (){
        Scanner scanner = new Scanner(System.in);
        int positivenum;
        System.out.println("enter positive number");
        positivenum = scanner.nextInt();
        while (positivenum<0){
            System.out.println("enter positive number");
            positivenum = scanner.nextInt();
        }
        return positivenum;
    }
}


