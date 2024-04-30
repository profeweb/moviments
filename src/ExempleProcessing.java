import processing.core.PApplet;

public class ExempleProcessing extends PApplet {

    MovibleH mh;
    MovibleV mv;

    public void settings(){
        size(800, 800);
        smooth(10);
    }

    public static void main(String[] args) {
        PApplet.main("ExempleProcessing", args);
    }

    public void setup(){
        mh = new MovibleH(width/2, height/2);
        mv = new MovibleV(width/4, height/4);
    }

    public void draw() {
        background(200, 100, 100);
        mh.display(this);
        mh.move(width);

        mv.display(this);
        mv.move(height);
    }
}