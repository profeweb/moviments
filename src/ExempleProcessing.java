import processing.core.PApplet;

public class ExempleProcessing extends PApplet {

    // Objectes de classe Movible
    Movible mh, mv;

    // Configuració bàsica de l'aplicació
    public void settings(){
        size(1400, 800);
        smooth(10);
    }

    public static void main(String[] args) {
        PApplet.main("ExempleProcessing", args);
    }

    // Instruccions inicials (1 vegada)
    public void setup(){
        // Instanciació d'objectes mitjançant els contructors
        mh = new MovibleH(width/2, height/2);
        mv = new MovibleV(width/4, height/4);
    }

    // Bucle (30 vegades per segon)
    public void draw() {

        background(200, 100, 100);

        // Cridada als mètodes dels objectes
        mh.display(this);
        mh.move(width);
        mv.display(this);
        mv.move(height);
    }
}