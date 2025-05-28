import java.util.ArrayList;
import java.util.Arrays;

public class PersonalArrays {

    public static void main(String[] args) {

        int[] newArray = new int[10];
        String[] newStringArray = {"boy", "girl", "man", "woman"};

        ArrayList<ClassMan> Citizens = new ArrayList<>();

        Citizens.add(new ClassMan("John", 25, "Chocolate"));
        Citizens.add(new ClassMan("Niko", 24, "Chocolate"));
        Citizens.add(new ClassMan("Domo", 25, "Dark"));


        for (ClassMan citizen : Citizens) {
            System.out.println(citizen);
        }


        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newStringArray));
    }


}


