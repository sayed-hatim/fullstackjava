package abstarct;

public class Userclass  extends  Myclass{
    public void  myabstactfun(){
        System.out.println("user one class1");
    }
    public static  void main(String[] args){
        Myclass obj1 = new Userclass();
        obj1.myabstactfun();
    }
}
