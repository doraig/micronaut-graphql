package com.lifeinide.micronaut.security;

import io.micronaut.aop.Around;
import io.micronaut.context.annotation.Type;
import io.micronaut.security.rules.SecurityRule;

import java.lang.annotation.*;

/**
 * @author Lukasz Frankowski
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Around
@Type(SecuredInterceptor.class)
public @interface Secured {

	String[] value() default SecurityRule.IS_ANONYMOUS;

}
