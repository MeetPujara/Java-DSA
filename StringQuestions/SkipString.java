package StringQuestions;

public class SkipString {
    static void main() {
//        skip("","bcdapplefg");
//        System.out.println(skipret("bccdapplelfg"));
        System.out.println(skipAppNotApple("bccdapplfhs"));

    }

    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.startsWith("apple")){
            skip(p,up.substring(5));
        }else{
            skip(up.charAt(0)+p,up.substring(1));
        }
    }

    static String skipret(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipret(up.substring(5));
        }
        return up.charAt(0) + skipret(up.substring(1));
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        return up.charAt(0) + skipAppNotApple(up.substring(1));
    }
}
