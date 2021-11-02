/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;
import java.util.Scanner;
/**
 *
 * @author COMPAQ
 */
public class cekAngka90486 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan Angka :");
        angka = scan.nextInt();
        
        while(angka > 0){
            angka = angka - 2;
        }
        
        System.out.println(angka);
        
        if(angka == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
}
