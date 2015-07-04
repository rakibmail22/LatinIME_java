package com.probaho.softinput.annotations;

import java.lang.annotation.*;

/**
 * Designates that a field, return value, argument, or variable is
 * guaranteed to be non-null.
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface Nonnull {}

/**
 * Designates that a field, return value, argument, or variable may be null.
 */
