/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
import java.util.Scanner;
public class Task_02 {
    public static void main(String[] args) {
        int num;
      
       
        int count_even=0; 
        int count_odd=0; 
        int n=1;
        Scanner inu=new Scanner(System.in);
        while (n<=10){
            System.out.print("Enter the number:");
            num=inu.nextInt();
            if (num%2==0){
                count_even++;
            }
            else {
                count_odd++;
            }   
            n++;
        }
        System.out.println("User enter "+count_even+" times even number.");
        System.out.println("User enter "+count_odd+" times odd number.");
        
    }
    
}

