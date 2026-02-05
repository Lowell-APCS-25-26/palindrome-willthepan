package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {

        String l = s.toLowerCase();
        String m = "";
        String t = "";

        for (int i = l.length() - 1; i >= 0; i--) {
            if (l.charAt(i) != ' ' && Character.isLetter(l.charAt(i))) {
                t = t + l.charAt(i);
            }
        }

        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) != ' ' && Character.isLetter(l.charAt(i))) {
                m = m + l.charAt(i);
            }
        }

        return t.equals(m);
    }

    public String reverse(String s) {
        String n = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            n = n + s.charAt(i);
        }
        return n;
    }
}
