public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = "+a+"\nb = "+b);
        int temp = b;
        b = a;
        a=temp;
        System.out.println("a = "+a+"\nb = "+b);

    }
}
