/**
 * SistemeTriungulare
 */
public class SistemeTriungulare {

    public static void main(String[] args) {
      /*//1
        double[][]a=new double[][]{{1,-1,4,7,3},{0,2,5,-2,8},{0,0,3,6,9},{0,0,0,4,-3},{0,0,0,0,5}}; 
        double[] b=new double[]{-1,2,1,-2,3};
        double[] x=Algoritm( a,b);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+"||");
        }
        */
        double[][]a=new double[][]{{1,2,-4,},{2,-1,3},{-3,4,1}};
        double []b=new double[]{-2,9,13};
        Program prg=new Program(3, b, new double[3] , a);
            
        prg.view( prg.PR());

        
        
    }
    //1
    public static double[] Algoritm(double[][] a,double []b)
    {
        double []x=new double[a.length];

        
            x[a.length-1]=b[a.length-1]/a[a.length-1][a.length-1];
        
        
        for (int k = x.length-1; k>=0; k--) {
            double S=0;
            for (int i = k+1; i < x.length; i++) {
                S+=a[k][i]*x[i];
            }
            x[k]=(b[k]-S)/a[k][k];
        }
     return x;

    }


}