/*
3. Faça um programa, com uma função que necessite 
de três argumentos, e que  forneça a soma desses três argumentos

 */
package lista08;
import java.util.Scanner;

public class Lista08_Atv02 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        int [] num = new int[3]; 
        
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1) + "° - Digite Numero Inteiro: ");
            num[i] = Ler.nextInt();
        }
        
        soma(num[0], num[1], num[2]);
        
    }
    
    public static void soma(int a, int b, int c){
            int resultado = a+b+c;
            System.out.println("Soma dos Numeros: " + resultado);  }
    
}
