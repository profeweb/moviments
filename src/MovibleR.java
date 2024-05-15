import processing.core.PApplet;

import static java.lang.Math.random;

public class MovibleR extends Movible{

    float xDir, yDir;

    public MovibleR(float x, float y, float xd, float yd) {
        super(x, y);
        this.xDir = xd;
        this.yDir = yd;
    }

    public void move(int w, int h){

        x += xDir * 5;
        y += yDir * 5;

        if(x<=25 || x>=w-25){
            xDir*= -1;
        }
        if(y<=25 || y>=h-25){
            yDir*= -1;
        }
    }

    public void colisio(MovibleR altre){

        float d = PApplet.dist(this.x, this.y, altre.x, altre.y);

        if(d<=50){
            this.xDir*=-1;
            this.yDir*=-1;

            altre.xDir*=-1;
            altre.yDir*=-1;
        }
    }
}
