public class MovibleH extends Movible{

    public MovibleH(float x, float y) {
        super(x, y);
    }

    public void move(float w) {
        this.x += 5*d;
        if(this.x>= w){
            d = -1;
        }
        else if(this.x<0){
            d = 1;
        }
    }
}
