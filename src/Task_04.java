/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *3
 * @author MOATASSEM SINDHU
 */
import java.util.Scanner;
public class Task_04 {
    public static void main(String[] args) {

        int fact=1;
        Scanner inu=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=inu.nextInt();
        int i=num;
        while (i>=1){
            fact=fact*i;  
            i--;
        }
        System.out.println("Factorial of "+num+" is="+fact);
    }
    
}
