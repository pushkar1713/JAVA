import java.util.Scanner;

public class Assignment_1_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("INPUT A NUMBER : ");
        a = sc.nextInt();
        if(a>0)
        System.out.println("THE NUMBER IS POSITIVE");
        else if(a==0)
        System.out.println("THE NUMBER IS ZERO");
        else
        System.out.println("THE NUMBER IS NEGATIVE");
        sc.close();
    }
}
