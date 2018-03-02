/**
 * @author Pushkarraj
 * @since 02-03-2018.
 *
 *
 * Yet to be documented
 * 
 */
public class Start {
    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath(500,200);
        client(simpleMath);
        SimpleMath simpleMathClone = (SimpleMath) simpleMath.clone();
        client(simpleMathClone);
    }

    public static void client(SimpleMath simpleMath){
        System.out.println("Add = "+simpleMath.add());
        System.out.println("Sub = "+simpleMath.substract());
        System.out.println("Mul = "+simpleMath.multiplication());
        System.out.println("div = "+simpleMath.division());
    }
}
