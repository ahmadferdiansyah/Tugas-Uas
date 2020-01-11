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

public class rekursif {
    public static void reamur(double X){
        System.out.println("Reamur = "+(4/5.0*X));
    }public static void farenheit(double X){
        System.out.println("Farenheit = "+(9/5.0*X));
    }public static void kelvin(double X){
        System.out.println("Kelvin = "+(273+X));
    }
    public static void main(String[]args){
        int C;
        Scanner suhu = new Scanner(System.in);
        System.out.print("Celcius = ");C=suhu.nextInt();
        
        reamur(C);
        farenheit(C);
        kelvin(C);
    }
}
