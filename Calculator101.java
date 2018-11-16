
package calculator101;

import java.util.*;

public class Calculator101 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Calculator");
        System.out.println(" ");
        System.out.println("First input");
        double user2 = sc.nextInt();
        System.out.println("Second input");
        double user3 = sc.nextInt();

        System.out.println("Please choose arithmetic operator: ");
        String jps = sc.nextLine();
        String ops = sc.nextLine();

        if ((ops.equals("+")) || (ops.equals("add"))){ 
            System.out.println("Sum is: " + (user2 + user3));
            
        } else if ((ops.equals("-")) || (ops.equals("subtraction"))) {
            System.out.println("difference is: " + (user3 - user2));
        } else if ((ops.equals("*")) || (ops.equals("multiplication"))) {
            
            System.out.println("product is: " + (user2 * user3));
        } else if ((ops.equals("/")) || (ops.equals("divition"))) {
            
            System.out.println("quotient is: " + (user2 / user3));
            
        } else if ((ops.equals("%")) || (ops.equals("modulo"))){
            System.out.println("modulo is: " + (user2 % user3));
            
           }else {
            System.out.println("Invalid");
        }    
        
    }
    
}
