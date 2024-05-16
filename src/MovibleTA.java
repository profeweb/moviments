public class MovibleTA extends MovibleT {

    float[] xs;
    float[] ys;
    int t = 0;

    public MovibleTA(float x, float y, float[] pxs, float[] pys) {
        super(x, y, 0, 0);
        this.xs = pxs;
        this.ys = pys;

        this.x0 = xs[0];
        this.y0 = ys[0];

        this.x1 = xs[1];
        this.y1 = ys[1];
    }

    public void move(float w){

        x = x0 + (x1 - x0)* amt;
        y = y0 + (y1 - y0)* amt;

        amt+=w;
        if(amt>1){
            amt = 0;
            t++;
            if(t>3){
                t =  0;
            }
            x0 = xs[t];
            y0 = ys[t];
            x1 = xs[(t+1)%xs.length];
            y1 = ys[(t+1)%ys.length];
        }
    }
}
