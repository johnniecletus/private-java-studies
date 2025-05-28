import java.util.Arrays;

public class PersonalArrays {

    public static void main(String[] args) {

        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(newArray));
    }

}
