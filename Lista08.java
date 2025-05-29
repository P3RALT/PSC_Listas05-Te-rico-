/*

1. Faça um programa para imprimir: 
1 
2 2 
3 3 3 
..... 
n n n n n n ... n 
para um n informado pelo usuário.  
Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.

*/
package lista08;
import java.util.Scanner;
public class Lista08 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        
        System.out.print("Digite um Numero Inteiro:  ");
        int n = Ler.nextInt();
        Imprimir(n);
    }
    
    public static void Imprimir(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(i + " "); 
            }
            System.out.println();
        }
    
    }
    
}
