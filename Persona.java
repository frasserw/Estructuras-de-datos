package ejercicio2;

public class Persona {
    private int id;
    private String nombre;
    private String tipo;

    public Persona(int id, String nombre, String tipo) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo(){
        return this.tipo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Id " + this.id + " Nombre " + this.nombre +" Tipo " + this.tipo;
    }
}
