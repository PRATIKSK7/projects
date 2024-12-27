import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        char oper;
        Double result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        Double num1 = input.nextDouble();
        System.out.println("Enter second number:");
        Double num2 = input.nextDouble();
        System.out.println("Enter an option from below choices:\n1.+\n2.-\n3.*\n4./");
        oper = input.next().charAt(0);
        switch (oper)
        {
            case '+':
            result = num1 + num2;
            System.out.println(num1+ " + "+num2+" = "+result );
            break;

            case '-':
            result = num1 - num2;
            System.out.println(num1+ " - "+num2+" = "+result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println(num1+ " * "+num2+" = "+result);
            break;

            case '/':
            if (num2 == 0) System.out.println("Zero denominator error,Denominator cannot be zero");
            else{
                result = num1 / num2;
                System.out.println(num1+ " / "+num2+" = "+result);
            }
            break;

            default:
            System.out.println("Enter a valid input\nEnter an option from below choices:\n1.+\n2.-\n3.*\n4./");
            break;

        }

    }

    
}
