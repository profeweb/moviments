public class MovibleV extends Movible{

    public MovibleV(float x, float y) {
        super(x, y);
    }

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
