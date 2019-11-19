package PhelipeAtividade;

/**
 * Carta
 */
public class Carta {

    private String face;

    private int valor;

    private String naipe;

    public Carta(String face, int valor, String naipe){
        this.face = face;
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return face+" de "+naipe;
    }


    public String getFace() {
        return this.face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNaipe() {
        return this.naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }



    
}