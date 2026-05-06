public class ClassExample_bankaccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        // bankAccount.password = 123456;
        // System.out.println(bankAccount.password);

        // 인스턴스 변경은 함수를 만들어서 변경하는게 정석

        bankAccount.changePassword(123456);
    }
}
