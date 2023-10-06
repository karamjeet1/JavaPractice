public class Demo {
    public static void main(String[] args) {
        System.out.println(Sum(10, 20));
        System.out.println(Sum(15, 20, 30));
        System.out.println(Sum(10.0f, 20.0f));
    }

    public static int Sum(int x, int y, int z) {
        return x + y + z;
    }

    public static float Sum(float x, float y) {
        return x + y;
    }
}
