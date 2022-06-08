import java.util.*;

public class ConditionalStatement {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y =2;
        if (x%y==0){
            System.out.println("The Number is even");
    }
        else {
            System.out.println("The number is odd");
        }
    }
}

class Compare{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a==b){
            System.out.println("Both are equal");
        }

        else if (a > b) {
            System.out.println("A is greater than B");
        }
        else {
            System.out.println("B is greater");
        }
    }
}

class Greetings{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

    //with if else
//        if (num ==1){
//            System.out.println("Hello");
//        }
//
//        else if (num ==2){
//            System.out.println("Namaste");
//        }
//        else {
//            System.out.println("Bonjour");
//        }

        //with switch
        switch (num){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}

class Calculator {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result;
        char operator = scanner.next().charAt(0);

        if (operator == '*'){
            result= a*b;
            System.out.println(result);
        }
        else if (operator == '/'){
            result= a/b;
            System.out.println(result);
        }
        else if (operator == '+'){
            result= a+b;
            System.out.println(result);
        }
        else if (operator == '-'){
            result= a-b;
            System.out.println(result);
        }
        else {
            System.out.println("Invalid command");
        }

    }
}

class MonthSwitch{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//New latest way to implement switch.
        switch (num) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid input");
        }
    }
}