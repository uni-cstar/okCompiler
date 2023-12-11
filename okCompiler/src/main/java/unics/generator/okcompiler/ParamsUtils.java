package unics.generator.okcompiler;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;

import java.util.ArrayList;

/**
 * Created by Lucio on 2022/3/10.
 * 参数工具类
 */
public class ParamsUtils {

    /**
     * the type name of ArrayList
     * @param typeName the type name of the element in ArrayList
     */
    public static TypeName arrayListTypeName(TypeName typeName) {
        return ParameterizedTypeName.get(ClassName.get(ArrayList.class), typeName);
    }

    /**
     * the type name of String with Annotation
     * @param nullable 是否可空
     */
    public static TypeName stringTypeName(boolean nullable) {
        TypeName tn = TypeName.get(String.class);
        if (nullable) {
            return tn.annotated(AnnotationUtils.nullableAnnotation);
        } else {
            return tn.annotated(AnnotationUtils.nonNullAnnotation);
        }
    }

}
