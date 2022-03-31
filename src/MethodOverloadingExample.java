public class MethodOverloadingExample {
    void add() {
        System.out.println("Method 1");
    }

    void add(int x, int y) {
        System.out.println("Second Method");
    }

    void add(float x, float y) {
        System.out.println("Third method");
    }

    void add(int x, float y) {
        System.out.println("Fourth method");
    }

    public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.add(5, 5);
        methodOverloadingExample.add(12.3f, 4.5f);
        methodOverloadingExample.add(5, 12.8f);
        methodOverloadingExample.add();
    }
}
