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

public class sekuen {
    public static void main(String[]args){
        Scanner detik = new Scanner(System.in);
        int D, H, J, M;
        System.out.print("Masukan detik = ");
        D = detik.nextInt();
        H = D / 86400;
        D = D % 86400;
        J = D / 3600;
        D = D % 3600;
        M = D / 60;
        D = D % 60;
        
        System.out.print("Detik = "+H+" hari +"+J+" jam+"+M+" menit");
        }
    }