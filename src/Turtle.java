public class Turtle extends Paint{

    private boolean isDown;
    private int heading;
    private Point position;


    public Turtle(int width, int height) {
        super(width, height);
        isDown = false;
        heading=0;
        position = new Point(0,0);
    }

    void penUp(){
        isDown=false;
    }

    void penDown(){
        isDown=true;
    }

    void forward(int distance){
        double distanceX = Math.cos(heading*Math.PI/180) * distance;
        double distanceY = Math.sin(heading*Math.PI/180) * distance;
        if(isDown()) {
            drawLine(position.getX(), position.getY(), (int) (position.getX() + distanceX), (int) (position.getY() + distanceY));
        }
        position.setX((int) (position.getX() + distanceX));
        position.setY((int) (position.getY() + distanceY));
    }

    void backward(int distance){
        double distanceX = Math.cos(heading*Math.PI/180) * distance;
        double distanceY = Math.sin(heading*Math.PI/180) * distance;
        if(isDown()) {
            drawLine(position.getX(), position.getY(), (int) (position.getX() - distanceX), (int) (position.getY() - distanceY));
        }
        position.setX((int) (position.getX() - distanceX));
        position.setY((int) (position.getY() - distanceY));
    }

    void moveTo(int x, int y){
        if(isDown()){
            drawLine(position.getX(),position.getY(),x,y);
        }
        position.setX(x);
        position.setY(y);
    }

    void left(int degrees){
        heading-=degrees;
    }

    void right(int degrees){
        heading+=degrees;
    }

    int getHeading(){
        return heading;
    }

    Point getPosition(){
        return position;
    }

    boolean isDown(){
        return isDown;
    }
}
