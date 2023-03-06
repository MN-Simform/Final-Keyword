public class Main extends FinalClass{
//    @Override
//    void FinalMethod(){ //Final Method Cannot Be Overridden
//        System.out.println("Final Method in Main Class");
//    }
    public static void main(String[] args) {
        Main main = new Main();
        FinalSuperClass finalSuperClass = new FinalSuperClass();

//        main.MAX = 10; // Cannot re-assign value to final variable
//        Main.PI = 3.15; // Cannot re-assign value to final variable
        main.finalMethod();
        finalSuperClass.show();
    }
}