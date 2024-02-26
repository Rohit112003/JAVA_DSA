package DynamicProgramming;

public class NinjaTraining {

    public static void main(String[] args) {
        int[][] points = {
                {1,2,5},
                {3,1,1},
                {3,3,3},
        };

        int n = points.length;
        int ans = ninja(n-1, 3,points);
        System.out.println(ans);
    }
    public static int ninja(int day, int last, int[][] points){

        if(day==0){
            int maxi = 0;
            for(int i =0; i<3;i++){
                if(i!=last){
                    maxi = Math.max(maxi, points[0][i]);

                }
            }
            return maxi;
        }
        int maxi =0;
        for(int i = 0; i<3; i++){
            if(i!=last){
                int point = points[day][i] + ninja(day-1,i, points);
                maxi = Math.max(maxi,point);
            }
        }
        return maxi;



    }
}
