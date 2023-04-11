public class StringsLesson {
    public static void main(String[] args) {

        System.out.println("Hello " + "World");

        String message = "Hello";
        System.out.println(message.equals("Hello"));    //true
        System.out.println(message.startsWith("He"));   //true
        System.out.println(message.endsWith("lo"));     //true

        String passWord = "password";
        System.out.println(passWord.length() >= 8);     //true

        String messageTwo = " This, means to say, Hello ";
        int position = messageTwo.indexOf("means");
        System.out.println(position);                   //6

        System.out.println(messageTwo.toLowerCase());   // this, means to say, hello
        System.out.println(messageTwo.toUpperCase());   // THIS, MEANS TO SAY, HELLO
//        Remove lead and trail whitespaces
        System.out.println(messageTwo.trim());          //This, means to say, Hello

        System.out.println(messageTwo.charAt(21));      //H
    }
}
