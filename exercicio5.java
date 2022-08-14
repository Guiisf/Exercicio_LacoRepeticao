/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_lacorepeticao;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class exercicio5 {

    public static void main(String args[]) {
        System.out.print("Entre com o número: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {

            System.out.println((i + " elevado ao quadrado é ") + (Math.pow(i, 2)));
        }
    }
}
