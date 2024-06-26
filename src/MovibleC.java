import processing.core.PApplet;

import static java.lang.Math.cos;
import static processing.core.PApplet.sin;

public class MovibleC extends Movible{

    // Propietats d'un element movible circular
    float xc, yc;
    float r, a;

    // Constructor
    public MovibleC(float x, float y, float xc, float yc, float r) {
        super(x, y);
        this.xc = xc;
        this.yc = yc;
        this.r = r;
        this.a = 0;
    }

    // Sobre-escriu el mètode heretat
    public void move(float v){
        this.x = this.xc + this.r*(float)cos(this.a);
        this.y = this.yc + this.r*sin(this.a);
        this.a += v;
    }


    // Sobre-escriu el mètode heretat
    public void display(PApplet p5){
        p5.fill(255, 0, 0);
        super.display(p5);
    }

}
