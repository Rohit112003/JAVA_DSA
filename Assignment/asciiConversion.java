package Assignment;

public class asciiConversion {
    public static void main(String[] args) {
        String str = "azyy";
       String ans =  convert(str);
        System.out.println(ans);
    }

    private static String convert(String str) {
        StringBuilder builder = new StringBuilder();
        int length = str.length();
        for(int i = 0; i<length;i++){
            if(i%2!=0){
                char upper = Character.toUpperCase(str.charAt(i));
                int asciiValue = (int) upper;
                for(int j =1; j<=3; j++){
                    if(asciiValue>=65 && asciiValue<90){
                        asciiValue++;
                    }else{
                        asciiValue=65;
                    }


                }


                char newValue = (char) asciiValue;
                asciiValue=0;
                builder.append(newValue);


            }else{
                builder.append(str.charAt(i));
            }

        }
        String resultString = builder.toString();
        return resultString;


    }
}
