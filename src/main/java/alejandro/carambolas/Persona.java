package alejandro.carambolas;

public class Persona {
    private final String nombre;
    private final String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }    
    
    //metodo final no permite que sobre se escriba
    public final String getNombre() {
        return nombre;
    }

    public final String getApellido() {
        return apellido;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+
                "\nApellido: "+apellido+
                "\nEdad: "+edad);
    }  
}
