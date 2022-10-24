import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {

        //Specify the Type you want to print with type parameters after the class name
        Test<String> test = new Test("Test");
        test.doWhatIWant();
        Test<Integer> test2 = new Test(34);
        test2.doWhatIWant();



    }
}
