public class RotationStr {
    static boolean isRotate(String s1, String s2){
        String s3 = s1+s1;
        return s3.contains(s2);
    }
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "lohel";
        System.out.println(isRotate(s1, s2));
    }
}