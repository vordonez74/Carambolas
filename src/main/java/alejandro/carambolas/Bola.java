
package alejandro.carambolas;

final public class Bola {
    private String color;
    private int x;
    private int y;

    public Bola(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    public void golpearBola(double fuerza,double angulo){
        actualizarEstado();
    }

    private void actualizarEstado(){
        /*
        controlar velocidad
        controlar dirección
        
        */
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
