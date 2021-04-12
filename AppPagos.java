package ejercicio2;

import colas.TDACola;

public class AppPagos {
    private static TDACola<Persona> colaPago =new TDACola<Persona>();
    private static TDACola<Persona> colaTarjeta =new TDACola<Persona>();
    
    public static void main(String[] args) {
        cargaDatos();
        separarColas();      
        
       
        colaPago.mostrar();
        System.out.println("Elementos en la Cola Pago "+colaPago.tamanio());
        System.out.println();
        colaTarjeta.mostrar();
        System.out.println("Elementos en la Cola Trajeta "+colaTarjeta.tamanio());
        
    }
    /**
     * Carga datos en la cola, se queman los datos pararealziar una prueba del algoritmo de separación de colas
     */
    public static void cargaDatos(){
        colaPago.encolar(new Persona(1020,"Juanita","T"));
        colaPago.encolar(new Persona(1030,"Pachita","T"));
        colaPago.encolar(new Persona(30020,"Pachito","E"));
        colaPago.encolar(new Persona(10120,"Albita","T"));
        colaPago.encolar(new Persona(10320,"Pedro","E"));
        colaPago.encolar(new Persona(60420,"Orlando","E"));
        colaPago.encolar(new Persona(10205,"Rosita","T"));
        colaPago.encolar(new Persona(102089,"Maria","E"));
        colaPago.encolar(new Persona(10209,"Carlos","T"));
        colaPago.encolar(new Persona(20290,"Roberto","E"));
    }
    /**
     * Extraer elemetos de la colas de Pagos y evalua el tiposd de pago si es "T" decola de la colaPago y encola en la cola colatarjeta
     * Si el tipo de pago es "E" decola de la clola colapago y encola en la cola colaPago par que los elementos d elas colas que den en el orden de llegada.
     */
    public static void separarColas(){
        Persona p;
        int size = colaPago.tamanio();
        while(size>0){
            p = colaPago.decolar(); 
            if (p.getTipo().equalsIgnoreCase("T")) {
                colaTarjeta.encolar(p);
            } else {
                colaPago.encolar(p);
            }
            size--;
        }
    }
    
}
