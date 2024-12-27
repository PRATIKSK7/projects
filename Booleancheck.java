import java.util.Scanner;
public class Booleancheck {
    public static void main(String[] args){
        System.out.println("Getting input from user :");
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        if (b1 == true) {
        System.out.println("Given number is an integer.");
        }
        else{
         System.out.println("Given number is not an integer.");
        }
    }
}
