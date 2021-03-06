import processing.core.PApplet;

public class Formas extends PApplet {

    int viewport_w = 750; // width in pixels
    int viewport_h = 500; // high in pixels

    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    // Method that has the initial configuration
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    //Method that just runs one time
    @Override
    public void setup() {
        background(5, 63, 108);
        drawBackground();
    }

    //Method that runs all the time
    @Override
    public void draw() {
        //Full moon
        if (key == '1') {
            drawBackground();
        }
        //Third quarter
        if (key == '2') {
            drawBackground();
            stroke(5, 63, 108);
            fill(5, 63, 108);
            rect(375, 83, 166, 335);
        }
        //New moon
        if (key == '3') {
            drawBackground();
            stroke(29, 77, 115, 200);
            fill(29, 77, 115, 200);
            ellipse(375, 250, 320, 320);
        }
        //First quarter
        if(key == '4'){
            drawBackground();
            stroke(5, 63, 108);
            fill(5, 63, 108);
            rect(208, 83, 166, 335);
        }
    }
    public void drawBackground(){
        //Main background components
        //Biggest circle (the moon)
        stroke(255, 251, 251);
        fill(218, 236, 250);
        ellipse(375, 250, 330, 330);
        //Top left oval
        stroke(173, 200, 222);
        fill(173, 200, 222);
        ellipse(290, 190, 105, 115);
        //Bottom left circle
        stroke(173, 200, 222);
        fill(173, 200, 222);
        ellipse(275, 350, 40, 40);
        //Top right circle
        stroke(173, 200, 222);
        fill(173, 200, 222);
        ellipse(450, 170, 65, 60);
        //Bottom right circle
        stroke(173, 200, 222);
        fill(173, 200, 222);
        ellipse(490, 300, 20, 20);
        //Bottom middle oval
        stroke(173, 200, 222);
        fill(173, 200, 222);
        ellipse(400, 320, 50, 55);
        //Stars
        stroke(242, 255, 147);
        fill(242, 255, 147);
        ellipse(80, 420, 10, 10);

        stroke(242, 255, 147);
        fill(242, 255, 147);
        ellipse(140, 300, 5, 5);

        stroke(242, 255, 147);
        fill(242, 255, 147);
        ellipse(60, 90, 15, 15);

        stroke(242, 255, 147);
        fill(242, 255, 147);
        ellipse(610, 200, 8, 8);

        stroke(242, 255, 147);
        fill(242, 255, 147);
        ellipse(700, 450, 20, 20);

        stroke(242, 255, 147);
        fill(242, 255, 147);
        ellipse(550, 60, 12, 12);

        stroke(242, 255, 147);
        fill(242, 255, 147);
        ellipse(660, 50, 4, 4);

        stroke(242, 255, 147);
        fill(242, 255, 147);
        ellipse(340, 450, 16, 16);

        stroke(242, 255, 147);
        fill(242, 255, 147);
        ellipse(130, 50, 23, 23);
    }
}