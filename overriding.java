// Parent class
class Parent {
    void show() {
        System.out.println("This is the parent class");
    }
}

// Child class
class Child extends Parent {
    @Override

    void show() {
        System.out.println("This is the child class");
    }
}

// Main class
public class overriding { // Class name matches the file name
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
