public class PlanoOperadora {
    public static void main(String[] args) {
        /*
         * BACIC = B => 100 minutos de ligação
         * MIDIA = M => 100 minutos de ligação + Whatsapp e Instagram grátis
         * TURBO = T => 100 minutos de ligação + Whatsapp e Instagram grátis + 5Gb
         * Youtube
         */
        // String plano = "M";

        // if (plano == "B")
        //     System.out.println("100 minutos de ligação");
        // else if (plano == "M") {
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whatsapp e Instagram grátis");
        // } else if (plano == "T") {
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whatsapp e Instagram grátis");
        //     System.out.println("5Gb Youtube");
        // }

        String plano = "M";

        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
            case "M":
                System.out.println("Whatsapp e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
        }

    }
}
