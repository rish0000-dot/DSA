public class charpattren {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int car = 1; car <= i; car++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
