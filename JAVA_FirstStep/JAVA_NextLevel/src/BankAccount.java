public class BankAccount {

    // 멤버변수
    int bankCode;
    int accountNo;
    String owner;
    int balance;
    boolean isDormant;
    int password;

    public BankAccount() {

    }

    // 메소드 (함수)
    void inquiry() {
    }
    void deposit() {
    }
    void withdraw() {
    }
    void heldDormant() {
    }

    // 생성자
    // 클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치해야함
    // new 연산자와 함께 사용
    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            boolean isDormant,
            int password
    ) {
        this.bankCode = bankCode; // 왼쪽 : 클래스정의된 멤버변수, 오른쪽 : 입력받은 값
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.isDormant = isDormant;
        this.password = password;
    }

}
