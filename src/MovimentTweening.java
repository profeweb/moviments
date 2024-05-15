import processing.core.PApplet;

public class MovimentTweening extends PApplet {

    // Objectes de classe MovibleT
    MovibleT mt;

    // Configuració bàsica de l'aplicació
    public void settings() {
        size(800, 800);
        smooth(10);
    }

    public static void main(String[] args) {
        PApplet.main("MovimentTweening", args);
    }

    // Instruccions inicials (1 vegada)
    public void setup() {
        mt = new MovibleT(100, 100, 700, 700);
    }

    // Bucle (30 vegades per segon)
    public void draw() {
        background(200);
        mt.display(this);
        mt.move(0.01f);
    }
}

