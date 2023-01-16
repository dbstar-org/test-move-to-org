package io.github.dbstarll.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BeanTest {
    @Test
    void name() {
        final Bean bean = new Bean();
        assertNull(bean.getName());

        bean.setName("abc");
        assertEquals("abc", bean.getName());
    }
}