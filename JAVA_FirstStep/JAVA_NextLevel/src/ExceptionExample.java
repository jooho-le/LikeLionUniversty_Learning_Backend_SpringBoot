import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {

        // 예외 (Exception)

//        int a = 10;
//        int b = 0;
//        int c = a / b;

        ArrayList arrayList = new ArrayList(3);

//        try {
//            arrayList.get(10);
//        } catch(Exception e) {
//            e.printStackTrace();
//            System.out.println("에러 발생"); // 이렇게 되기도 함, 하지만 보안적으로는 안좋음
//        } finally {
//            System.out.println("finally");
//        }

        try {
            arrayList.get(10);
        } catch(IndexOutOfBoundsException ioe) {
            System.out.println("IndexOutOfBoundsException 에러 발생");
        } catch(IllegalAccessError iae) {
            System.out.println("IllegalAccessError 에러 발생");
        }
        finally {
            System.out.println("finally");
        }


    }
}
