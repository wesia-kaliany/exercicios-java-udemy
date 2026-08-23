/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiro_projeto;

import java.util.Locale;

/**
 *
 * @author kalianyww
 */
public class Program {

    public static void main(String[] args) {
        
        
       String nome = "Carla";
       int idade = 43;
       Double renda = 4000.0;
       double x = 10.35784;
       System.out.println(x);
       System.out.printf("%.2f\n", x);
       System.out.printf("%.4f\n", x);
       Locale.setDefault(Locale.US);
       System.out.printf("%.4f\n", x);
       System.out.println("RESULTADO = " + x + "METROS");
       System.out.printf("RESULTADO = %.2f metros %n", x);
       System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    
    }
}

