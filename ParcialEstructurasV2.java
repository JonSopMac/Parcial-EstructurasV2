
package com.mycompany.parcialestructurasv2;

 // @author Jonathan Cabrera

import java.util.Scanner;

public class ParcialEstructurasV2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [][] matriz=new String[2][2];
        
        
                System.out.println("Ingresa nu nombre: " );
                matriz[0][0]= in.nextLine();
                System.out.println("Ingresa su edad: ");
                matriz[0][1]= in.nextLine();
                System.out.println("Ingresa nu nombre: " );
                matriz[1][0]= in.nextLine();
                System.out.println("Ingresa su edad: ");
                matriz[1][1]= in.nextLine();
            
           
        System.out.println("");
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("\t\t\t"+matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}