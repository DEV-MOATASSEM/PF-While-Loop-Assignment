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
public class Task_04 {
    public static void main(String[] args) {

        int fact=1;
        Scanner inu=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=inu.nextInt();
        for (int i=num;i>=1;i--){
            fact=fact*i;           
        }
        System.out.println("Factorial of "+num+" is="+fact);
    }
    
}
