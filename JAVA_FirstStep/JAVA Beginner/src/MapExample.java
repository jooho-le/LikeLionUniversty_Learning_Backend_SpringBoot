import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        // 맵
        // 키-값 쌍을 요소로 가지는 데이터의 모음, 순서 구분 없음
        // 키는 중복 불가
        // 값은 중복 허용

        // HashMap
        HashMap map = new HashMap();
        map.put("age", 30);
        map.put("mati", "entj");

        System.out.println(map.get("age")); // 키값으로 접근

        // 자료형 제한
        HashMap<String, Integer> map2 = new HashMap();
    }
}
