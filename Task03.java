/**
 * Created by Роман on 26.11.2015.
 */
public class Task03 {

    public static void calcFunction(double a, double b, double h){
        double Fx;
        double x;
        x = a;
        System.out.print("  F(x)           x\n");
        while(x < b) {
            Fx = Math.tan(2 * x) - 3;
            System.out.println(String.format("%.5f",Fx)+"        "+String.format("%.2f",x));
            x+=h;
        }
    }

    public static void main(String [] args){
        calcFunction(-0.5, 3, 0.5);
    }
}
