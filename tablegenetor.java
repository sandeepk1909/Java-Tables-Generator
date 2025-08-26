import java.util.Scanner;

public class tablegenetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num =sc.nextInt();
        for(int i =1; i<=10; i++){
            System.out.println(num +" * " + i +" = " +(num * i));
        }
            System.out.println("Using the while loop here...!");
    
        int k =1;
        while(k<=10){
        System.out.println(num +" * " + k +" = " +(num * k));
         k++;
        }
        
        sc.close();
    }
}
