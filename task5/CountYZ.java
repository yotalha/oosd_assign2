package task5;

public class CountYZ {

    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'z' || str.charAt(i) == 'y') && !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }
        if (str.charAt(str.length() - 1) == 'z' || str.charAt(str.length() - 1) == 'y') {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print(countYZ("day fyyyz"));
    }
}
