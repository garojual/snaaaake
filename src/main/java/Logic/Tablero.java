package Logic;

import java.util.ArrayList;

public class Tablero {

    private int[][] tablero;
    private Snake snake;
    private int contadorFrutas;
    private boolean gameOver;

    public Tablero() {
        this.tablero = new int[16][16];

        int[] coord1 = {(tablero.length/2),(tablero.length/2)}; //8,8
        int[] coord2 = {tablero.length/2, (tablero.length/2) - 1}; //8, 7

        snake = new Snake(coord1, coord2);
        snake.setTablero(this);
/*
        //@TODO Matriz de ceros, hay que llenarla según la lógica
         for(int i = 0; i < 16; i++){
             for(int j = 0; j < 16; j++){
                tablero[i][j] = 0;
             }
         }

         dibujarSnake();
         printMatrix();*/

        prueba();
        avanzar();
        prueba();

    }

    public void prueba(){
        //@TODO Matriz de ceros, hay que llenarla según la lógica
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 16; j++){
                tablero[i][j] = 0;
            }
        }

        dibujarSnake();
        printMatrix();
    }

    public void dibujarSnake(){
        for(int i = 0; i < snake.getSnaaaaake().size(); i++){
            int[] posAux = snake.getSnaaaaake().get(i);
            tablero[posAux[0]][posAux[1]] = i + 1;
        }
    }

    public void avanzar(){

        int[] posCabeza = snake.getSnaaaaake().get(0);
        int sumarFila = 0;
        int sumarColumna = 0;
        int[] aux1;
        int[] aux2;

        switch (snake.getDireccion()){
            case "der":
                sumarFila = 1;
                break;

            case "izq":
                sumarFila = -1;
                break;

            case "arr":
                sumarColumna = -1;
                break;

            case "aba":
                sumarColumna = 1;
                break;
        }

        int[] nuevaPos = {posCabeza[0] + sumarColumna, posCabeza[1] + sumarFila};

        aux1 = posCabeza;
        snake.getSnaaaaake().set(0, nuevaPos);
        snake.getSnaaaaake().set(1, aux1);

    }

    public void crearFrutas(){



    }


    public void actualizarSnake(int row, int col){

    }


    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public int getContadorFrutas() {
        return contadorFrutas;
    }

    public void setContadorFrutas(int contadorFrutas) {
        this.contadorFrutas = contadorFrutas;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public void printMatrix(){

        for (int x=0; x < tablero.length; x++) {
            System.out.print("|");
            for (int y=0; y < tablero[x].length; y++) {
                System.out.print (tablero[x][y]);
                if (y!= tablero[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }

        System.out.println("____________________________________________________________________________________________");

    }
}