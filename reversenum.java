import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("Input a number");
        n = sc.nextInt();
        int y = 0;
        int rev =0;
        while(n!=0){
            y = n%10;
            rev = y +rev*10;
            n=n/10;
        }
        System.out.println("The reverse is : "+rev);
        sc.close();
    }

    
}
