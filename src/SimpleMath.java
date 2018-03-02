/**
 * @author Pushkarraj
 * @since 02-03-2018.
 */
public class SimpleMath implements Cloneable{
    private int a;
    private int b;

    public SimpleMath() {
    }

    public SimpleMath(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a+b;
    }

    public int substract(){
        return a-b;
    }

    public int multiplication(){
        return a*b;
    }

    public int division(){
        return a/b;
    }
}
