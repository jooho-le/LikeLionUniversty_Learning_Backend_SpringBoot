public class BankAccount {

    // 멤버변수
    // private : 동일 클래스 내에서만 참조 가능
    private int bankCode;
    private int accountNo;
    private String owner;
    private int balance;
    private boolean isDormant;
    private int password;

    public BankAccount() {

    }

    // 메소드 (함수)
    public void inquiry() {
    }
    public void deposit() {
    }
    public void withdraw() {
    }
    public void heldDormant() {
    }
    public void changePassword(int password) {
        this.password = password;
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
