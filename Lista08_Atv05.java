/*
Faça um programa que converta da notação de 24horas
para a notação de 1 horas. Por exemplo, o programa
deve converter 14:25 em 2:25 P.M. A entrada é dada
em dois inteiros. Deve haver pelo menos duas funções:
Uma para fazer a conversão e uma apra a saida. Registre
a Informação A.M/P.M. Como um valor 'A' para A.M e 'P' 
para P.M. Assim. a função para efeturar as conversões
terá um parâmetro formal para registrar se é A.M ou P.M
inclua um loop permita que o usuario repita esse calculo para
novos vlaores de entrada todas as vezes que desejar. 
 */

package lista08;
import java.util.Scanner;
public class Lista08_Atv05 {
    
    public static void main(String[] args){
       Scanner Ler = new Scanner(System.in);
       char repetir; 
       
/* Do com while server pra repetir se o cliente quiser
repetir */ 

      do {
          System.out.println("Digite a Hora: ");
          int hora = Ler.nextInt();
          
          System.out.println("Digite os Minutos: ");
          int minuto = Ler.nextInt();
          
          char am_pm; 
          int horaConvertida = ConverterHora(hora);
         
          
          /* ---- FUNÇÃO -------*/
          am_pm = DefinirAMPM(hora);
          MostrarHora(horaConvertida, minuto, am_pm);
          
          System.out.println("\nDeseja Converter Outro Horario? (s/n): ");
          repetir = Ler.next().charAt(0);
    } while (repetir == 's' || repetir == 'S');  }
    
    public static int ConverterHora(int hora24){
        if (hora24 == 0){
            return 12; 
        } else if (hora24 > 12){
            return hora24 - 12;
        } else { return hora24; } }
    
    public static char DefinirAMPM(int hora24){
        if (hora24 < 12 ){ 
            return 'A'; 
        } else {
            return 'P'; 
        } }
 
    public static void MostrarHora(int hora, int minuto, char am_pm) {
    String periodo = (am_pm == 'A') ? "A.M." : "P.M."; 
        System.out.printf("Horario convertido %d:%02d %s\n", hora, minuto, periodo);
    }
    
}