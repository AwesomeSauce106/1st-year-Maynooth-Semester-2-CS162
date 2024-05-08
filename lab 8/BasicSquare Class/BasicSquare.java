import java.util.*;
public class BasicSquare{
    private int len;
    public BasicSquare(){
        len = 1;
    }
    public BasicSquare(int l){
        len = l;
    }
    public int getLen(){
        return len;
    }
    public void setLen(int num){
        len = num;
    }
    public int getPerimeter(){
        return len*4;
    }
    public int getArea(){
        return len*len;
    }
}
