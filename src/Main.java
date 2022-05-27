import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1,number2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        number1 = input.nextDouble();
        System.out.print("Enter Second Number : ");
        number2 = input.nextDouble();
        System.out.println("Choose Operation \n1-Plus \n2-Minus \n3-Multiply \n4-Divide");
        int process = input.nextInt();

        switch (process) {
            case 1:
                System.out.println("Result = " + (number1+number2));
                break;
            case 2:
                System.out.println("Result = " + (number1-number2));
                break;
            case 3:
                System.out.println("Result = " + (number1*number2));
                break;
            case 4:
                if(number2!=0){
                    System.out.println("Result = " + (number1/number2));
                    } else {
                    System.out.println("Number is not divide by zero");
                    break;
                }
            default:
                System.out.println("You have not entered a valid process");


        }
    }
}
