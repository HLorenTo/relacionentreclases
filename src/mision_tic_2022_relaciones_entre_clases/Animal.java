package mision_tic_2022_relaciones_entre_clases;
public class Animal {
    protected int nDientes;
    protected boolean pelaje;
    protected int nPatas;
    protected double peso;
    protected int nivelO2;
    protected int nivelCO2;
    public int getNDientes(){
        return this.nDientes;
    }
    public void respirar (){
        this.nivelO2=100;
        this.nivelCO2=0;
    }
}
