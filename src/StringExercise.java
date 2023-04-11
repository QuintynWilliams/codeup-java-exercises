public class StringExercise {
    public static void main(String[] args) {

        String ctrl = "";

        if (ctrl.startsWith("")) {
            ctrl += "We don't need no education\n";
        }
        if (ctrl.endsWith("education\n")) {
            ctrl += "We don't need no thought control";
        }

        System.out.println(ctrl);
    }
}
