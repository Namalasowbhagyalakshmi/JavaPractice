import java.util.Scanner;
public class intro{
    public static void main(String[]args){
        System.out.println("HEllO WORLD");
        float a=7;
        int b;
        b=(int)a;
        System.out.println(a);
        System.out.println(b);

        // using scanner class to input something
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the p and q values");
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(p*q);


        
    }
}