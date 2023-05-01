import java.util.Scanner;

public class FACT {
    public static void main(String[] args) {
        int fact = 1; int n=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        n = sc.nextInt();    
        for(i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("The factorial is : "+fact);
        sc.close();
    }
    
}
