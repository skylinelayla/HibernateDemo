package com.shikun.annotation;

/**
 * Created by SHIKUN on 2016/8/12.
 */
public class FilterTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("shikun");
        user.setEmail("a1223@163.com");
        user.setId(1);


        String result=query(user);
        System.out.println(result);


    }


    public static String query(Object object) {

        //注解解析方式
        StringBuilder sb = new StringBuilder();
        Class c = object.getClass();//反射技术

        boolean isExist = c.isAnnotationPresent(Table.class);
        if (!isExist) {
            return null;
        }
        Table t = (Table) c.getAnnotation(Table.class);
        String tablename = t.value();
        sb.append("SELECT * FROM ").append(tablename).append(" 1=1 ");
        return sb.toString();



    }
}
