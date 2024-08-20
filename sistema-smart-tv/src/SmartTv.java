public class SmartTv {

    boolean ligada = false;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    int canal = 1;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal " + canal);

    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal " + canal);
    }

    int volume = 1;

    public void aumentarVolume() {
        volume++;
        if (volume > 5) {
            volume--;
            System.out.println("Volume Máximo");
        }
    }

    public void diminuirVolume() {
        volume--;
        if (volume < 0) {
            volume++;
            System.out.println("MUDO");
        }
    }

}
