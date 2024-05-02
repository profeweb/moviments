import static java.lang.Math.cos;
import static processing.core.PApplet.sin;

public class MovibleS extends MovibleC {


    public MovibleS(float x, float y, float xc, float yc, float r) {
        super(x, y, xc, yc, r);
    }

    public void move(float v){
        this.x = this.xc + this.r*(float)cos(this.a);
        this.y = this.yc + this.r*sin(this.a);
        this.a += v;
        this.r += 1;
    }
}
