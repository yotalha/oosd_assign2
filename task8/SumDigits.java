package task8;

public class SumDigits {
    public static void main(String[] args){
        System.out.println(sumDigits("aa1bc2d3"));
    }

    public static int sumDigits(String str) {
        int sum = 0;
        
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                sum = sum + str.charAt(i) - '0';
        }
                        
        return sum;
    }
}
