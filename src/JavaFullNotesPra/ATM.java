package JavaFullNotesPra;
/*
Use of methods
--------------------
- It is not recommended to write a business logic directly in class.
- So java says for such situation make use of methods.

 */
public class ATM {
    // For Ex: (Not Recommended)
    public static void main(String[] args) {
        System.out.println("withdrawal money");
        moneyWithdrawal();
    }

    // (Recommended)
    public static void moneyWithdrawal() {
        System.out.println("withdrawal money");
    }
}

