import java.util.*;
public class TryCatch3 {
    
    public static void tempoDoFilme() {
        throw new ArithmeticException("Acabou o filme");
    }
    public static void main(String[] args) {
    int tempoTotal = 2;
    int tempoMin = 0;
    int tempoSeg = 0;
    
        while (tempoMin < tempoTotal) {
            try {
                //Thread.sleep(1000);
                tempoSeg++;
                if (tempoSeg == 60) {
                    tempoMin++;
                    tempoSeg = 0;
                }
                if (tempoMin == tempoTotal) {
                    tempoDoFilme();
                }
            } catch (ArithmeticException e) {
                Scanner scnSair = new Scanner(System.in);
                System.err.println(e.getMessage() + "\nEspero que tenha gostado da experiencia");
                scnSair.nextLine();
                scnSair.close();
            }
            finally {
                System.out.println("Minutos: "+tempoMin+" Segundos: "+tempoSeg);
            }
        }
    }
}
