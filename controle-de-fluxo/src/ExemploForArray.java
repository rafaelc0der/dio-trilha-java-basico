public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Rafael", "Felipe", "João", "Ana", "Lucas", "Matheus"};
            for(int x = 0; x < alunos.length; x++){
                System.out.println("Aluno do índice x = " + x + " é " + alunos[x] + ".");
            }
        // Usando For/ each
            String alunos2[] = {"Rafael", "Felipe", "João", "Ana", "Lucas", "Matheus"};
            for(String aluno : alunos2){
                System.out.println("Nome do aluno é " + aluno);
            }

    }
}
