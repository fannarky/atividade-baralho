package PhelipeAtividade;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Baralho b = new Baralho();

        b.exibeBaralho();

        b.embaralhar();

        b.exibeBaralho();

        //b.mostraTopo();

        b.embaralhar();

        Scanner sc = new Scanner(System.in);

        int valor = 0;

        do{
            System.out.println("Digite um valor entre 2 e 9");
            valor = sc.nextInt();
        }while(valor <= 1 || valor >= 10);

        int valorAdivinha = 0;

        int valorCartaPreta = 0;

        for(int i = 0 ; i < valor ; i++){
            Carta virada = b.viraCarta();
            System.out.println(virada.toString());
            
            if(virada.getNaipe().equals("Paus") || virada.getNaipe().equals("Espadas"))
                valorCartaPreta += virada.getValor();
        }

        //System.out.println(valorCartaPreta);

        do{
            System.out.println("Adivinhe o valor da soma das cartas de naipe preto viradas(paus ou espadas): ");
            valorAdivinha = sc.nextInt();
        }while(valorAdivinha < 0);

        if(valorCartaPreta == valorAdivinha)
            System.out.println("Acertou!!");
        else
            System.out.println("Errou!!");
    }
}