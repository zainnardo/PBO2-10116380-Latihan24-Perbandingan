/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan24.perbandingan;

import java.util.Scanner;

/**
 * @author 
 * NAMA: Zain Achamd Rizqullah
 * KELAS: PBO2
 * NIM: 10116380
 * Deskripsi: Program Perbandingan 2 Nilai
 */
public class PBO210116380Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         int value1;
        int value2;
        String ngulang;

        Scanner value = new Scanner(System.in);

        System.out.println("====== Program Perbandingan Nilai =====");
        do {
            System.out.print("Masukkan Nilai Pertama\t : ");
            value1 = value.nextInt();
            System.out.print("Masukkan Nilai Kedua\t : ");
            value2 = value.nextInt();

            System.out.print("Hasil\t : ");
            if (value1 > value2) {
                System.out.println(value1 + " lebih besar dari " + value2);
            } else if (value1 == value2) {
                System.out.println(value1 + " sama dengan " + value2);
            } else if (value1 < value2) {
                System.out.println(value1 + " lebih kecil dari " + value2);
            }
            System.out.println("");
            System.out.print("Ulangi aktivitas diatas? (Ya/Tidak)\t : ");
            ngulang = value.next();

        } while (ngulang.equals("Ya"));
    }
    
}
