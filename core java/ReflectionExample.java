class Demo {
    public void show() {
        System.out.println("Method Invoked Using Reflection");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("Demo");

        System.out.println("Methods:");

        for (java.lang.reflect.Method m : c.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        Object obj = c.getDeclaredConstructor().newInstance();

        java.lang.reflect.Method method =
                c.getDeclaredMethod("show");

        method.invoke(obj);
    }
}
