package alejandro.carambolas;

/**
 *
 * @author vordo
 */
final public class Mesa {
    private String color;
    private final double largo;
    private final double ancho;
    Bola bolas[];

    public Mesa(String color, double largo, double ancho) {
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        bolas = new Bola[3];
    }
    
    public String agregarBola(String color){
        //agregar bolas en posicones aleatorias
        if(bolas.length<2){
            bolas[bolas.length + 1] = new Bola(color,3,3);
            return "Listo, se agregpo una bola.";
        }else{
            return "No puede agregar mas bolas.";
        }
    }
    
    //Calcula en cada llamada si choca con un objeto o no.
    public char consultarChoque(){
        //n: no choco, b:chocó con baranda, o:chocó con otra bola
        char chocoCon = 'n';
        
        return chocoCon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
