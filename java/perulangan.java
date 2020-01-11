/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad ferdi
 */
import java.util.Scanner;

public class perulangan {
    public static void main(String[]args){
        int i, M;
        Scanner Ulang = new Scanner(System.in);
        System.out.print("Berapa angka = ");M = Ulang.nextInt();
        
        for(i=1;i<M;i=i+2){
            System.out.println(i+" = ganjil");
            System.out.println((i+1)+" = genap");
        }
            if (M%2 !=0)
                System.out.print(M+" = Ganjil");
                }
}