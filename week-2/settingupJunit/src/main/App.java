public class App {
    public static void main(String[] args) {
        printnum(10);
    }
    
    public static void printnum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printnum(n - 1);
    }
}
