//Autor: Murilo Ahori

package oficinahack01;

import java.util.Scanner;

public class OficinaHack01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;
    
        System.out.print("Digite o Seu Nome: ");
        nome = scan.nextLine();
        
        System.out.print("Digite a sua Idade: ");
        idade = scan.nextInt();
        
        System.out.print("Ola "+nome+", Seja Bem Vindo você tem "+idade+" anos");
        
    }
    
    
}
