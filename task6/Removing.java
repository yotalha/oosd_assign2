package task6;

public class Removing {
    public static void main(String[] args){
        String result = withoutString("Hello there", "llo");
        System.out.println("Result: " + result);
    }

    public static String withoutString(String base, String remove) {
        char[] arr = new char[base.length()];
        int count = 0;
        int i = 0;
            
        while(i <= base.length() - remove.length()) {
            if(base.substring(i, i + remove.length()).toLowerCase().equals(
                remove.toLowerCase())) {
                i += remove.length();
            } else {
                arr[count] = base.charAt(i);
                count++;
                i++;
            }
        }
                                                            
        while(i < base.length()) {
            arr[count] = base.charAt(i);
            count++;
            i++;
        }
                                                                              
        return new String(arr, 0, count);
    }
}
