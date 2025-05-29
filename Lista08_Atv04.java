/*
5. Faça um programa com função chamada somalimposto.
A função possui dois parametros: taxalImposto, que
é a quantia de imposto sobre vendas expressa em
porcentagem e custo, que é o custo de um item antes
do imposto. A Função "altera" o valor de custo
para incluir o imposto sobre vendas. 
*/

package lista08;
import java.util.Scanner;
public class Lista08_Atv04 {
    public static void main(String[] args){
      Scanner Ler = new Scanner(System.in);
        System.out.print("Digite o Custo do Item: ");
        double custo = Ler.nextDouble();
        
        System.out.print("Digite a Taxa do Imposto (%): ");
        double taxaImposto = Ler.nextDouble();
        
        double custoImposto = somaImposto(taxaImposto, custo); 
        
        System.out.println("Custo Final com imposto: R$ " + custoImposto);
    }
   
    public static double somaImposto(double taxaImposto, double custo){
        double imposto = (taxaImposto / 100) * custo; 
        return custo + imposto;
    }
}


