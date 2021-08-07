
package oficinahack03;

import java.util.Scanner;

public class OficinaHack03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n1, n2,soma,subtracao,multiplicacao;
        float divisao;
        
        
                
        System.out.print("Digite o Primeiro Numero: ");
        n1 = scan.nextInt();
        
        System.out.print("Digite o Primeiro Numero: ");
        n2 = scan.nextInt();
        
        soma = n1+n2;
        subtracao = n1-n2;
        multiplicacao = n1*n2;
        divisao = n1/n2;
        
        System.out.println("A soma de "+n1+" + "+n2+" = "+soma);
        
        System.out.println("A Subtração de "+n1+" - "+n2+" = "+subtracao);
        System.out.println("A Multiplicação de "+n1+" * "+n2+" = "+multiplicacao);
        System.out.println("A Divisão de "+n1+" / "+n2+" = "+divisao);
                
    }
    
}
