package org.netprophecy.aop;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

import org.apache.log4j.Logger;

public class Transformer implements ClassFileTransformer {
    private static final String DEBUG_TRANSFORMER_CURRENT_CLASS = "Transforming class {}";

    private static final Logger LOGGER = Logger.getLogger(Transformer.class.getName());

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
            ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        LOGGER.debug(String.format(DEBUG_TRANSFORMER_CURRENT_CLASS, className));
        return null;//NOSONAR
    }
}