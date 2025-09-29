public class Demo2 {
    // Class variable → automatically initialized to 0
    static int classVar;

    // Instance variable → automatically initialized to 0
    int instanceVar;

    void show() {

        System.out.println("Class Variable (default): " + classVar);
        System.out.println("Instance Variable (default): " + instanceVar);
    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        obj.show();
    }
}
