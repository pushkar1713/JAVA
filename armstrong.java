import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n=0,counter=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number : ");
        n = sc.nextInt();
        int temp = n;
        while(temp!=0){
            temp = temp/10;
            counter ++;
        }
        System.out.println(counter);
    }
    
}
