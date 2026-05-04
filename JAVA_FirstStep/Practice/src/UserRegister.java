import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserRegister {
    public static void main(String[] args) {
        System.out.println("========");
        System.out.println("회원등록");
        System.out.println("========");

        boolean register = false;
        Scanner sc = new Scanner(System.in);

        while (!register) {
            System.out.println("회원가입 하시겠습니까\ny, n");
            System.out.print(">>");
            String register_input = sc.nextLine();

            if (register_input.equalsIgnoreCase("y")) {
                register = true;
                System.out.println("========");
                System.out.println("회원가입 진행");
                System.out.println("========");
            } else if (register_input.equalsIgnoreCase("n")) {
                System.out.println("========");
                System.out.println("회원가입 종료");
                System.out.println("========");
                System.exit(0);
            } else {
                System.out.println("입력값 확인");
            }
        }
        ArrayList users = new ArrayList();

        while (true) {
            HashMap user = new HashMap();

            System.out.print("id: ");
            String username = sc.nextLine();

            String password = ""; // 안정해진거 빈값으로 선언
            while (true) {
                System.out.print("pw: ");
                password = sc.nextLine();
                System.out.print("pw 확인: ");
                String password_confirm = sc.nextLine();

                if (password.equals(password_confirm)) {
                    break;
                } else {
                    System.out.println("========");
                    System.out.println("pw 불일치, 다시입력");
                    System.out.println("========");
                }
            }

            System.out.print("성명: ");
            String name = sc.nextLine();

            String birth_date = ""; // 외부에서 참조해서 여기 선언
            while (true) {
                System.out.println("생년월일(6자리)");
                birth_date = sc.nextLine();
                if (birth_date.length() == 6) {
                    break;
                } else {
                    System.out.println("========");
                    System.out.println("생년월일 다시입력");
                    System.out.println("========");
                }
            }

            System.out.print("이메일: ");
            String email = sc.nextLine();

            user.put("username", username); // 맵에 데이터 넣기 : input
            user.put("password", username);
            user.put("name", username);
            user.put("birth_date", username);
            user.put("email", username);

            users.add(user);
            System.out.println("========");
            System.out.println(user.get("name") + "가입 환영");
            System.out.println("========");

            System.out.println("회원가입 추가진행 하시겠습니까\ny, n");
            System.out.print(">>");
            String register_again = sc.nextLine();

            if (register_again.equalsIgnoreCase("y")) {
                ; // 아무런 로직 수행하지 않음
            } else if (register_again.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
