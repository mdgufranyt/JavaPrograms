import java.util.*;

public class Loop {
    public static void main (String args[]){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter the Number : ");
            int n = sc.nextInt();
  
            System.out.println("Table of Entered Number ");
            
            for(int i = 1; i<=10; i++){
                
                System.out.println(n*i);

            }
        }
        
    }

    
}
