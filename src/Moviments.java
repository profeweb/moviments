import processing.core.PApplet;

public class Moviments extends PApplet {

    // Objectes de classe Movible
    Movible mh, mv, mc, me, ms, mo, mr, mr2;

    int numRs = 5;
    MovibleR[] mrs;

    // Configuració bàsica de l'aplicació
    public void settings(){
        size(800, 400);
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
        mo = new MovibleO(0, 0, 0, 0, height/2);

        mrs = new MovibleR[numRs];

        for(int i=0; i<numRs; i++) {
            float x = random(100, width-100);
            float y = random(100, height-100);
            float dx = random(-1, 1);
            float dy = random(-1, 1);
            mrs[i] = new MovibleR(x, y, dx, dy);
        }
    }

    // Bucle (30 vegades per segon)
    public void draw() {

        background(200);

        // Cridada als mètodes dels objectes
        /*
        mh.display(this);
        mh.move(width);

        mv.display(this);
        mv.move(height);

        mc.display(this);
        mc.move(0.01f);

        me.display(this);
        me.move(0.05f);

        ms.display(this);
        ms.move(0.05f);

        mo.display(this);
        mo.move(this.width);

         */

        for(int i=0; i<numRs; i++){
            mrs[i].display(this);
            mrs[i].move(width, height);
            for(int j=i+1; j<numRs; j++){
                mrs[i].colisio(mrs[j]);
            }
        }
    }

    public void mousePressed(){
        float dx = random(-1, 1);
        float dy = random(-1, 1);
        mr = new MovibleR(width/2, height/2, dx, dy);
    }

    public void keyPressed(){
        if(keyCode==UP){
            MovibleO moo = (MovibleO) mo;
            float nh = moo.h + 10;
            moo.setH(nh);
        }
        else if(keyCode==DOWN){
            MovibleO moo = (MovibleO) mo;
            float nh = moo.h - 10;
            moo.setH(nh);
        }
        else if(key=='d' || key=='D'){
            mo.changeDirection();
        }
    }
}