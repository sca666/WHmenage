package xin.cymall.annotation;

import java.lang.annotation.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chenyi on 2018/2/9
 * 清除过期缓存注解，放置于update delete insert 类型逻辑之上
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RedisEvict {
	Class type();
}
