package com.algorithm.crackingtocoding;

public class Exercise13 {

    public static void main(String[] args) {
        replaceSpace("Mr John Smith");
    }

    public static void replaceSpace(String string) {

        char[] chars = string.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                builder.append("%20");
            } else {
                builder.append(chars[i]);
            }
        }
        System.out.println(builder);
    }
}
