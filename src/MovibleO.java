import static processing.core.PApplet.cos;

public class MovibleO extends Movible {

    float a, h, yb;

    public MovibleO(float x, float y, float a, float h, float yb) {
        super(x, y);
        this.a = a;
        this.h = h;
        this.yb = yb;
    }

    public void setH(float h){
        this.h = h;
    }

    public void move(float w){
        x+=3*this.d;
        y = yb + this.h * cos(this.a);
        this.a += 0.1;

        if(x >= w || x<0){
            d *= -1;
        }
    }
}
