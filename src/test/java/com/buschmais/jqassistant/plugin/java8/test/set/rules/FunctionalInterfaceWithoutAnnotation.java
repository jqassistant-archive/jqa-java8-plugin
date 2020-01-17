package com.buschmais.jqassistant.plugin.java8.test.set.rules;

import com.buschmais.jqassistant.core.shared.annotation.ToBeRemovedInVersion;

/**
 * A functional interface without the
 * {@linkplain java.lang.FunctionalInterface} annotation.
 */
@Deprecated
@ToBeRemovedInVersion(major = 1, minor = 9)
public interface FunctionalInterfaceWithoutAnnotation {

    int add(int a, int b);

}
