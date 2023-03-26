public class Palindromo {

    boolean palindromoRecursivo(String s){
        if (s.length()<=1) {
            return true;
        } else {
            System.out.println('x');
            return s.charAt(0) == s.charAt(s.length()-1) && palindromoRecursivo(s.substring(1,s.length()-1));
        }
    }

    boolean palindromoIterativo(String s){
        while (s.length()>1) {
            System.out.println('x');
            if (s.charAt(0) != s.charAt(s.length()-1)) {
                return false;
            }
            s = s.substring(1,s.length()-1);
        }
        return true;
    }
}
