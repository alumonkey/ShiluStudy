package com.shilu.Java_SourceCode.nio.String;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by shilu on 15-11-17.
 */
public class StringDemo {
    public static void main(String[] args) {

        //StringDemo.Demo01();
        StringDemo.substring();

    }
    /**
     * str1,str2,str4引用了相同的地址，str3开辟了新的内存空间
     */
    public  static void  Demo01(){
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = str1;
        System.out.println("is str1 = str2? "+(str1==str2));
        System.out.println("is str1 = str3? "+(str1==str3));
        System.out.println("is str1 refer to str3? "+(str1.intern()==str3.intern()));
        System.out.println("is str1 = str4 "+(str1==str4));
        System.out.println("is str2 = str4 "+(str2==str4));
        System.out.println("is str4 refer to str3?"+(str4.intern()==str3.intern()));

    }

    public static void substring() {

        List<String> handler = new ArrayList<String>();
        for (int i=0;i<1000;i++){
            HugeStr h = new HugeStr();
            ImprovedHugeStr h1 = new ImprovedHugeStr();
            handler.add(h.getSubString(1, 5));
            handler.add(h1.getSubString(1, 5));
        }

    }

    static class HugeStr{
        private String str = new String(new char[800000]);
        public String getSubString(int begin,int end){
            return str.substring(begin, end);
        }
    }

    static class ImprovedHugeStr{
        private String str = new String(new char[10000000]);
        public String getSubString(int begin,int end){
            return new String(str.substring(begin, end));
        }
    }

}
