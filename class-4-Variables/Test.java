public class Test {
    //instance var-separate copy will create for every object
    int a=10;
    int b=20;
    //only copy will create @class level and shard to every object
    static int c=30;  
    
    public static void main(String[] args) {
        int d=40;
        Test t1=new Test();
        Test t2=new Test();
        
        System.out.println(t1.a+t2.b+c);
        t2.a=11;
        System.out.println(t2.a+t1.b+c);
        c=31;
        System.out.println(t1.a+t2.b+c);
        t1.b=21;
        System.out.println(t1.a+t1.b+c);
    }
}
