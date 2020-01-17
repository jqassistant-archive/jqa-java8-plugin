package com.buschmais.jqassistant.plugin.java8.test.set.rules;

import com.buschmais.jqassistant.core.shared.annotation.ToBeRemovedInVersion;

/**
 * An interface defining a default method.
 */
@Deprecated
@ToBeRemovedInVersion(major = 1, minor = 9)
public interface DefaultMethod {

    default int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b);
}
