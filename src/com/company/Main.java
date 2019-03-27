package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt(),i;
        String line[]=new String[4];
        for(i=0;i<test;i++){
            line[i]=sc.next();
        }
        int count[]={0,0,0,0};
        char ch=' ';
        for(i=0;i<test;i++)
        {
            for(int j=0;j<line[i].length();j++){
                ch=line[i].charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    count[i]++;
                }
            }
        }

        for(i=0;i<test;i++){
            System.out.println(count[i]);
        }

    }
}
