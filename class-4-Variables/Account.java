//Account class is user defined Data Type
class Account{
    String acc_Name;
    int acc_Id;
    // +
    public void deposit(){
        System.out.println("Account Class  Method");
    }
}

class Demo{
    public static void main(String[] args){
        //java is static typed programmig
        int a=100;
        Account a1=new Account();
        System.out.println(a);
        System.out.println(a1);
    }
}