package com.spiralsnail.sunflower;

import com.spiralsnail.sunflower.dao.NewsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SunflowerApplicationTests {

    @Resource
    private NewsDao newsDao;

    @Test
    public void contextLoads() {

        System.out.println(newsDao.selectById(1L));;
    }

}
