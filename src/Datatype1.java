public class Datatype1 {
    public static void main(String[] args ){
        char c = '=';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);

        byte b = 2;
        System.out.println(b);

        short s = 50;
        System.out.println(s);

        int i = -1000;
        System.out.println(i);

        long l = -3_000_000_000L;  // 3,000,000,000 Billion   // readbility    // java ignores underscores
        System.out.println(l);


        float f = 3.4F;        // by default java treats it as double , incompatible
        System.out.println(f);

        double d = 2.7;
        System.out.println(d);
    }
}
