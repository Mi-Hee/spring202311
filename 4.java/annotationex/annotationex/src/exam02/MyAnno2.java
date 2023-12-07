package exam02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno2 {
    // String value(); // 메서드명이 추가정보의 설정명
    String value() default "기본값";
    int[] nums();
}
