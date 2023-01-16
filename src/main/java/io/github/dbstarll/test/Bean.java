package io.github.dbstarll.test;

import java.io.Serializable;

public class Bean implements Serializable {
    private String name;

    /**
     * 获得name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name.
     *
     * @param name 新的name
     */
    public void setName(final String name) {
        this.name = name;
    }
}
