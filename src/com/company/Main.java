package com.company;

import com.sun.deploy.util.StringUtils;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEvenWord("tattletale"));
        System.out.println(isEvenWord("arraigning"));
        System.out.println(isEvenWord("banana"));

    }

    private static boolean isEvenWord(String s) //s could be named better
    {
        if (s.length() == 0)
            return true;

        String search = String.valueOf(s.charAt(0)); // search could have a better variable name
        s = s.substring(1);

        if(s.contains(search)) {
            s = s.replace(search, ""); //what if there is more than one of the character 'search'?
            return isEvenWord(s);

        }

        return false;

    }

}
