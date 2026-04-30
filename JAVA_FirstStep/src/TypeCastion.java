public class TypeCastion {
    public static void main(String[] args) {

        // 형변환
        // byte < short < int < long <<< float < double

        // int a = 128;
        // short b = a; // 범위가 허용 불가라서 에러 발생

        short x = 10;
        int y = x;
        System.out.println(x);
        System.out.println(y);

        // 강제형변환(명시적 형변환)
        int a = 128;
        short b = (short) a;
        byte c = (byte) a; // 오버플로우 발생 (-128~127이니까 127다음 되돌아감)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int m = 80;
        double n = m;
        System.out.println(m);
        System.out.println(n);

        double e = 10.32345145;
        float d = (float)e;
        System.out.println(e);
        System.out.println(d); // 허용되는만큼 자름

        int q = 10;
        short w = 20;
        short g = (short)(e + q); // 전체형변환
        System.out.println(g);

    }
}
