public class ArrayExample {
    public static void main(String[] args) {

        // 배열
        int[] price = {10000, 9000, 40000, 7000};
        String[] mbti = {"entj", "intj"};

        System.out.println(price[0]);
        System.out.println(mbti[0]);

        // 인덱스 값 변경
        price[1] = 8000;
        System.out.println(price[1]);

        System.out.println(price); // 객체라서 주소값을 출력
    }
}
