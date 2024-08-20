public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        // LIGAR E DESLIGAR TV
        smartTv.ligar();
        System.out.println("A tv está ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("A tv está ligada? " + smartTv.ligada);


        // AUMENTAR VOLUME 
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);


        // DIMINUIR VOLUME 
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
        
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(13);



    }
}
