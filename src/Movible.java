import processing.core.PApplet;

public class Movible {

    float x, y;
    int d = 1;

    public Movible(float x, float  y){
        this.x = x;
        this.y = y;
    }

    public void move(float w){

    }


    public void display(PApplet p5){
        p5.circle(this.x, this.y, 50);
    }
}
