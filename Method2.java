
public class Method2 {
    public Method2() {
        {
            for (int i = 0; i < 5; i++) {
                for (int j = 4; j > i; j--) {
                    System.out.print(".");
                }
                int count = i + 1;
                System.out.print(count);

                for (int c = 0; c < i; c++) {
                    System.out.print(count);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Method2();
    }
}