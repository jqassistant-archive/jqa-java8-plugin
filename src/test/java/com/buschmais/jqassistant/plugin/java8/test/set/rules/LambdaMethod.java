package com.buschmais.jqassistant.plugin.java8.test.set.rules;

import java.util.stream.Stream;

import com.buschmais.jqassistant.core.shared.annotation.ToBeRemovedInVersion;

@Deprecated
@ToBeRemovedInVersion(major = 1, minor = 9)
public class LambdaMethod {

    public void withLambda() {
        Stream.of("Hello", "World").forEach(s -> System.out.println(s));
    }

    public void withoutLambda() {
        System.out.println("Hello World!");
    }
}
