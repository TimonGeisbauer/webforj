package org.dwcj.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation can be used to set the theme of the DWC app.
 * The theme name should be one of the following: "system", "light", "dark" or
 * the name of a custom theme.
 * In case the theme is not one of the above, the theme will be set to "system".
 * 
 * The annotation can be used on the class level only and the class must extend
 * `org.dwcj.App` in order for the annotation to be processed.
 * 
 * @author Hyyan Abo Fakher
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AppTheme {

    /**
     * The theme name
     * 
     * @return the theme name
     */
    String value() default "system";
}
