import static java.lang.Math.cos;
import static processing.core.PApplet.sin;

public class MovibleC extends Movible{

    float xc, yc;
    float r, a;

    public MovibleC(float x, float y, float xc, float yc, float r) {
        super(x, y);
        this.xc = xc;
        this.yc = yc;
        this.r = r;
        this.a = 0;
    }

    public void move(float v){
        this.x = this.xc + this.r*(float)cos(this.a);
        this.y = this.yc + this.r*sin(this.a);
        this.a += v;
    }

}
