package dongbinajava_02;

public class Node {
    private int x;
    private int y;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    //생성자
    public Node(int x, int y){
        this.x=x;
        this.y=y;
    }
   public Node getcenter(Node other){
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
   }
}
