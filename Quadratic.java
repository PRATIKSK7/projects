
import java.util.Scanner; 
public class Quadratic {
public static void main(String[] args){

int a,b,c; //coefficients 
double root1,root2;
System.out.println("enter the coefficients"); 
Scanner in=new Scanner(System.in); 
a=in.nextInt();
b=in.nextInt(); 
c=in.nextInt();

// calculate the dis(b2-4ac) 
double d=(b*b)-(4*a*c);
System.out.println("Determinant="+d);
//check if discriminant is greater than 0 
if (d>0){
// two real and distinct roots 
System.out.println("roots are real and distinct"); 
root1=(-b + Math.sqrt(d))/(2*a);
root2=(-b - Math.sqrt(d))/(2*a); 
System .out.println("Root1="+root1); 
System.out.println("Root2="+root2);
}
// check if discriminant is equal to 0 
else if(d==0){
//two real and equal roots
// determinant is equal to 0 
System.out.println("roots are real and equal"); 
root1=-b/(2*a);
root2=-b/(2*a); 
System.out.println("Root1="+root1); 
System.out.println("Root2="+root2);
}
//check if discriminant less than 0 
else{
// two imaginary and complex roots 
System.out.println("Roots are imaginary and complex"); 
root1=-b/(2*a);
root2=Math.sqrt(Math.abs(d))/(2*a); 
System.out.println("Root1="+root1+"+i"+root2); 
System.out.println("Root2="+root1+"-i"+root2);
}
}
}
