public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7)
        System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7)
        System.out.println("Recuperação");

        else
        System.out.println("Reprovado");


        int nota1 = 4;
            String resultado = nota1 >= 7 ? "Aprovado" : nota1 >= 5 && nota1 < 7 ? "Recuperação" : "Reprovado";
            System.out.println(resultado);
        
        
    }       
        

}


