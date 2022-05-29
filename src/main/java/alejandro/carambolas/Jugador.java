package alejandro.carambolas;

//con final no permite que se hereden clases de Jugador
final public class Jugador extends Persona{
    private int puntaje;
    
    public Jugador(String nombre){
        super(nombre,"",0);
        this.puntaje = 0;
    }
    public Jugador(String nombre, String apellido, int edad) {
        super(nombre,apellido,edad);
        this.puntaje = 0;
    }
    
    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nPuntaje: "+puntaje);
    }
    
}
