package PhelipeAtividade;

import java.util.Random;

/**
 * Baralho
 */
public class Baralho {

    private PilhaObj<Carta> baralho;

    public Baralho(){
        this.baralho = new PilhaObj<>(52);

        String[] faces = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };

        String[] naipes = { "Copas", "Paus", "Ouros", "Espadas" };

        int count = 0;

        while(!baralho.isFull()){
            baralho.push(new Carta(
                faces[count%13],
                count%13+1,
                naipes[count/13]
            ));
            count++;
        }

        System.out.println(count);
    }

    public Carta removeCarta(int ind){
        PilhaObj<Carta> aux = new PilhaObj<>(52);
        for (int i = 0; i < ind; i++) {
            aux.push(baralho.pop());
        }
        Carta alvo= baralho.pop(); //alvo é a carta que quero remover
        // empilha novamente todas as ind cartas no baralho
        while(!aux.isEmpty()) {
            baralho.push(aux.pop());
        }
        return alvo; // retorna a carta alvo que foi removida
    }

    public void embaralhar(){
        Random nroAleatorio = new Random();

        for(int i = 0 ; i < 52 ; i++){
            int indice = nroAleatorio.nextInt(52);

            Carta aux = removeCarta(indice);
    
            this.baralho.push(aux);
        }
    }

    public void mostraTopo(){
        System.out.println(this.baralho.topo);
    }

    public Carta viraCarta(){
        return this.baralho.pop();
    }

    public void exibeBaralho(){
        this.baralho.exibe();
    }
}