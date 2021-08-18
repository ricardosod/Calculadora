import java.util.Scanner;

public class TorneiodeNatacao {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = input.next();
        System.out.println("Digite a idade: ");
        int idade = input.nextInt ();
        if (idade <= 10) {
            System.out.println(nome + " categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " categoria Juvenil");
        }else if( idade >= 16 && idade <= 19){
            System.out.println(nome + " categoria Pré-adulto");
        }else{
            System.out.println(nome + " categoria Adulto");
        }
    }
}
