public class TestTwo {
    public void m1(){
        m2();
    }
    public void m2(){
        System.out.println("GE");
    }
    public static void main(String[] args) {
        TestTwo t1=new TestTwo();
        t1.m1();
    }
}
