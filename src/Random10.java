import java.util.Scanner;
import java.util.Random;

public class Random10 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int num,guess1=1001,guess2=1001;
        int count1=0,count2=0;
        Random rnd = new Random();
        num= rnd.nextInt(1001);
        System.out.println(num); // מודפס בשביל בדיקה עצמית
        while (guess1!=num && guess2!=num){
            System.out.println("user1 enter a guess");
            guess1 = scanner.nextInt();
            if (guess1<num){
                System.out.println("the guess is small");
            }
            if (guess1>num) {
                System.out.println("the guess is big");
            }
            System.out.println("user2 enter a guess");
            guess2 = scanner.nextInt();
            if (guess2<num){
                System.out.println("the guess is small");
            }
            if (guess2>num) {
                System.out.println("the guess is big");
            }
            count1++;
            count2++;
        }
        if (num==guess1){
            System.out.println("user1 win and use  " + count1);
        }
        if(num==guess2){
            System.out.println("user2 win and use  " + count2);
        }
    }
}
