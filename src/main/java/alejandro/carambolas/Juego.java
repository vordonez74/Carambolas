package alejandro.carambolas;

final public class Juego {
    private int nivel;
    Mesa mesa;
    Jugador jugadores[];
    //considerar el tuno de los jugadores

    public Juego() {
        nivel = 0;
        mesa = new Mesa("verde",800,800);
    }
    
    public void agregarJugador(){
        jugadores[0]= new Jugador("Individual");
    }
    
    public String ganador(){
        String ganador = "nadie";
        int puntaje = jugadores[0].getPuntaje();
        for(int i=1;i<jugadores.length;i++){
            if(puntaje<jugadores[i].getPuntaje()){
                ganador = jugadores[i].getNombre();
                puntaje = jugadores[i].getPuntaje();
            }
        }
        return ganador;
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
