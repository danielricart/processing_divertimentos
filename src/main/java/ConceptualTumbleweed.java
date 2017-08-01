import processing.core.PApplet;

import java.util.concurrent.TimeUnit;

public class ConceptualTumbleweed extends PApplet {
    private int x = -height/4;
    public void setup() {
        wait_milliseconds(250);
    }
    public void settings() {
        //smooth(2);
        size(300, 200);

    }

    public void draw() {
        background(0);
        ellipse(x, height/2, height/4, height/4);
        x += 1;
        if (x > width+height/4) {
            wait_seconds(1);
            exit();
        }
    }

    private void wait_seconds(int delay) {
        try {
            TimeUnit.SECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void wait_milliseconds(int delay) {
        try {
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String... args) {
        PApplet.main("ConceptualTumbleweed");
    }
}
