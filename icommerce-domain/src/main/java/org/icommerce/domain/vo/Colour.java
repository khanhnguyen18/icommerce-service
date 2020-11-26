package org.icommerce.domain.vo;

public enum Colour {
    RED,
    GREEN,
    BLUE,
    UNKNOWN;

    public static Colour from(String value) {
        for (Colour colour : values()) {
            if (colour.name().equals(value)) {
                return colour;
            }
        }
        return UNKNOWN;
    }
}
