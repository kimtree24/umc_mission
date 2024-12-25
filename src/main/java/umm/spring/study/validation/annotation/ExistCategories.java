package umm.spring.study.validation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import umm.spring.study.validation.validator.CategoriesExistValidator;

import java.lang.annotation.*;

@Documented // 사용자 정의 어노테이션 만들 때 사용
@Constraint(validatedBy = CategoriesExistValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })//어노테이션의 적용 범위를 지정
@Retention(RetentionPolicy.RUNTIME)//어노테이션의 생명 주기를 지정
public @interface ExistCategories {

    String message() default "해당하는 카테고리가 존재하지 않습니다.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
