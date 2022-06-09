import java.util.*;

public class Loops {
    public static void main (String[] args) {
        //for loop example
        //Print hello world three times
        // initializer,  Condition,  updation
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello world");
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        //while loop
//        int i = 0;
//        while (i < 11) {
//            System.out.println(i);
//            i = i + 1;
//        }

       // Do while loop method
//        int i=3;
//        do {
//            System.out.println("apna college");
//            i++;
//        }
//        while (i <= 11);

      //  Loops with while method

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int sum = 0;
//        for (int j = 1; j <= n; j++) {
//
//            sum = sum + j;
//        }
//        System.out.println(sum);

        //To print multiplication table of given number
//        int number = scanner.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println(i*number);
//        }

//        for(int i = 0; i<=n; i++ ){
//
//           if (i%2==0){
//               System.out.println(i);
//           }
//
//        }


            // Give the result response to the user.
//        do {
//            int marks = scanner.nextInt();
//            if(marks >= 90 && marks <= 100) {
//                System.out.println("This is Good");
//            } else if(marks >= 60 && marks <= 89) {
//                System.out.println("This is also Good");
//            } else if(marks >= 0 && marks <= 59) {
//                System.out.println("This is Good as well");
//            } else {
//                System.out.println("Invalid");
//            }
//            System.out.println("Want to continue ? (yes(1) or no(0))");
//            n = scanner.nextInt();
//        } while(n == 1);

//      Prime number
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            if(n == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }

    }
}
