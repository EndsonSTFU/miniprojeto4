import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner aventura = new Scanner(System.in);
        Personagem Finn = new Personagem("Finn", 0);
        Personagem Jake = new Personagem("Jake", 0);

        System.out.println(" A HORA DA AVENTURA");
        System.out.println("CONTROLANDO OS HEROIS DA TERRA DE Ooo FAÇA AS ESCOLHAS CERTAS PARA VENCER\n");

        Capitulo capitulo1 = new Capitulo(Finn.nome + " e Jake entram em uma masmorra , qual porta eles devem escolher?", new String[] {"Porta de caveira", "Porta de ouro"}, Finn, Jake, 0, 0, aventura);
        Capitulo final1 = new Capitulo(Finn.nome + " e Jake dão de cara com o Litch um mau ancestral e são derrotados liberando ele na terra de Ooo." , new String[] {} , Finn, Jake, -100, -100, aventura);
        Capitulo capitulo11 = new Capitulo(Finn.nome + "e Jake entram na porta se deparando com Marceline lutando contra um monstro. Devemos ajuda-la?",new String[] {"Sim", "Nao"}, Finn, Jake, +50, +50, aventura);
        Capitulo final2 = new Capitulo(Finn.nome + " vê Marceline sendo derrotada e em seguida nossos herois tambem são derrotados.",new String[] {}, Finn, Jake, -50, -50, aventura);
        Capitulo final11 = new Capitulo(Finn.nome + " e Jake lutam com bravura derrotando o monstro que mostra ser Abadeer pai de Marceline, pela bravura nossos herois recebem de Abadeer um cristal magico da vitalidade assim dando mais vigor a Finn e Jake.",new String[]{}, Finn, Jake, +100, +100, aventura);

        int escolha = 0;
        capitulo1.mostrar();
        escolha = capitulo1.escolher();

        if (escolha == 1)
        { 
            final1.mostrar();
        }
        else if (escolha == 2)
        { 
            capitulo11.mostrar();
            escolha = capitulo11.escolher();
            
            if (escolha == 1)
            {
                final11.mostrar();
            }
            else if (escolha == 2)
            {
                final2.mostrar();
            }  
        }
    }
}