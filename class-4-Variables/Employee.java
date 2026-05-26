public class Employee {
    static int no_of_leaves=12;
    public static void main(String[] args) {
        //how to access static vairable
        /*
        a)using class Name
        b)directly in static context
        c)using Object Name
        */
        System.out.println(Employee.no_of_leaves);
        System.out.println(no_of_leaves);
        Employee e1=new Employee();
        System.out.println(e1.no_of_leaves);
    }
}
