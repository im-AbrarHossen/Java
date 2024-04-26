class maxClass{
    double Max_Sugar_Level(double[] a){
        double max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]<7.8){
                if(max<a[i]){
                    max = a[i];
                }
            }
        }
        return max;
    }
    double Max_Sugar_Level_1(double[] a){
        double max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>=7.8 && a[i]<=11.0){
                if(max<a[i]){
                    max = a[i];
                }
            }
        }
        return max;
    }
    double Max_Sugar_Level_2(double[] a){
        double max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>=11.1){
                if(max<a[i]){
                    max = a[i];
                }
            }
        }
        return max;
    }
}