/**
 * Created by Роман on 26.11.2015.
 */
public class Task02 {

    public static void main(String[] args){
        double pow;
        double an = 1;
        double e = 0.00001;
        double[] mass = new double[500];
        int n = 0;
        while (an > e){
            pow = Math.pow(n+1,2);
            an = 1/pow;
            mass[n]=an;
            System.out.println("a"+n+" = "+String.format("%.10f",(double)mass[n])+" ;");
            n++;
        }
        System.out.println("Minimal n for (an < e, e=0,00001) is  : "+(n-1));
    }
}

