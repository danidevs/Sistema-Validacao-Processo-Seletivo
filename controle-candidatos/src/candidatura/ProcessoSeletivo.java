package candidatura;

import java.util.Random;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "Augusto" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando)
                tentativasRealizadas++;

            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO" + candidato + "NA" + tentativasRealizadas + "TENTATIVAS");

        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM" + candidato + "NUMERO MAXIMO TENTATIVAS"
                    + tentativasRealizadas + "REALIZADA");

    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
