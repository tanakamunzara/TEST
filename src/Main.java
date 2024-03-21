
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        int num1;
        int num2 ;
        int sum;
        int difference;
        int product;
        int quotient;
        System.out.println("Enter the first number");
           num1=scanner.nextInt();

        System.out.println("Enter the second number");
        num2=scanner.nextInt();
        scanner.close();
        System.out.println("You entered two numbers,the first number is " + num1);
        System.out.println("The second number is "+num2);
        sum=num1+num2;
        System.out.println("The sum is " + sum);
        difference=num1-num2;
        System.out.println("The difference is " + difference);
        product=num1*num2;
        System.out.println("The product is " +product);
        quotient=num1/num2;
        System.out.println("The quotient is " + quotient);





    }
}