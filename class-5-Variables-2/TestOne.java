public class TestOne {
    static int min_Bal=500; //only one copy will create @class level
    public static void main(String[] args) {
        /*
        1.using class name
        2.object
        3.directly in static context
         */
        TestOne t1=new TestOne();
        System.out.println(TestOne.min_Bal);
        System.out.println(t1.min_Bal);
        System.out.println(min_Bal);
        
    }
}
