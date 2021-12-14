package mision_tic_2022_relaciones_entre_clases;
public class Perro extends Animal{
    protected boolean esAlpha;
    public Perro(int nDientes, boolean pelaje, int nPatas, boolean esAlpha){
        this.nDientes = nDientes;
        this.pelaje = pelaje;
        this.nPatas = nPatas;
        //Atributos particulares 
        this.esAlpha = esAlpha;
    }
// Se heredan todos los métodos que no sean privados
        // El siguiente es un método particular, solo presente en la clase Gato
    public boolean esAlpha(){
        return this.esAlpha;
    }
}
