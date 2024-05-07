import processing.core.PApplet;

public class Movible {

    // Propietats d'un element movible
    float x, y;
    int d = 1;

    // Constructor
    public Movible(float x, float  y){
        this.x = x;
        this.y = y;
    }

    // Mou l'element
    public void move(float w){
    }

    public void changeDirection(){
        this.d *= -1;
    }

    // Dibuixa l'element
    public void display(PApplet p5){
        p5.circle(this.x, this.y, 50);
    }
}
