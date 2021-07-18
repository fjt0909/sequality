package sequality;

public class Calculate {
    public int sum(int x, int y){
        return x + y;
    }

    public String AAA(int x, int y){
        int sum=x+y;
        double ave=(double)sum/2.0;

        return("Sum of "+x+" and "+y+" is "+sum+".Average is "+ave+".");
    }

    public String BBB(int x, int y){
        int sum=0;
        double ave=0.0;
        for(int i=x;i<=y;i++){
            sum+=i;
        }
        ave=(double)sum/(y-x+1);
        return("Sum of "+x+" to "+y+" is "+sum+".Average is "+ave+".");
    }

    public String CCC(int x, int y){
        int sum_odd=0;
        int sum_even=0;
        for(int i=x;i<=y;i++){
            if(i%2==0){
                sum_even+=i;
            }else{
                sum_odd+=i;
            }
        }
        return("Sum of odd of "+x+" to "+y+" is "+sum_odd+".Sum of even is "+sum_even+".");
    }
}