/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;
/**
 *
 * @author Stks
 */
public class IF110119042Latihan24 {
public static void main(String[] args){
    int nilai1,nilai2,nilai3;
    String pilihan;
    Scanner Scanner = new Scanner(System.in);
    System.out.println("======Program Perbandingan Nilai======");
    do{
        System.out.print("Masukan Nilai Pertama : ");
        nilai1 = Scanner.nextInt();
        System.out.print("Masukan Nilai Kedua : ");
         nilai2 = Scanner.nextInt();
         if (nilai1 < nilai2){
             System.out.printf("Hasil : %1$d Lebih kecil dari %2$d%n", nilai1,nilai2);
         }
         if (nilai1 > nilai2){
             System.out.printf("Hasil : %1$d Lebih besar dari %2$d%n", nilai1,nilai2);
         }
         if (nilai1 == nilai2){
             System.out.printf("Hasil : %1$d sama dengan %2$d%n", nilai1,nilai2);
    }
         System.out.print("\nUlangi Aktifitas? YA/TIDAK : ");
         pilihan =Scanner.next();
         System.out.println();
    }while (pilihan.equals("ya")|| pilihan.equals("YA"));     
}    
}
