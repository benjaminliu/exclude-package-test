package com.ben.excludepackagetest.c;

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
public class C  implements InitializingBean {
    private static Logger logger = LoggerFactory.getLogger(C.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("C");
    }
}
