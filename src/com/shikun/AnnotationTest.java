package com.shikun;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * java标准注解是override deprecated suppresswarnings 警告类型
 * Created by SHIKUN on 2016/8/12.
 */
public class AnnotationTest {

    @SuppressWarnings(value = {"unchecked", "fallthrough"})
    public void test() {

    }

    /*
    元注解： @Target     元注解 描述注解可以用在什么地方
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
    public @interface NoDBColum{}

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Column{
        public String name() default "fieldname";

        public String setFuncName() default "setField";

        public String getFuncName() default "getField";

        public boolean defaultDBValue() default false;

    }

}

