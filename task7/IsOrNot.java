package task7;

public class IsOrNot {
    public static void main(String[] args){
        System.out.println(equalIsNot("This is not"));
    }

    public static boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
          
        for(int i = 0; i <= str.length() - 3; i++) {
            if(str.substring(i, i + 2).equals("is")) {
                is++;
            } else if(str.substring(i, i + 3).equals("not")) {
                not++;
            }
        }
                                        
        if(str.length() >= 2 && str.substring(str.length() - 2).equals("is"))
            is++;
                                                  
        return is == not;
    }
}
