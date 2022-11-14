public class Principal {
    private int vidas;
    private final char p = 'p'; // P de Principal

    public Principal(){
        this.vidas=4;
    }

    public char getP() {
        return p;
    }

    public void minar(char[][] mapa, int columna, int fila){
        if(mapa[fila][columna]!=' '&&mapa[fila][columna]!='|'||mapa[fila][columna]!='_'){
            mapa[fila][columna]=' ';
        }
    }




    public void volarPichazos(Enemigo e ){
        if(this.vidas>1&&e.getVidas()>0) {
            System.out.println("ha vencido al Enemigo");
            e.setvidas();
            vidas = vidas - 2;
        }

        if(vidas>=0){
            System.out.println("Ha muerto");
        } else{System.out.println("puede continuar!");}

    }
}
