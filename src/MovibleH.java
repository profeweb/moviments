import processing.core.PApplet;

// Hereta de la classe Movible
public class MovibleH extends Movible{

    // Constructor
    public MovibleH(float x, float y) {
        // Constructor de la super classe
        super(x, y);
    }

    // Sobre-escriu el mètode heretat
    @Override
    public void move(float w) {

        // Actualitza la posició x
        this.x += 5*d;

        // Comprova el límit inferior
        if(this.x>= w){
            d = -1;
        }
        // Comprova el límit superior
        else if(this.x<0){
            d = 1;
        }
    }

    public void display(PApplet p5){
        p5.fill(0, 255, 0);
        super.display(p5);
    }
}
