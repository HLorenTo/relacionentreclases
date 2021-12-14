package mision_tic_2022_relaciones_entre_clases;
public class Gato extends Animal{
        protected int volRonroneo;
        public Gato(int nDientes, boolean pelaje, int nPatas, int volRonroneo){
            this.nDientes = nDientes;
            this.pelaje = pelaje;
            this.nPatas = nPatas;
            this.volRonroneo = volRonroneo;
        }
        // Se heredan todos los métodos que no sean privados
        // El siguiente es un método particular, solo presente en la clase Gato
        public int getVolRonroneo(){
            return this.volRonroneo;
        }
}
