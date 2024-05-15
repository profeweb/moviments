public class MovibleT extends Movible{

    float x0, y0, x1, y1, amt;

    public MovibleT(float x, float y, float xf, float yf) {
        super(x, y);
        this.x0 = x; this.y0 = y;
        this.x1 = xf; this.y1 = yf;
        this.amt = 0;
    }

    public void move(float w){
        x = x0 + (x1 - x0)* amt;
        y = y0 + (y1 - y0)* amt;

        amt+=w;
        if(amt>1){
            amt = 0;
            float tempx = x0;
            float tempy = y0;
            x0 = x1;
            y0 = y1;
            x1 = tempx;
            y1 = tempy;
        }
    }
}
