import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // 리스트
        // 순서 구분, 중복 허용

        // ArrayList
        ArrayList list = new ArrayList(10); // 리스트 크기 = 10
        list.add(100);
        list.add("entj");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 자료형 제한
        ArrayList<Integer> list2 = new ArrayList(10);
    }
}
