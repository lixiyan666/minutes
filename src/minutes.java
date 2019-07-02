import java.util.Scanner;

public class minutes {
    public static void main(String [] args){
        Scanner myreader = new Scanner (System.in);
        int age=myreader.nextInt();
        int m=12*age;
        int d=30*m;
        int h=60*d;
        int s=60*h;
        System.out.print("min:"+s);
        System.out.print("hour:"+h);
        System.out.print("day:"+d);
        System.out.print("month:"+m);

    }
}
