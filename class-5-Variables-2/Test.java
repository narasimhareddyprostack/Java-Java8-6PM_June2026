public class Test {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bl;
    public static void main(String[] args) {
       int  a=100; 
       Test t1=new Test();
       System.out.println(t1.b);  //0
       System.out.println(t1.s);  //0
       System.out.println(t1.i);  //0
       System.out.println(t1.l);  //0
       System.out.println(t1.f);  //0.0
       System.out.println(t1.d);  //0.0
       System.out.println(t1.c);  //
       System.out.println(t1.bl); //false
    }
}
