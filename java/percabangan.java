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

public class percabangan {
    public static void main(String[]args){
        Scanner nilai = new Scanner(System.in);
        System.out.print("Input nilai = ");
        int Nilai;
        Nilai = nilai.nextInt();
        System.out.print("Nilai kamu = ");
        if (Nilai <= 90){
            System.out.print("A");
        }else if (Nilai <= 80){
            System.out.print("A-");
        }else if (Nilai <= 70){
            System.out.print("B");
        }else{
            System.out.print("C");
        }
        
        }
        
    }
