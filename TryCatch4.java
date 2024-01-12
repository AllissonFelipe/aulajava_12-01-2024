import java.util.*;

public class TryCatch4 {
    
    public static void tempoDoFilme(int tempoCond) {
        if (tempoCond < 3) {
            System.out.println("Filme rodando.");
        } else {
            throw new ArithmeticException("Filme Acabou.");
        }
    }
    public static void main(String[] args){
        int tempoTotal = 3;
        int tempoMin = 0;
        int tempoSeg = 0;

        while (tempoMin < tempoTotal) {
            try {
                tempoSeg++;
                if (tempoSeg == 60) {
                    tempoMin++;
                    tempoSeg = 0;
                    tempoDoFilme(tempoMin);
                }
            } catch (ArithmeticException e) {
                Scanner scnSair = new Scanner(System.in);
                System.err.println(e.getMessage() + " Espero que tenha gostando da experiencia.");
                scnSair.nextLine();
                scnSair.close();
            } finally {
                System.out.println("Minutos: "+tempoMin+" Segundos: "+tempoSeg);
            }
        }
    }
}
