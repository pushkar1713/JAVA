import java.util.*;

public class Assignment_1_Q7 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int[] numbers = new int[3];
     System.out.println("Input 3 Numbers");
     for(int i=0;i<3;i++){
        numbers[i]=sc.nextInt();
     }
     int max = numbers[0];
     for(int i=0;i<3;i++){
        if(max < numbers[i]){
            max = numbers[i];
        }
     }
     System.out.println("The Largest number is : "+ max);

    }
}