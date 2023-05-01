import java.util.Scanner;

public class Assignment_1_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Input 2 Number : ");
        a = sc.nextInt();
        if(a%2==0){
            System.out.println("THE NUMBER IS EVEN");
        }
        else{
            System.out.println("THE NUMBER IS ODD");
        }
        sc.close();
    }
}
