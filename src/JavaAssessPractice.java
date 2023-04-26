
public class JavaAssessPractice {

    public static void main(String[] args) {

        int[] integers = {4, 6, 10, 8, 2};
        System.out.println(average(integers));

        PetDog Happy = new PetDog("happy", "pug", false);
        System.out.println(Happy.snuggle());

    }

    public static double average(int[] numbers) {
        int size = numbers.length;
        double total = 0;
        for(double num : numbers) {
            total += num;
        }
        total /= size;
        return total;
    }


}

