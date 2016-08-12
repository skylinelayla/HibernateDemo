package com.shikun.annotation;

import java.lang.annotation.*;

/**
 * Created by SHIKUN on 2016/8/12.
 */
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {
    String value();

}
