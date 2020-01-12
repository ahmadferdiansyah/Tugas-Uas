/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobjek;

/**
 *
 * @author ahmad ferdi
 */
public class Kalkulatortester {
    public static void main(String[]args){
        Kakulator ferdi = new Kakulator();
        ferdi.isiOperan1(20);
        ferdi.isiOperan2(6);
        
        System.out.println("Tambah = "+ferdi.tambah());
        System.out.println("Kurang = "+ferdi.kurang());
        System.out.println("Kali = "+ferdi.kali());
        System.out.println("Bagi = "+ferdi.bagi());
        System.out.print("Pangkat = "+ferdi.pangkat());
    }
}
