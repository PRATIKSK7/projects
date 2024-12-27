public class shift {
    public static void main(String[] args) {
        int a = -10;
        System.out.println("Left shift(a << 2):" + (a << 2)); //8 << = 32 (binary 1000 becomes 100000)
        System.out.println("Right Shift (a >> 2):" + (a >> 2)); // 8 >> 2 = 2 (binary 1000 becomes 10)
        int b = -2;
        System.out.println("Unsignned Right Shift (b >>> 2):" + (b >>> 2));
    }
}
