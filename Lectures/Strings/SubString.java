public class SubString {
    public static String subStr(String str, int si, int ei){
        String subString = "";
        for(int i=si; i<ei; i++){
            subString+= str.charAt(i);
        }
        return subString;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        // System.out.println(subStr(str, 0, 5));
        System.out.println(str.substring(0, 6)); //In-build function
    }
}
