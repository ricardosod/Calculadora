/*
8/Permitir que usuários cadastrassem o nome de usuário (login) no sistema, do processo antigo paro o novo.
 O usuário não pode deixar  o login vazio "", ou criar um usuário com o login "admin" ou "administrador".
Senão o sistema deverá mostrar o erro "usuário inválido".
 */


import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = input.next();
        if(nome.equalsIgnoreCase("admin")  || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário inválido");
        }else{
            System.out.println(nome + " Cadastrado com Sucesso");
        }


    }
}
