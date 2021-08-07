package oficinahack02;
import java.util.Scanner;

public class OficinaHack02 {
//Autor:Murilo
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        
        float n1,n2,n3,n4,media;
        String nome;
        
        System.out.print("Digite o Seu Nome: ");
        nome = scan.nextLine();
        
        System.out.println("Digite a  Nota 1: ");
        n1 = scan.nextFloat();
                
        System.out.println("Digite a  Nota 2: ");
        n2 = scan.nextFloat();
                
        System.out.println("Digite a  Nota 3: ");
        n3 = scan.nextFloat();
                
        System.out.println("Digite a  Nota 4: ");
        n4 = scan.nextFloat();
                
        media = (n1+n2+n3+n4)/4;
        
        System.out.println(nome+" Teve a Média de "+media);
    }
}
