
public class example1 {
    public example1() {
        {
            for (int i = 0; i < 5; i++) {
                for (int j = 4; j > i; j--) {
                    System.out.print(".");
                }
                int count = i + 1;
                System.out.print("" + count);
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        new example1();
    }
}