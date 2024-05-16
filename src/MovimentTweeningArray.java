import processing.core.PApplet;

public class MovimentTweeningArray extends PApplet {

    // Objectes de classe MovibleT
    MovibleTA mta;
    float[] xs = {100, 600, 400, 100};
    float[] ys = {100, 200, 700, 500};

    // Configuració bàsica de l'aplicació
    public void settings() {
        size(800, 800);
        smooth(10);
    }

    public static void main(String[] args) {
        PApplet.main("MovimentTweeningArray", args);
    }

    // Instruccions inicials (1 vegada)
    public void setup() {
        mta = new MovibleTA(100, 100, xs, ys);
    }

    // Bucle (30 vegades per segon)
    public void draw() {
        background(200);

        noFill();
        beginShape();
            for(int i=0; i<xs.length; i++) {
                vertex(xs[i], ys[i]);
            }
        endShape(CLOSE);

        mta.display(this);
        mta.move(0.01f);
    }
}

