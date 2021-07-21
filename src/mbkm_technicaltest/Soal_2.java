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
public class Soal_2 {
    public static void main(String[] args) {
        String email;
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan email : ");
            email = input.nextLine();
        String pattern1 = "[a-zA-Z0-9._-]+@[a-z]+\\\\.+[a-z]+";
        String pattern2 = "[a-zA-Z0-9._-]+@[a-z]+\\\\.+[a-z]+\\\\.+[a-z]+";
        
        if (email.matches(pattern1)){
            System.out.println("Email Valid");
        }else if (email.matches(pattern2)){
            System.out.println("Email Valid");
        }else{
            System.out.println("Email Tidak Valid");
        }
        
    }
}
