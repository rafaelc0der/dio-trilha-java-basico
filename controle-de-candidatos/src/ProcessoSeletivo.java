import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }

           }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }
        while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO O CANDIDATO "+ candidato + " NA "+tentativasRealizadas +" TENTATIVA.");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " +candidato + " COM O NÚMERO MÁXIMO DE "+tentativasRealizadas+" TENTATIVAS.");
        }

    }
    // método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionado(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("IMPRIMINDO A LISTA DE CANDIDATOS");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("Candidato de número " +(indice+1)+ " é " +candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado é " + candidato);
        }
    }

    

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.print("O candidato solicitou o salário de: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " +candidato+" foi selecionado." );
                candidatosSelecionados++;
                
            }
            candidatoAtual++;
        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGA PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}