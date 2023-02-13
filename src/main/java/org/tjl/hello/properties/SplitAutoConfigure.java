package org.tjl.hello.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tjl.hello.aop.PrintProcess;
import org.tjl.hello.service.ISplitService;
import org.tjl.hello.service.impl.ISplitServiceImpl;

@Configuration
//@ConditionalOnClass(value = {ISplitService.class, ISplitServiceImpl.class})
public class SplitAutoConfigure {

    @Bean
    @ConditionalOnMissingBean
    ISplitService startService() {
        return new ISplitServiceImpl();
    }

    @Bean
    public PrintProcess printProcess() {
        return new PrintProcess();
    }
}
