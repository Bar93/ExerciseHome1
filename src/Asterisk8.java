import java.util.Scanner;

public class Asterisk8 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
       int row = getNumRow();
       printAsterisk(row);

    }
    public static int getNumRow (){
        Scanner scanner = new Scanner(System.in);
       int row=0;
       while (row<5|| row>20){
           System.out.println("enter numbers of row between 5-20");
           row = scanner.nextInt();
       }
        System.out.println("ok");
       return row;
    }
    public static void printAsterisk (int row){
        int numrow=1;
        int i=1;
        while (numrow<=row){
            while (i<=numrow) {
                System.out.print("*");
                i++;
            }
            numrow++;
            i=1;
            System.out.println("");
        }
    }

}
