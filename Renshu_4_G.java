import java.util.Scanner;
import java.lang.Double;

class Renshu_4_B{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = Integer.parseInt(str);
        double[] nx = new double[n];
        double[] py = new double[n];
        double[] qz = new double[n];
        for(int i = 0;i<nx.length;i++){
            String str2 = sc.next();
            nx[i]= Double.parseDouble(str2);
        }
        
        for(int i = 0;i<nx.length;i++){
            String str2 = sc.next();
            py[i]= Double.parseDouble(str2);
        }
        
        for(int k=0;k<nx.length;k++){
            qz[k] = Math.pow(py[k]-nx[k],2);
        }
        
        double sum = 0;
        for(int j=0;j<qz.length;j++){
            sum=sum+qz[j];
        }
        double sqrt = Math.sqrt(sum);
        //System.out.println(sqrt);
        System.out.println(String.format("%.2f", sqrt));
        
    }
}