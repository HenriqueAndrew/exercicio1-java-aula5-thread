package br.com.henriqueandrew.exercicio1;

// @author Henrique Andrew da Silva

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PulosLebres implements Runnable {

    Thread lebre;
    public static String[] colocacao = new String[5];
    static int indice = 0;

    PulosLebres(String nome) {
        lebre = new Thread(this, nome);
        lebre.start();
    }

    public void run() {
        System.out.println(lebre.getName() + " se prepara para o primeiro pulo...");
        int pulo;
        int qtPulo = 0;
        int mPercor;
        Random r = new Random();

        try {
            for (mPercor = 0; mPercor < 20;) {
                pulo = r.nextInt(4);
                if ((pulo > 0) && (pulo < 4)) {
                    qtPulo++;
                    mPercor = mPercor + pulo;
                    System.out.println("A " + lebre.getName() + " realizou o pulo número: " + qtPulo + " saltando: " + pulo + " metros");
                    Thread.sleep(350);

                }
                if (mPercor >= 20) {
                    System.out.println("A " + lebre.getName() + " atingiu: " + mPercor + " metros, realizando: " + qtPulo + " pulos");
                    classificacao();

                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(PulosLebres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void classificacao() {        
        colocacao[indice] = lebre.getName();
        indice++;
    }

}
