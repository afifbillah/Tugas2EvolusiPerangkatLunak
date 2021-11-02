/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;
import java.util.Scanner;
/**
 *
 * @author COMPAQ
 */
public class PengujianSegitiga90486 {
    public static void main(String[] args){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan ketiga panjang sisi segitiga : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if (Math.pow(c,2) < Math.pow(a,2) + Math.pow(b,2)){
            System.out.println("Segitiga Lancip");
        } else if (Math.pow(c,2) > Math.pow(a,2) + Math.pow(b,2)){
            System.out.println("Segitiga Tumpul");
        }else {
            System.out.println("Segitiga Siku-Siku");
        }
        
    }
}
