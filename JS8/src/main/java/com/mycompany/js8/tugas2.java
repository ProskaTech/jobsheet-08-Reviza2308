// Created by 213431_Muhammad Reviza Dekry 
package com.mycompany.js8;

/**
 *
 * @author Revsky
 */
import java.util.Scanner;

public class tugas2 {
    public static void main(String args[]){
        Scanner dataIn = new Scanner (System.in);
        
        int [] a = new int [10];
        int bnykData = 10, angkaBsr, i;
        
        System.out.println("Masukkan 10 angka : ");
        for(i = 0; i < bnykData; i++){
            a[i] = dataIn.nextInt();
        }
        System.out.println();
        
        angkaBsr = a[0];
        
        for(i = 0; i < bnykData; i++){
            if(a[i] > angkaBsr){
                angkaBsr = a[i];
            }
        }
        System.out.println("Angka Terbesar : "+angkaBsr);
        
    }
}
