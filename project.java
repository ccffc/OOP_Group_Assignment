
import ddf.minim.AudioOutput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class MultiSensoryFoLoopExperience extends PApplet {

    int mode = 0;

    Minim minim;
    AudioPlayer player;

    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        colorMode(HSB);
        minim = new Minim(this);
        player = minim.loadFile("/Users/ciananfinn/Desktop/OOP/Github/Godot/OOP_Group_Assignment/Baianá.wav");
    }

    public void draw() {
        
    }
}
