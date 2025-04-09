//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void greet(){
        System.out.println("hey");
    }
    public static  int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        greet();
        int r = add(  6, 7) ;
        System.out.println(r);



    }
}