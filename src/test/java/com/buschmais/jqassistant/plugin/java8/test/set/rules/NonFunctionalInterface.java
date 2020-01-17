package com.buschmais.jqassistant.plugin.java8.test.set.rules;

import com.buschmais.jqassistant.core.shared.annotation.ToBeRemovedInVersion;

/**
 * A non-functional interface.
 */
@Deprecated
@ToBeRemovedInVersion(major = 1, minor = 9)
public interface NonFunctionalInterface {
    int add(int a, int b);

    int sub(int a, int c);
}
