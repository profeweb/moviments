import processing.core.PApplet;

import static java.lang.Math.cos;
import static processing.core.PApplet.sin;

public class MovibleE extends MovibleC {

    float rv;

    public MovibleE(float x, float y, float xc, float yc, float rh, float rv) {
        super(x, y, xc, yc, rh);
        this.rv = rv;
    }

    public void move(float v){
        this.x = this.xc + this.r*(float)cos(this.a);
        this.y = this.yc + this.rv*sin(this.a);
        this.a += v;
    }

    public void display(PApplet p5){
        p5.fill(255, 255, 0);
        p5.circle(this.x, this.y, 50);
    }
}
