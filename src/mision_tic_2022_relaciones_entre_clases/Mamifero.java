package mision_tic_2022_relaciones_entre_clases;
public class Mamifero extends Animal{
    protected int nFosasNasales;
    public void respirar(){
        int tiempo = 0;
        int diff = 1 * nFosasNasales;
        //inhalar
        while (this.nivelO2<100){
            this.nivelO2+= diff/this.peso;
            if(this.nivelO2>100){
                this.nivelO2=100;
            }
            tiempo +=1;
        }
        //exhalar
        while(this.nivelCO2>0){
            this.nivelCO2-=diff;
            if(this.nivelCO2<0){
                this.nivelCO2=0;
            }
            tiempo =+1;
        }
        System.out.println("Tiempo tomado "+tiempo);
    }
}
