package Logic;

import javafx.scene.control.Tab;

import java.util.ArrayList;

public class Snake {

    private ArrayList<int []> snaaaaake;
    private Tablero tablero;
    private int velocidad;
    private String direccion;


    public Snake(int[] cabeza, int[] cola) {

        this.snaaaaake = new ArrayList<>();
        snaaaaake.add(cabeza); //Cabeza
        snaaaaake.add(cola);

        this.velocidad = 500; //Velocidad en ms por cada actualizacion

        direccion = "der";

    }

    public void grow(){

    }

    public ArrayList<int[]> getSnaaaaake() {
        return snaaaaake;
    }

    public void setSnaaaaake(ArrayList<int[]> snaaaaake) {
        this.snaaaaake = snaaaaake;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
