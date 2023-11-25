import java.util.Scanner;

public class Capitulo {
    String texto;
    String[] escolhas;
    Personagem Finn;
    Personagem Jake;
    int incrementoFinn;
    int incrementoJake;
    Scanner aventura;

    Capitulo(String texto,
             String[] escolhas,
             Personagem Finn, 
             Personagem Jake,
             int incrementoFinn,
             int incrementoJake,
             Scanner aventura)
            
    {
        this.texto = texto;
        this.escolhas = escolhas;
        this.Finn = Finn;
        this.Jake = Jake;
        this.incrementoJake = incrementoJake;
        this.incrementoFinn = incrementoFinn;
        this.aventura = aventura;
    }


    void mostrar() {
        System.out.println(texto);
        Jake.atualizarVida(incrementoJake);
        Finn.atualizarVida(incrementoFinn);

            for(int i = 0; i < escolhas.length; i++)
            {
                System.out.println("- " + escolhas[i]);
            }

            System.out.println();
            System.out.println(". . .");
            System.out.println();
    }


    int escolher() {
        int opcaoEscolhida = 0;
        String escolha;
        boolean escolhaCorreta = false;

        if(escolhas.length == 0)
        {
            System.out.println("E AQUI CHEGAMOS AO FIM DA NOSS AVENTURA.");
            System.exit(0);
        }
        else{
            while (!escolhaCorreta) {
               escolha = aventura.nextLine();
                   for(int i = 0; i < escolhas.length; i++)
                   {
                    if(escolha.equals(escolhas[i]))
                    {
                        escolhaCorreta = true;
                        opcaoEscolhida = i + 1;
                    }
                }
            if (!escolhaCorreta) {
                System.out.println("Escolha apenas uma das opções indicadas");
                escolhaCorreta = false;

             return opcaoEscolhida;
                }
            }
        }
        return opcaoEscolhida;
    }
}