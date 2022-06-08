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