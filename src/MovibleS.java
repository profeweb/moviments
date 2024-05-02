import processing.core.PApplet;

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

        if(this.r> 500){
            this.r = 0;
        }
    }

    public void display(PApplet p5){
        p5.fill(0, 0, 255);
        p5.circle(this.x, this.y, 50);
    }
}
