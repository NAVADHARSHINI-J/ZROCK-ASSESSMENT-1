import java.util.Scanner;

public class ifelse {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int v=sc.nextInt();
            if(v%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
}