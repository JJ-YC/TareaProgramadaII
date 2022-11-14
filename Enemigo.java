public class Enemigo {
    private final char id ='e'; // e por enemigo
    private int vidas;
    public Enemigo(){
        this.vidas=2;
    }

    public int getVidas() {
        return vidas;
    }

    public void setvidas(){
        this.vidas=0;
    }

    public char getId() {
        return id;
    }
}
