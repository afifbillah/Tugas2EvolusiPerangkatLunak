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
public class DeretKelipatan490486 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int banyak;
       
        System.out.print("Banyak deret :");
        banyak = scan.nextInt();
        
        int[] deret = new int[banyak];
        
        for(int i=0; i < banyak; i++){
            deret[i] = i*4+2;
        }
        for(int i : deret){
        System.out.print(i);
        System.out.print(" ");
    }
        System.out.println();
    }
}
