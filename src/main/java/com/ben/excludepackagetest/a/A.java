package com.ben.excludepackagetest.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * — <br>
 *
 * @author: 刘恒 <br>
 * @date: 2018/11/30 <br>
 */
@Component
public class A implements InitializingBean {
    private static Logger logger = LoggerFactory.getLogger(A.class);
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("A");
    }
}
