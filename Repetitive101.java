package repetitive101;

import java.util.Scanner;

public class Repetitive101 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
       // enter number 
         System.out.println("Enter your number");
         //number to be guess
        int mag =100;
        System.out.println("Guess a number betweeen 0 - 1000");
        //default value
       int gam =-1;
       
         while(gam != mag){
             System.out.println("Guess a number: ");
             gam = sc.nextInt();
         
             if (gam == mag) {
                 System.out.println("correct number: ");
            }else if(gam>mag){
                 System.out.println("too high");
                 //System.out.println("The number is odd");
             }
             else{
                 System.out.println("too low");
             }
             //odd or even
             if(mag% 2==0){
                 System.out.println("number is even");
             }
             else{
                 System.out.println("number is odd");
             }
         }
    
    }}
