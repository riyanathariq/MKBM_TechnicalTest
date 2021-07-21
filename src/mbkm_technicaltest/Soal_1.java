/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbkm_technicaltest;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Soal_1 {
    public static void main(String[] args) {
        int angka;
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan input angka : ");
            angka = input.nextInt();
            if  ( angka % 3 == 0 && angka % 5 == 0) {
                System.out.println("Hello World");
            }else if( angka % 5 ==0 ){
                System.out.println("World");
            }else if (angka % 3 ==0) {
                System.out.println("Hello");
            }
    }
}
