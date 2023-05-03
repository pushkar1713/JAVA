import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int i=0,j=0,n=0;
        char ch = 'a';
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        n = sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.printf(" %c ",ch +j);
            }
            System.out.print('\n');
        }
        sc.close();
    }
    
}
