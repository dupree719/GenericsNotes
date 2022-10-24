public class Test<T> {

    //Declare a variable of type T
    T whatever;

    //Create constructor
    public Test(T whatever) {
        this.whatever = whatever;
    }

    //Create a method that prints the variable value
    public void doWhatIWant(){
        System.out.println(whatever);
    }
}
