class Account{
    int acc_Id;          //instance var
    static int min_Bal;  //static var
    public static void main(String[] args) {
        int branch_Code;  //local var
        Account a1=new Account();
        System.out.println(a1.acc_Id);
        System.out.println(min_Bal);
    }
}