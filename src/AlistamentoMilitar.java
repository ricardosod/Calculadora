/*
8/Gostaria que meu sistema de cadastramento militar aceitasse os seguintes parâmetros:
Se o sexo for Masculino e a idade for maior ou igual a 18, o sistema deve imprimir alistamento obrigatório.
Se o sexo for Masculino e a idade for menor que 18, o sistema deve imprimir alistamento não permitido.
Se o sexo for Feminino e a idade for maior ou igual a 18, o sistema deve perguntar se a pessoa deseja se alistar.
Se o sexo for Feminino e a idade for menor que 18, o sistema deve imprimir, alistamento não permitido.
 */
// cagada
    

    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 18;

        if ((sexo == 'M' || sexo == 'F') && idade < 18){
            System.out.println("Alistamento não Permitido");
        }else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento Obrigatório");
        }else if(sexo == 'F' && idade >=18){
            System.out.println("Deseja se Alistar");
        }
    }
}
