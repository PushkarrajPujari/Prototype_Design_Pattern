/**
 * @author Pushkarraj
 * @since 02-03-2018.
 */
public class SimpleMath extends Object implements Cloneable{
    private int a;
    private int b;

    public SimpleMath() {
        System.out.println("Default constructor of SimpleMath.class");
    }

    public SimpleMath(int a, int b) {
        this();
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

    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
