/**
 * Created by Роман on 26.11.2015.
 */
public class Task04 {
    public int n = 11;
    public double _max = 0;
    public double[] max = new double[n];
    public double[] seq = new double[n];


    public void massAdd(){
        for (int i = 0; i < n ; i++) {
            seq[i] = (Math.random()*10);
            System.out.print(String.format("%.4f",seq[i])+ " ");
        }
    }

    public void maxCalc(){

        if ((n % 2) != 0) {
            for (int i = 0; i < n / 2 + 1; i++) {
                if (seq[i] == seq[n - 1 - i]) {
                    max[i] = seq[i];
                } else {
                    max[i] = seq[i]+seq[n - 1 - i];
                }
                System.out.print(String.format("%.4f", max[i]) + " ");
            }
        }
        else{
            for (int i = 0; i < n/2; i++) {
                max[i] = seq[i]+seq[n-1-i];
                System.out.print(String.format("%.4f",max[i])+ " ");
            }
        }

            for (int i = 0; i < max.length; i++) {
                if (max[i] > _max) {
                    _max = max[i];
                }
            }
            System.out.println("                      MAX = " +String.format("%.4f",_max));
    }



    public static void main(String[] args){
        massiveForm m = new massiveForm();
        m.massAdd();
        System.out.println("\n");
        m.maxCalc();

    }
}
