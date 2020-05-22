import processing.core.PApplet;
import processing.core.PImage;

public class Imagenes extends PApplet {

    int viewport_w = 500; // width in pixels
    int viewport_h = 500; // high in pixels

    public static void main(String args[]) {
        PApplet.main("Imagenes");
    }

    // Method that has the initial configuration
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    //Objects declared for use them in all the class
    PImage gatoPonido;
    PImage cuchillo;
    PImage enfadasion;

    //Method that just runs one time
    @Override
    public void setup() {
        // Window color un RGB
        background(176, 250, 255);
        //Initialized images
        gatoPonido = loadImage(dataPath("gatoPonidoAqui.jpg"));
        cuchillo = loadImage(dataPath("cuchillo.png"));
        enfadasion = loadImage(dataPath("cejasGato.png"));
    }

    @Override
    public void draw() {
        /*With this we can resize the knife
        image(gatoPonido, 0, 0, 500, 500);
        image(cuchillo, 10,10,mouseX, mouseY);
        This part will change the color of the cat depending of where the mouse is
        tint(mouseY,mouseX,mouseY);
        image(gatoPonido, 0, 0, 500, 500);
        image(cuchillo, 10,10,150, 300);
        This change the opacity of the knife with the mouseX
        image(gatoPonido,0,0,500,500);
        tint(255,mouseX);
        image(cuchillo,10,10,150, 300);*/
        
        //Here are conditionals for two actions
        //If we press de right button of the mouse a knife that you can move will appear
        image(gatoPonido, 0, 0, 500, 500);
        if (mouseButton == RIGHT) {
            image(gatoPonido, 0, 0, 500, 500);
            image(cuchillo, mouseX - 210, mouseY - 250, 250, 300);
        }
        //Pressing the left button the background will turn red and two more images will appear
        if (mouseButton == LEFT) {
            tint(255, 66, 66);
            image(gatoPonido, 0, 0, 500, 500);
            image(enfadasion, 0, 0);
            image(cuchillo, mouseX - 210, mouseY - 250, 250, 300);
        } else {
            tint(255, 255, 255);
        }
    }
}