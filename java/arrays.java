/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ahmad ferdi
 */


public class arrays {
    public static void main(String[] args) {
    int [] angka = new int [20];
    int kuadrat;
    for ( int i=0;i<angka.length; i++){
        angka[i] = i+1;
    }
    for(int i = 0;i<angka.length; i++){
        if (angka[i]%2 !=0){
        kuadrat = angka [i] * angka [i];
        System.out.println(angka[i]+"kuadrat = "+kuadrat);
     }
    }
    }
}
