class outer{
    int a =10;
    void outermethod(){
        System.out.println("I am in outer class and value is "+a);
    }
    class inner{
        int b = 200;
        
        void innermethod() {
            System.out.println("I am in inner class and value is " + b);
        }
    }
}

public class lab5_1 {
    public static void main(String[] args) {
        outer obj1 = new outer();
        obj1.outermethod();
        outer.inner obj = obj1.new inner();
        obj.innermethod();
    }
}
