import java.awt.Color;

public class Turtle_Draw
{
    public static void main( String[] args)
    {
        World turtleWorld = new World();
        Turtle bob = new Turtle(turtleWorld);
        Turtle billy = new Turtle(turtleWorld);
        bob.setPenColor(Color.BLUE);
        billy.setPenColor(Color.BLACK);
        bob.penDown();
        billy.penDown();
        Integer count = 0;
        while (count <4){
        Integer count2 = 0;
        while (count2 <= 4){
        bob.forward(50);
        bob.turnRight();
        billy.turnRight();
        billy.forward(50);
        count2 +=1;
    }
        bob.forward(150);
        billy.forward(150);
        count += 1;
    }
    }
    }

        