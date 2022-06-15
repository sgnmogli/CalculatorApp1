
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) 
	{
		 Add obj = new Add();
		 Subtract obj2 = new Subtract();
		 Divide obj3 = new Divide();
		 Multiply obj4 = new Multiply();
		  int num1;
	      int num2;
	      char op;
	      Scanner reader = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      num1 = reader.nextInt();
	      num2 = reader.nextInt();
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      op = reader.next().charAt(0);
	      switch(op) {
	         case '+': obj.add(num1,num2);
	            break;
	         case '-': obj2.subtraction(num1,num2);
	            break;
	         case '*': obj4.multiply(num1,num2);
	            break;
	         case '/': obj3.divide(num1,num2);
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      

		
		

	}

}
