package com.mycompany.app;

import java.util.Date;
import org.apache.camel.Converter;

/**
 * Custom Camel type converters.
 */
@Converter
public final class CamelConverters {
    /**
     * Returns a {@link Date} with the given {@link Integer} value (cast as a long) as the underlying timestamp value,
     * or {@code null} if the given Integer is {@code null}.
     */
    @Converter
    public static Date toDate(Integer integer) {
        if (integer == null) {
            return null;
        }
        return new Date(integer.longValue());
    }

    private CamelConverters() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
