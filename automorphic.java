import java.lang.Math.*;
import java.util.*;
public class automorphic {
    public static void main(String[] args) {
        int temp = 0, counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number : ");
        int n = sc.nextInt();
        temp = n;
        while(temp!=0){
            temp = temp/10;
            counter ++;
        }
        int sqr = n*n;
        if(sqr%Math.pow(10, counter)==n){
            System.out.println("The number is automorphic");
        }
        else
        System.out.println("Th number is not automorphic");
         sc.close();   
    }
    
}
