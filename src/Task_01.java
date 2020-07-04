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
public class Task_01 {
    public static void main(String[] args) {
        int num; 
        double sum=0;
        double avg=0;// I am using Double as a data type becz in avg the
        double count=0; // answer may be upto some decimal places
        
        Scanner inu=new Scanner(System.in);
        int n=1;
        while (n<=10){
            System.out.print("Enter the number:");
            num=inu.nextInt();
            sum=sum+num;
            count++;   
            n++;
        }
        avg=sum/count;
        System.out.println("Avarage of 10 given numbers is="+avg);
        
    }
    
}
