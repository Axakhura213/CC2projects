
package array;

import java.util.*;

public class Array {

    public static void main(String[] args) {
        System.out.println("even\t\t\todd");
        
        ArrayList ev = new ArrayList();
        ArrayList od = new ArrayList();
        
        int i;
        int[] numbers ={3,9,15,20,65,23,18,4,2,14,21};
        for(i = 0; i< numbers.length; i++){
            
            if(numbers[i] % 2 == 0){
                ev.add(numbers[i]);
            
            }else{
                od.add(numbers[i]);
                
            }
        }
            for(i = 0; i< numbers.length; i++){
                if(i>=ev.size() && i<od.size()){
                    System.out.println("\t\t\t"+od.get(i));
                  
                }
                else if(i>=od.size() && i<ev.size()){
                   System.out.println(ev.get(i));
                   
                }
                else if(i<od.size() && i<ev.size()){
                    System.out.println(od.get(i)+"\t\t\t"+ od.get(i));
                }
        } 
    }
    
}
