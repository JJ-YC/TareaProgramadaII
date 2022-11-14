public class Mapa {

    private char [][] laberinto;
    public Mapa(){
        //this.laberinto= new char[50][50];
       char [][]laberinto = {
                {'|','_','_','_','_','_','_','_','_','|'},
                {'|',' ',' ',' ',' ','|',' ','|','|','|'},
                {'|',' ','|','_','_','|',' ','|','|','|'},
                {'|',' ','|',' ','|','|',' ',' ',' ','|'},
                {'|',' ',' ',' ','|','|',' ','|',' ','|'},
                {'|',' ','_','_','|',' ',' ','|',' ','|'},
                {'|',' ','|',' ',' ',' ','|','|','F','|'},
                {'|',' ','|',' ','|','_','|',' ','|','|'},
                {'|','I',' ',' ',' ','|',' ',' ','|','|'},
                {'|','_','_','_','_','_','_','_','_','|'}
        };
       this.laberinto= laberinto;
        //Se Debe colocar el laberinto aquí.

        int contador=0;

        while (contador>5){
            int fila=getFilaRandom();
            int colu=getcolumnaRandom();
            int filaAnt=-3;
            int colAnt=-3;
            if(laberinto[fila][colu]==' '&&(filaAnt>fila+3||filaAnt<fila+3)
            ||colAnt<colu+3|| colAnt>colu+3){
                laberinto[fila][colu]='D'; // Diamante
                filaAnt=fila;
                colAnt=colu;
                contador++;
            } else {
                fila=getFilaRandom();
                colu=getcolumnaRandom();
            }


        }

    }

    public int getcolumnaRandom(){
        return  (int)(Math.random()*36);
    }

    public int getFilaRandom(){
        return  (int)(Math.random()*36);
    }


    public void imprimirLab(){
        String contenido="";
        for (int i = 0; i < 10 ; i++){
            for ( int j = 0 ; j< 10; j++){
                contenido += this.laberinto[i][j]+"\t";
                System.out.print(this.laberinto[i][j] );
            }
            contenido += "\n";
            System.out.println();
        }
    }




    public static void main(String[] args) {
        Mapa laberinto= new Mapa();
        laberinto.imprimirLab();
    }
}
