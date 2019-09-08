package org.netprophecy.aop;

import java.lang.instrument.Instrumentation;

import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public class Agent {
    private static final String ERROR_ASSERTION_NOT_STATIC_USE = "The class 'org.netprophecy.aop.Agent' is not supposed to be instantiated";

    private static final String INFO_INIT_AGENT = "Initializing EasyAspect agent";
    
    private static final Logger LOGGER = Logger.getLogger(Agent.class.getName());

    private Agent() {
        LOGGER.error(ERROR_ASSERTION_NOT_STATIC_USE);
        throw new AssertionError(ERROR_ASSERTION_NOT_STATIC_USE);
    }

    public static void premain(final String args, final Instrumentation inst){//NOSONAR
        LOGGER.info(INFO_INIT_AGENT);
        inst.addTransformer(new Transformer());
    }

    public static void agentmain(final String args, final Instrumentation inst){//NOSONAR
        LOGGER.info(INFO_INIT_AGENT);
        inst.addTransformer(new Transformer());
    }
}
