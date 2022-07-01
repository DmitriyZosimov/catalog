package com.beacon.catalog.tools;

import java.lang.reflect.Field;

/**
 * Tool is to output more readable data. It can be used as toString() method.
 * Constructor takes an object which will use this tool.
 * @param <T> class which will use this tool as toString()
 */
public class ToStringTool<T> {

    private Class className;
    private T object;

    public ToStringTool(T t) {
        this.className = t.getClass();
        this.object = t;
    }

    public String getString() {
        StringBuilder result = new StringBuilder(className.getName() + "{\n");

        Class currentClass = className;
        while (!currentClass.equals(Object.class)) {
            Field[] fields = currentClass.getDeclaredFields();
            for (Field field : fields) {
                try {
                    field.setAccessible(true);
                    result.append(String.format("%25s:%25s%n", field.getName(), field.get(object)));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            currentClass = currentClass.getSuperclass();
        }
        result.append("}");
        return result.toString();
    }
}
