import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0,r=0,temp;
        System.out.println("Input a number : ");
        n = sc.nextInt();
        temp = n;
        int y=0;
        while(temp!=0){
            y=temp%10;
            r = y + r*10;
            temp=temp/10;
        }
        if(r==n)
        System.out.println("The number is palindrome");
        else
        System.out.println("The number is not palindrome");
    }
    
}
