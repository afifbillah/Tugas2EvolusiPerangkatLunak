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
public class InputProgram90486 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("INPUT");
        System.out.println("Masukkan Nama : ");
            String nama = scan.nextLine();
        System.out.print("Masukkan Umur : ");
        int umur = scan.nextInt();
        
        System.out.println("\nOUTPUT");
        System.out.println("Nama : " + nama);
        System.out.print("Umur :");
        System.out.println(umur);
    }
}
