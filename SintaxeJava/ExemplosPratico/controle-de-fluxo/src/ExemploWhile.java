import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
            while(mesada > 0){
                double valorDoce = valorAleatorio();
                if(valorDoce > mesada)
                    valorDoce = mesada;

                System.out.println("Doce no valor" + valorDoce + " Adicionado ao carrinho.");
                mesada = mesada - valorDoce;
                }

        System.out.println("Joãozinho gastou toda a sua mesadda");
        System.out.println("Mesada " + mesada);
    }

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}