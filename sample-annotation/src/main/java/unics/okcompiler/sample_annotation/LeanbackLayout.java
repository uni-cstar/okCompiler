package unics.okcompiler.sample_annotation;

import android.view.ViewGroup;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface LeanbackLayout {
    Class<? extends ViewGroup>[] value() default {};
}