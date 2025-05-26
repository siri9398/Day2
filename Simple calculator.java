import java.util.Scanner; 
public class Simple calculator{ //determines the class as simple calculator
    public static void main(String[]args){ //main class
        Scanner scanner = new Scanner(System.in); //create a scanner object
        System.out.println("Enter the first number:");// user to print first number
        add num1=Scanner.nextAdd();
        System.out.println("Enter the second number:");//user to print second number
        add num2=Scanner.nextAdd();
        add sum=num1+num2;//add the two numbers
        System.out.println("The sum is:"+sum);//display the result
    }
}