public class AboutMe {
    public static void main(String[] args) {
        
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá me chamo " + nome +" " + sobrenome);
        System.out.println("Minha idade é: " + idade + " anos");
        System.out.println("Minha altura é: " + altura + "m");

    }
}

/*Executar no terminal da IDE ou da máquina 
 * java nomeDaClasse arg0 arg1 arg2 arg3
 * Exemplo: java AboutMe Rafael Dias 10 1.74
 * Saída: 
 * Olá me chamo Rafael Dias
    Minha idade é: 31 anos
    Minha altura é: 1.74m
 * 
*/