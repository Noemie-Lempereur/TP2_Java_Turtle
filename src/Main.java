public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(200,200);
        System.out.println(turtle.isDown());
        turtle.penDown();
        System.out.println(turtle.isDown());
        turtle.moveTo(4,7);
        turtle.moveTo(15,96);
        turtle.forward(24);
        turtle.forward(60);
        turtle.left(90);
        turtle.forward(5);
        turtle.backward(78);
    }
}