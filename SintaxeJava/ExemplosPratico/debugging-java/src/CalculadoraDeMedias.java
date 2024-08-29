import java.util.Scanner;
public class CalculadoraDeMedias {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String[] alunos = {"Camila", "Lucas", "Bruna", "Rafael"};

       double media = calcularMediaDaTurma(alunos, scanner);
       System.out.printf("A média da turma é %.1f", media);
    }
    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s:", aluno);
            double nota= scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }

}