package com.volvo.java8.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatingAnnotations {

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    private @interface Filters {
        Filter[] value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.SOURCE)
    @Repeatable(Filters.class)
    private @interface Filter {
        String value();

        String name();
    }

    @Filter(value = "filter1", name = "name1")
    @Filter(value = "filter2", name = "name2")
    private interface Filterable {

    }

    public static void main(String[] args) {
        for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {
            System.out.println(filter);
        }
    }
}
