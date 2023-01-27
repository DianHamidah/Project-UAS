/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastack1;

/**
 *
 * @author dian nurdiani
 */

public class Array.java {
    public static void ma in(String[] args) {
        int [] bil = {2, 4, 10, 11, 13, 16, 19, 200, 45, 23, 89, 111};
        System.out.print("Bilangan Genap  :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }      
        System.out.println("");
    }
}
