/*
 4. Faça um programa, com uma função que necessite de um argumento. 
A  função retorna o valor de caractere ‘P’, se seu 
argumento for positivo, e ‘N’, se  seu argumento for zero ou negativo. 
 */
package lista08;
import java.util.Scanner;
public class Lista08_Atv03 {
    public static void main (String[] args){
        Scanner Ler = new Scanner(System.in);
        
        System.out.print(" Digite um Numero Inteiro: ");
        int num = Ler.nextInt();
        char resultado = verifica(num);
        
        System.out.println("Resultado: - " + resultado);
    }
    
    public static char verifica(int a){
        if(a > 0){
            return 'p';
        } else {
            return 'n'; 
        }
    
    }
}
