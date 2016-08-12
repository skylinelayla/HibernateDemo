package com.shikun.annotation;

import java.lang.annotation.*;

/**
 * Created by SHIKUN on 2016/8/12.
 */
@Target(ElementType.FIELD)
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String value();
}
