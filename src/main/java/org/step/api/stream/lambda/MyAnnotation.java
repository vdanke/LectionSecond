package org.step.api.stream.lambda;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.PARAMETER)
@Documented
@Inherited
public @interface MyAnnotation {
}
