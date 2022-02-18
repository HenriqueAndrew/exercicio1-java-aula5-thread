package br.com.henriqueandrew.exercicio1;

// @author Henrique Andrew da Silva
public class CorridaLebres {

    public static void main(String[] args) {
        System.out.println("======CORRIDA DE LEBRES=====\n\n");

        System.out.println("Dado a largada!!!\n\n");

        PulosLebres lebre1 = new PulosLebres("Lebre 1");
        PulosLebres lebre2 = new PulosLebres("Lebre 2");
        PulosLebres lebre3 = new PulosLebres("Lebre 3");
        PulosLebres lebre4 = new PulosLebres("Lebre 4");
        PulosLebres lebre5 = new PulosLebres("Lebre 5");

        try {
            lebre1.lebre.join();
            lebre2.lebre.join();
            lebre3.lebre.join();
            lebre4.lebre.join();
            lebre5.lebre.join();
            System.out.println("\nCorrida encerrada");
            System.out.println("\n===Classificação Final===");
            int p = 1;
            for (int i = 0; i < 5; i++) {
                String x = PulosLebres.colocacao[i];
                System.out.println("A " + x + " ficou em: " + p + " Lugar");
                p++;
            }

        } catch (InterruptedException exc) {
            System.out.println("Corrida interrompida");

        }
    }

}
