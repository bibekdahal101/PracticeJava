import java.util.*;
import java.util.concurrent.ScheduledExecutorService;

public class Addition {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum= a+b;
        System.out.println("Your sum is "+ sum);
    }
}

class Exam{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        float Math = scanner.nextInt();
        float English= scanner.nextInt();
        float Science= scanner.nextInt();
        float Sum= Math+English+Science;
        float Percent= Sum/300*100;
        System.out.println(Percent);
    }
}