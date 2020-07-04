


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
public class Task_05 {
        public static void main(String[] args) {        
        boolean  B = false;
        Scanner inu=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=inu.nextInt();
        for(int i = 2; i <= num/2; i++)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                B = true;
                break;
            }
        }

        if (!B)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
    
}