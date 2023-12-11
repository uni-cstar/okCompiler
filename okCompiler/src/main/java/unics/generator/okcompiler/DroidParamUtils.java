package unics.generator.okcompiler;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.TypeName;

/**
 * Created by Lucio on 2022/3/4.
 * Android 参数工具类
 */
public class DroidParamUtils extends ParamsUtils{

    /**
     * the class name of Context
     */
    public static ClassName contextTypeName() {
        return ClassName.get("android.content", "Context");
    }

    /**
     * the class name of AttributeSet
     */
    public static ClassName attributeSetTypeName() {
        return ClassName.get("android.util", "AttributeSet");
    }

    /**
     * the class name of View
     */
    public static ClassName viewTypeName() {
        return  ClassName.get("android.view", "View");
    }

    /**
     * the class name of View with Annotation.
     * @param nullable 是否可空
     */
    public static TypeName viewTypeName(boolean nullable) {
        ClassName viewClass = viewTypeName();
        if (nullable) {
            return viewClass.annotated(AnnotationUtils.nullableAnnotation);
        } else {
            return viewClass.annotated(AnnotationUtils.nonNullAnnotation);
        }
    }

    /**
     * the class name of Rect
     */
    public static TypeName rectTypeName(boolean nullable) {
        ClassName viewClass = ClassName.get("android.graphics", "Rect");
        if (nullable) {
            return viewClass.annotated(AnnotationUtils.nullableAnnotation);
        } else {
            return viewClass.annotated(AnnotationUtils.nonNullAnnotation);
        }
    }

    /**
     * the class name of Canvas
     */
    public static TypeName canvasTypeName(boolean nullable) {
        ClassName viewClass = ClassName.get("android.graphics", "Canvas");
        if (nullable) {
            return viewClass.annotated(AnnotationUtils.nullableAnnotation);
        } else {
            return viewClass.annotated(AnnotationUtils.nonNullAnnotation);
        }
    }

    /**
     * the class name of MotionEvent with Annotation
     */
    public static TypeName motionEventTypeName(boolean nullable) {
        ClassName viewClass = ClassName.get("android.view", "MotionEvent");
        if (nullable) {
            return viewClass.annotated(AnnotationUtils.nullableAnnotation);
        } else {
            return viewClass.annotated(AnnotationUtils.nonNullAnnotation);
        }
    }


}
