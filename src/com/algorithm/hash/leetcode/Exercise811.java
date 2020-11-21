package com.algorithm.hash.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Exercise811 {

    public static void main(String[] args) {
        String[] cpDomains = {"9001 discuss.leetcode.com"};
        String[] domains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        //subDomainVisits(cpDomains);
        subDomainVisit(domains);
        //test(cpDomains);
    }

    public static List<String> subDomainVisit(String[] cpDomains) {
        Map<String, Integer> map = new HashMap<>();
        Stack<String> stack = new Stack();

        for (String domain : cpDomains) {
            int index = domain.indexOf(" ");
            stack.push(domain.substring(0, index));
            stack.push(domain.substring(index + 1));
        }

        while (!stack.isEmpty()) {
            String domain = stack.pop();
            int number = Integer.parseInt(stack.pop());
            String[] arr = domain.split("\\.");
            String temp = "";
            for (int i = arr.length - 1; i >= 0; i--) {//key string value number
                temp = arr[i] + (temp.equals("") ? temp : "." + temp);
                map.put(temp, map.getOrDefault(temp, 0) + number);
            }

        }
        List<String> list = new ArrayList<>();
        for (String str : map.keySet()) {
            list.add(map.get(str) + " " + str);
        }
        return list;
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap();

        for (String str : cpdomains) {
            String[] line = str.split(" ");
            int count = Integer.valueOf(line[0]);
            String[] domains = line[1].split("\\.");//discuss.leetcode.com
            String temp = "";
            for (int i = domains.length - 1; i >= 0; i--) {
                temp = domains[i] + (temp.equals("") ? temp : "." + temp);
                System.out.println("temp= " + temp);
                if (!map.containsKey(temp)) {
                    map.put(temp, count);
                } else {
                    map.put(temp, map.get(temp) + count);
                }
                System.out.println(map);
            }
        }

        List<String> res = new ArrayList();
        for (String str : map.keySet()) {
            res.add(map.get(str) + " " + str);
        }

        return res;
    }


    //@TODO this is not finished yet
    public static List<String> subDomainVisits(String[] cpDomains) {
        String[] splitedDomain = new String[100];
        String[] number = new String[100];
        for (String domain : cpDomains) {
            splitedDomain = domain.split("\\s+");
            number = splitedDomain[1].split("\\.");
        }

        System.out.println(splitedDomain[0]);
        System.out.println(splitedDomain[1]);

        for (String i : splitedDomain) {
            System.out.println(i);
        }

        for (String i : number) {
            System.out.println(i);
        }

        return null;
    }

    public static void test(String[] domain) {
        for (String string : domain) {
            int index = string.indexOf(' ');
            System.out.println(index);
            int visit = Integer.parseInt(string.substring(0, index));
            System.out.println(visit);
            String d = string.substring(index + 1);
            System.out.println(d);
        }


    }
}
