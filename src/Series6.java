import java.util.Scanner;

public class Series6 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers of organs");
        int organs = scanner.nextInt();
        while (organs%1 != 0) {
            System.out.println("enter the numbers of organs");
        }
        System.out.println("enter the difference");
        int difference = scanner.nextInt();
        System.out.println("enter the first number");
        int first = scanner.nextInt();
        print(organs,difference,first);
    }
    public static void print (int organs, int difference, int first){
        while (organs!=0){
            System.out.println(first);
            first=first+difference;
            organs --;
        }
    }
}
