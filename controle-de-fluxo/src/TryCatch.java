import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCatch {
    public static void main(String[] args) {
    try { 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        scanner.close();

        System.out.println("Seu nome é "+ nome.toUpperCase() +" "+ sobrenome.toUpperCase() +". Você tem "+idade +" anos e sua altura é "+ altura+ "m.");
    }
        
    catch(InputMismatchException e){
        System.out.println("Os campos altura e idade precisam ser numéricos.");}
    





}

}