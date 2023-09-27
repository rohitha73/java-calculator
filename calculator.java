import java.util.Scanner;

class main{
     public static void main(String[] args) {
        char operator;
        double value1, value2, result;

        //create a object for a scanner class
        Scanner input = new Scanner(System.in);

        //user input for the first value
        System.out.println("Enter your first value: ");
        value1 = input.nextDouble();

        //user input for the seconed value
        System.out.println("Enter your seconed value: ");
        value2 = input.nextDouble();

        //user input for the operator
        System.out.println("Choose your operator: ");
        operator = input.next().charAt(0);


        //operator
        switch(operator){
            
            //addition operator
            case '+':
            result = (value1 + value2);
            System.out.println(value1 + " + " + value2 + " = " + result);
            break;

            //substract operator
            case '-':
            result = (value1 - value2);
            System.out.println(value1 + " - " + value2 + " = "  + result);
            break;

            //multiplacation operator
            case '*':
            result = (value1 * value2);
            System.out.println(value1 + " * " + value2 + " = " + result);
            break;

            //divison operator
            case '/':
            result = (value1 / value2);
            System.out.println(value1 + " / " + value2 + " = " + result);
            break;

            default:
            System.out.println("Invalid operator!");
            break;

        }

     input.close();
    }

}