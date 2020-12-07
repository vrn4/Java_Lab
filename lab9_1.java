class number{
    int a = 10;
    int b = 10;
    number(){
        System.out.println("Sum is "+(a+b));
    }
}
class add extends number{
    int x=5,y=5;
    add(){
        super();
        System.out.println("Sum is "+ (x+y));
    }
    void display(){
        System.out.println("Value is displayed");
    }   
}
public class lab9_1 {
    public static void main(String[] args) {
        add obj1 = new add();
        obj1.display();        
    }
}
