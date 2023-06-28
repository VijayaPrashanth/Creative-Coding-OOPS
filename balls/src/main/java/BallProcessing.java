import processing.core.PApplet;

public class BallProcessing extends PApplet {

    public static void main(String[] args) {
        PApplet.main("BallProcessing",args);
    }
    public static final int WIDTH = 646;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

    public static PApplet ball;

    Balls b1,b2,b3,b4;
    int x=1;
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball = this;

        b1 = new Balls(x,HEIGHT/5,DIAMETER);
        b2 = new Balls(x+2,HEIGHT*2/5,DIAMETER);
        b3 = new Balls(x+3,HEIGHT*3/5,DIAMETER);
        b4 = new Balls(x+4,HEIGHT*4/5,DIAMETER);
    }

    @Override
    public void draw() {
        b1.move(1);
        b2.move(2);
        b3.move(3);
        b4.move(4);

    }

}
