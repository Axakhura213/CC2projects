
package infinite_loops;


public class Infinite_Loops {

   
    public static void main(String[] args) {
        
        int a = 1;
        
        while(a>0){
            System.out.println("Values of a: " +a);
        }
        System.out.println("Value of a: " +a+ " is now more then or equal to 10");
        
        
        do{
            System.out.println("the value of a: "+a);
            a+=1;
       }while(a<15);
            System.out.println("less than of equal to "+a);
       for(a = a;a < 20; a++){
           System.out.println("value of a "+a);
        }
        System.out.println("equal to 20");
    }
    
}
