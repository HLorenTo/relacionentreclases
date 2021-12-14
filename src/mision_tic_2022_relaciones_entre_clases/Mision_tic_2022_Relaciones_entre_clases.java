package mision_tic_2022_relaciones_entre_clases;
public class Mision_tic_2022_Relaciones_entre_clases {
    public static void main(String[] args) {
        //asociacion
        System.out.println("ASOCIACION");
        Empleado emp1 = new Empleado ("Jorge", "Macias");
        Empleado emp2 = new Empleado ("Angela", "Cucalon");
        Empleado emp3 = new Empleado ("Irma", "Caceres");
        Empleado listaEmpleados[] = new Empleado[200];
        listaEmpleados[0] = emp1;
        listaEmpleados[1] = emp2;
        Banco banco = new Banco ("Bancolombia", listaEmpleados);
        banco.agregarEmpleado(emp3, 2);
        //coomposicion
        System.out.println("COMPOSICION");
        Automovil carro = new Automovil ("BMW Z3", 4, 8, 225, 2356);
        System.out.println(carro.getNumeroRuedas());
        //herencia
        System.out.println("HERENCIA");
        Gato gatito = new Gato(30, true, 4,60);
        Perro perrito = new Perro (42, true, 4, false);
        System.out.println(gatito.getNDientes());
    }
 }
