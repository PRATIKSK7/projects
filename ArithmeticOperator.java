import java.util.*;
public class ArithmeticOperator {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter first number:");
       double num1 = scanner.nextDouble();
       System.out.println("Enter second number:");
       double num2 = scanner.nextDouble();
       System.out.println("Enter an option out of these:\n1.+\n2.-\n3.*\n4./");
       int oper = scanner.nextInt();
       double result;

       switch(oper){
        case 1:
        result = num1 + num2;
        System.out.println("num1 + num2 ="+result);
        break;

        case 2:
        result = num1 - num2;
        System.out.println("num1 - num2 ="+result);
        break;
         
        case 3:
        result = num1 * num2;
        System.out.println("num1 * num2 ="+result);
        break;

        case 4:
        if (num2 != 0){
            result = num1/num2;
            System.out.println("num1/num2 ="+result);
        }
        else
        {
            System.out.println("Zero denominator error.Denominator cannot be zero");
        }
        break;

        default :
        System.out.println("Invalid input please enter an valid input \n1.+\n2.-\n3.*\n4./");
        break;

       }

    }
}
