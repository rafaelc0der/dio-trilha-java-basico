import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("Tocando...");
        }
        while(tocando());
        System.out.println("Alo!!!");
    }

public static boolean tocando(){
    boolean atendeu = new Random().nextInt(3)==1;
    System.out.println("Atendeu? " + atendeu);
    // negando o ato de tocar
    return ! atendeu;
}
}
