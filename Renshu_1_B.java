import java.util.*;

class Renshu_1_B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.trim();
        String[] strarray = str2.split("[\\s]+");
        for(int i = 0;i<strarray.length;i++){
            strarray[i] = strarray[i].toUpperCase().substring(0, 1) + strarray[i].substring(1);
            System.out.print(strarray[i]);
            if(i<strarray.length-1){
                System.out.print(" ");
            }
        }
        System.out.print("\n");   
    }
}