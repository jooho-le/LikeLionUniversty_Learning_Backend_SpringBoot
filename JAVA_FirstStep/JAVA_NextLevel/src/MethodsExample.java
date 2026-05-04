public class MethodsExample {

    // 함수(메서드)
    // 값이 넘겨지면 작업을 수행한 후 반환 , 종료

    public static void main(String[] args) {

        int mod_result = mod(3, 2);
        System.out.println(mod_result);

        printNum(10);

        String str = greeting();
        System.out.println(greeting());

        greeting_2(); // 휘발됨

    }

    // 1. 입력 O, 출력 O
    static int mod(int a, int b) {
        int result = a % b;
        return result;
    }

    // 2. 입력 O, 출력 X
    static void printNum (int a) {
        System.out.println(a); // 휘발되는 변수임
    }

    // 3. 입력 X, 출력 O
    static String greeting() {
        return "Hello";
    }

    // 4. 입력 X, 출력 X
    static void greeting_2() {
        System.out.println("Hello");
    }

}
