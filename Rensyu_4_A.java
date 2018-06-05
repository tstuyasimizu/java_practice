import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import jdk.internal.dynalink.beans.StaticClass;

class Rensyu_4_A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int  array = str.length();
        String tes = "\\s";
        Pattern pattern = Pattern.compile(tes);
        Matcher matcher = pattern.matcher(str);
        
        while(array>100 && matcher.find()){
            str = sc.nextLine();
            array = str.length();
            matcher = pattern.matcher(str);
             
        }
        /*while( matcher.find()){
            matcher = pattern.matcher(str);
        }
  */  

        String[] strArraySub = str.split("");

        String[] array2 = new String[array];
        for(int i = 0;i<strArraySub.length;i++){
            array2[i] = strArraySub[i];
        }
        sort(array2);
        StringBuilder builder = new StringBuilder();
        for(int k = 0;k<array2.length;k++){
            builder.append(array2[k]);
        }
        String str3 = builder.toString();
        System.out.println(str3);
    }

    public static String[] sort(String[] a) {
        int b =a.length;
        String frast = a[0];
        String last = a[a.length-1];
        int mid = a.length/2;
        int i = 0;
        if(b%2==0){
            for(int j=a.length-2;j>=mid;j--){
                a[j+1]=a[j];
                a[i]=a[i+1];
                i++;
            }
            a[mid]=last;
            a[mid-1]=frast;
        }else{
            for(int j=a.length-2;j>mid;j--){
                a[j+1]=a[j];
                a[i]=a[i+1];
                i++;
            }
            a[mid+1]=last;
            a[mid-1]=frast;
        } 
        return a;                           
    }
}