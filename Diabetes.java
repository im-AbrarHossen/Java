import java.util.Scanner;
public class Diabetes {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            double a[] = new double[11];
            int j=0, k = 0, l = 0;
            for(int i=0; i<11; i++){
                a[i] = sc.nextDouble();
            }
            for(int i=0; i<a.length; i++){
                if(a[i]<7.8){
                    k++;
                }
            }
            for(int i=0; i<a.length; i++){
                if(a[i]>=7.8 && a[i]<=11.0){
                    j++;
                }
            }
            for(int i=0; i<a.length; i++){
                if(a[i]>=11.1){
                    l++;
                }
            }
            maxClass obj=new maxClass();
            if(k>0){
                System.out.println("Normal\nTotal: "+k+" Max Sugar Level: "+obj.Max_Sugar_Level(a));
            }
            if(j>0){
                System.out.println("Prediabetes\nTotal: "+j+" Max Sugar Level: "+obj.Max_Sugar_Level_1(a));
            }
            if(l>0){
                System.out.println("Diabetes\nTotal: "+l+" Max Sugar Level: "+obj.Max_Sugar_Level_2(a));
            }
        }
    }
}