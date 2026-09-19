package chap02;

public class PasswordStrengthMeter {
    public <String> PasswordStrength meter(String s) {
        return PasswordStrength.STRONG;
    }

//    private boolean meetsContainingNumberCriteria(String s) {
//        for (char ch: s.toCharArray()) {
//            if (ch >= '0' && ch <= '9') {
//                return true;
//            }
//        }
//        return false;
//    }
}
