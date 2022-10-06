
//2!!!!
public class Program {
    public  int n;
    public  double[] b,x;
    public  double[][]a;

    Program(int n,double[]b,double[]x,double[][]a)
    {
        this.n=n;
        this.a=a;
        this.b=b;
        this.x=x;
        
    }
    public void view(double[] x)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(x[i]+" ");
        }
    }

    public double[] PR()
    {
        
        for (int k = 0; k < n; k++) 
        {
            
            int max = k;
            for (int i = k + 1; i < n; i++) 
                if (Math.abs(a[i][k]) > Math.abs(a[max][k])) 
                    max = i;
 
           
            double[] temp = a[k]; 
            a[k] = a[max]; 
            a[max] = temp;
 
          
            double t = b[k]; 
            b[k] = b[max]; 
            b[max] = t;
 
            
            for (int i = k + 1; i < n; i++) 
            {
                double factor = a[i][k] / a[k][k];
                b[i] -= factor * b[k];
                for (int j = k; j < n; j++) 
                    a[i][j] -= factor * a[k][j];
            }

       
        }
        
        for (int i = n - 1; i >= 0; i--) 
        {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) 
                sum += a[i][j] * x[j];
            x[i] = (b[i] - sum) / a[i][i];
        }        

        return x;
    }
}
