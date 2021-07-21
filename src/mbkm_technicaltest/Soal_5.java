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
public class Soal_5 {
    public static void main(String args[]) {
    String huruf,   hasil = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan sebuah string: ");
    huruf = scanner.nextLine();
    System.out.print("Masukkan sebuah string untuk di cek: ");
    String cek = scanner.nextLine();
    int jumlah = huruf.length();
    int jumlahHuruf = jumlah - 1;
    for (int i = 0; i < jumlah; i++) {
      hasil = hasil + huruf.charAt(jumlahHuruf);
      jumlahHuruf--;
    }
        if (hasil==cek) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
  }
}
