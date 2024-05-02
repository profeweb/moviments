import processing.core.PApplet;

public class Moviments extends PApplet {

    // Objectes de classe Movible
    Movible mh, mv, mc, me, ms;

    // Configuració bàsica de l'aplicació
    public void settings(){
        size(800, 800);
        smooth(10);
    }

    public static void main(String[] args) {
        PApplet.main("Moviments", args);
    }

    // Instruccions inicials (1 vegada)
    public void setup(){
        // Instanciació d'objectes mitjançant els contructors
        mh = new MovibleH(width/2, height/2);
        mv = new MovibleV(width/4, height/4);
        mc = new MovibleC(0, 0, width/2, height/2, 200);
        me = new MovibleE(0, 0, width/2, height/2, 200, 100);
        ms = new MovibleS(0, 0, width/2, height/2, 0);
    }

    // Bucle (30 vegades per segon)
    public void draw() {

        //background(200, 100, 100);

        // Cridada als mètodes dels objectes
        /*
        mh.display(this);
        mh.move(width);
        mv.display(this);
        mv.move(height);
        mc.display(this);
        mc.move(0.1f);
        me.display(this);
        me.move(0.05f);
        
         */

        ms.display(this);
        ms.move(0.05f);
    }
}