
// Hereta de la classe Movible
public class MovibleV extends Movible{

    // Constructor
    public MovibleV(float x, float y) {
        // Constructor de la super classe
        super(x, y);
    }

    // Sobre-escriu el mètode heretat
    @Override
    public void move(float h) {
        this.y += 5*d;
        if(this.y>= h){
            d = -1;
        }
        else if(this.y<0){
            d = 1;
        }
    }
}
