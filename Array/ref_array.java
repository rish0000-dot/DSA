package Array;

public class ref_array {
    public static void update(int m[]) {
        for (int i = 0; i < m.length; i++) {
            m[i] = m[i] + 1;
        }

    }

    public static void main(String[] args) {
        int m[] = { 98, 99, 100 };
        update(m);
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }
}
