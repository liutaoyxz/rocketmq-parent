package com.liutaoyxz.rocketmq.user.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liutaoyxz.rocketmq.common.protocol.user.IUserApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ltlxy on 2017/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/spring-user.xml")
public class IUserApiImplTest {

    @Reference(version = "1.0.0")
    private IUserApi iUserApi;

    @Test
    public void queryUserById() throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch latch = new CountDownLatch(99);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(iUserApi.queryUserById(1));
                    latch.countDown();
                }
            });

        }
        latch.await();
//        Thread.sleep(10000000L);
    }

}