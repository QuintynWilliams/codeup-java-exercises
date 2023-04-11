public class MethodsLesson {
    public static void main(String[] args) {
        System.out.println(sayHello("Quintyn"));
        System.out.println(sayMethod());
//        System.out.println(sayMethod(2));
        System.out.println(sayMethod("Quintyn"));
        System.out.println(sayMethod("Salutations", "Quintyn"));
        count(5);
    }
    public static String sayHello(String name){
        String message = "Hello, " + name;
        return message;
    }

//  METHOD OVERLOADING
//  V1
    public static String sayMethod() {
            return sayMethod("Hello", "World");
        }

//  V2
    public static void sayMethod(int times) {
            for (int i = 0; i < times; i += 1) {
                sayMethod();
            }
        }
//  V3
    public static String sayMethod(String name) {
            return sayMethod("Hello", name);
        }
//  V4
    public static String sayMethod(String greeting, String name) {
            String log = greeting + ", " + name + "!";
            return log;
        }

    public static void count(int times) {
        if (times <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(times);
        count(times - 1);
    }

}
