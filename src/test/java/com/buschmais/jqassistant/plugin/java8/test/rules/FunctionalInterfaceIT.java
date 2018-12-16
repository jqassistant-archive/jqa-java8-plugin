package com.buschmais.jqassistant.plugin.java8.test.rules;

import com.buschmais.jqassistant.plugin.java.test.AbstractJavaPluginIT;
import com.buschmais.jqassistant.plugin.java8.test.set.rules.FunctionalInterface;
import com.buschmais.jqassistant.plugin.java8.test.set.rules.FunctionalInterfaceWithoutAnnotation;

import org.junit.jupiter.api.Test;

import static com.buschmais.jqassistant.core.analysis.api.Result.Status.SUCCESS;
import static com.buschmais.jqassistant.plugin.java.test.matcher.TypeDescriptorMatcher.typeDescriptor;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Tests for the concept java8:FunctionalInterface.
 */
public class FunctionalInterfaceIT extends AbstractJavaPluginIT {

    /**
     * Verifies the concept "java8:FunctionalInterface".
     *
     * @throws java.io.IOException
     *             If the test fails.
     */
    @Test
    public void functionalInterface() throws Exception {
        scanClasses(com.buschmais.jqassistant.plugin.java8.test.set.rules.FunctionalInterface.class,
                    com.buschmais.jqassistant.plugin.java8.test.set.rules.MarkerInterface.class,
                    com.buschmais.jqassistant.plugin.java8.test.set.rules.NonFunctionalInterface.class,
                    com.buschmais.jqassistant.plugin.java8.test.set.rules.FunctionalInterfaceWithoutAnnotation.class);
        assertThat(applyConcept("java8:FunctionalInterface").getStatus(), equalTo(SUCCESS));
        store.beginTransaction();
        TestResult result = query("MATCH (fi:Type:FunctionalInterface) RETURN fi");
        assertThat(result.getColumn("fi"), containsInAnyOrder(typeDescriptor(FunctionalInterface.class),
                                                              typeDescriptor(FunctionalInterfaceWithoutAnnotation.class)));
        store.commitTransaction();
    }
}
