import java.util.Scanner;

import javax.crypto.spec.DHPublicKeySpec;

class Resyu_4_B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = Integer.parseInt(str);
        
        while(num==0 && num<=100000){
             str = sc.next();
             num = Integer.parseInt(str);
        }

        int[] num2 = new int[num];
        int[] add = new int[num];
        int[] sub = new int[num];
        
        for(int i=0;i<num;i++){
            String str2 = sc.next();
            int num3 = Integer.parseInt(str2);
            num2[i] = num3;
        }

        for(int j=0;j<num;j++){
            add[j] = num2[j]+1;
        }
        
        for(int k=0;k<num;k++){
            sub[k] = num2[k]-1;
        }
        int  sum =0;
        for(int i=0;i<num;i++){
            sum = sum+num2[i];
        }
        sum = sum/num;

        int sumSub = sum-1;
        int sumAdd = sum+1;
        
        int ans = much(num2,add,sub,sum);
        int ans2 = much(num2,add,sub,sumSub);
        int ans3 = much(num2,sub,add,sumAdd);
        
        int x = Math.max(ans, ans2);
        x = Math.max(x, ans3);
        System.out.println(x);
        
    }
    public static int much(int[]a,int[]b,int[]c,int sum){
        int con = 0;
        int con2 = 0;
        int con3 = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==sum){
                con++;
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]==sum){
                con2++;
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i]==sum){
                con3++;
            }
        }
        return con+con2+con3;
    }
    
    
}