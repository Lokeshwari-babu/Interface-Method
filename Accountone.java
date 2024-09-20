interface Account{
    int get_bal();

    void close_Acc();
}

class SA implements Account {
    public int get_bal() {
        return 100;

    }
    public void close_Acc() {
        System.out.println("Account closed successfully");
    }

    public static void main (String[]args) {
        SA obj = new SA();

        obj.get_bal();
        obj.close_Acc();
    }
}