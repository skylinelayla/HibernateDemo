package com.shikun.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * java标准注解是override deprecated suppresswarnings 警告类型,可以忽略的注解类型
 * Created by SHIKUN on 2016/8/12.
 */
@AnnotationTest.Description(desc = "I am a class annotation", author = "shikun", age = 18)
public class AnnotationTest {

    @SuppressWarnings(value = {"unchecked", "fallthrough"})
    public void test() {

    }

    /*
    注解的分类： 源码的注解：注解只在源码中存在，编译时的注解：在class文件存在，在源码存在，运行时的注解：只在运行时存在

    元注解，注解的注解： @Target     元注解 描述注解可以用在什么地方
            @Rentention 表示需要在什么级别保存该信息，用语描述注解声明周期
            @Documented 可以将元注解添加到javadoc中
            @Inherited
     */
    @Target(ElementType.TYPE)
    public @interface Table {
        //数据表名注解 默认值为类名称
        public String tableName() default "className";
    }

    @Target(ElementType.FIELD)
    public @interface NoDBColum {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Column {
        public String name() default "fieldname";

        public String setFuncName() default "setField";

        public String getFuncName() default "getField";

        public boolean defaultDBValue() default false;

    }

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)//运行时注解
    @Inherited
    @Documented
    public @interface Description {

        //只有一个注解的时只能使用value，不能使用其他名称
        String desc();

        String author();

        int age() default 18;

    }

    //注解的使用
    @AnnotationTest.Description(desc = "I am method annoattion", author = "Mooc", age = 18)
    public String eyeColor() {
        return "red";
    }



    /*
    常见的第三方注解

    spring有： @Autowired  @Service @Repository

     */

    public static void main(String[] args) {


        /*
        解析
         */
        //找到类的注释的内容
        try {
            Class c = Class.forName("com.shikun.annotation.Aa");
            boolean isExist = c.isAnnotationPresent(Description.class);
            if (isExist) {
                Description d = (Description) c.getAnnotation(Description.class);
                System.out.println(d);
            }
            //找到方法上的注解
            Method method[] = c.getMethods();
            for (Method m : method) {
                boolean isexist = m.isAnnotationPresent(Description.class);
                if (isexist) {
                    Description e = (Description) m.getAnnotation(Description.class);
                    System.out.println(e.age());
                }
            }


        } catch (Exception ex) {
            ex.printStackTrace();

        }



    }


}

class Aa extends AnnotationTest {

    public void test() {

    }

    public String eyeColor() {
        return "red";
    }


}

