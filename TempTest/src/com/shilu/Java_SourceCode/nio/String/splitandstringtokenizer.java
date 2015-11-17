package com.shilu.Java_SourceCode.nio.String;
import java.util.StringTokenizer;
/**
 * Created by shilu on 15-11-17.
 */
public class splitandstringtokenizer {

    public static void main(String[] args) {
        //testSplit();
        LocalVandStatic();

    }
    private static void testSplit() {
        String orgStr = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <10000 ; i++) {
            sb.append(i);
            sb.append(",");
        }
        orgStr = sb.toString();
        long start = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            orgStr.split(",");
        }
        long end  = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        String orgStr1 = sb.toString();
        StringTokenizer st = new StringTokenizer(orgStr1,",");

        for (int i = 0; i <10000 ; i++) {
            st.nextToken();
        }

        st = new StringTokenizer(orgStr,",");
        end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        String orgStr2 = sb.toString();
        String temp = orgStr2;
        while(true){
            String splitStr = null;
            int j=temp.indexOf(",");
            if(j<0)break;
            splitStr=temp.substring(0, j);
            temp = temp.substring(j+1);
        }
        temp=orgStr2;
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static int b = 0;
    public  static  void  LocalVandStatic(){
        int a = 0;
        long starttime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            a++;//在函数体内定义局部变量
        }
        System.out.println(System.currentTimeMillis() - starttime);

        starttime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            b++;//在函数体内定义局部变量
        }
        System.out.println(System.currentTimeMillis() - starttime);
    }

}
