public class TestThree {
    public void m1(){
        System.out.println(eid); //scope of local variable is within the method
    }
    public static void main(String[] args) {
        int eid=101;
        System.out.println(eid);
        TestThree t1=new TestThree();
        t1.m1();
    }
}
