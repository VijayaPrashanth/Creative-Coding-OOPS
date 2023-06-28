public class Balls {

    public int x;
    public int height;
    public int diameter;
    public Balls(int x,int height,int diameter) {
        this.x=x;
        this.height=height;
        this.diameter = diameter;
        //BallProcessing.ball.ellipse(x,height,diameter,diameter);
    }
    public void move(int m) {

        BallProcessing.ball.ellipse(x,height,diameter,diameter);
        x+=m;
    }
}
