package finals1;

import java.util.*;

public class Finals1 {

   public static void main(String[] args) {     
      display();
            
    }
    public static void display(){
        Scanner sc = new Scanner(System.in);  
            String error = "error";
            while(!"good".equals(error)){
                
                    System.out.println("What do you want to get? fac/fib"); 
                    String choice = sc.nextLine();
        
                    if (choice.equals("fac")) {
                        error = "good";
                        fact();
                    } else if (choice.equals("fib")) {
                        error = "good";
                        fib();
                    }else{
                        System.out.println("Invalid Input");
                    }  
            }    
            
    }
    public static void fact(){
          Scanner sc = new Scanner(System.in);
          System.out.print("Please enter the index for the array: ");
            int esn = sc.nextInt();
  
            int ars[] = new int[esn];
                System.out.println("Please enter the elements for the array: ");
                for(int i = 0; i<esn; i++ ){
                    int els = sc.nextInt();
                    ars[i] = els;
                    
                }
            System.out.print("ELEMENTS: \t");
            for(int i =0;i<esn; i++ ){
                    System.out.print(ars[i]+"\t");
            }
            
            System.out.print("\n"
                    + "FAC:\t\t");    
            fac(ars);
                  
    }
    
    public static int[] fac(int[] ars){
        
        for(int i = 0; i<ars.length;i++){
                int fac = 1;
                for(int j = 1; j<=ars[i]; j++){
                    fac = fac*j;
                }
                ars[i] =fac;
                System.out.print(ars[i]+"\t");
            }
          
        return ars;
    }
    
    public static void fib(){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the index for the array: ");
        int esn = sc.nextInt();
        
        int ars[] = new int[esn];
        System.out.println("Please enter the elements for the array: ");
        for(int i = 0;i<esn;i++){   
            int els = sc.nextInt();
            ars[i] = els;
        }
        
        System.out.print("INDEX:\t");
        for(int i = 0; i <esn; i++){
            System.out.print("\tF("+i+"): \t");
        }
        System.out.print("\nELEMENTS: ");
        for(int i = 0; i <esn; i++){
            System.out.print("\t"+ars[i]+ "\t");
        }
        System.out.print("\nFIBUNACCI:");
        for(int i = 0; i< esn; i++){
            System.out.print("\t"+ fib(ars[i])+"\t");
        }
        
    }
    public static int fib(int n){
        if(n <=1){
            return n;
        }else
            return fib(n-1)+ fib(n-2);
    }
    
    
    
    
}