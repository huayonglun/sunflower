package com.spiralsnail.sunflower.controller;

import javax.annotation.Resource;

import com.spiralsnail.sunflower.domain.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spiralsnail.sunflower.dao.NewsDao;

/**
 * Created by yangyibo on 17/1/18.
 */
@RestController
public class HomeController {

    @Resource
    private NewsDao newsDao;

    @RequestMapping("/")
    public String index() {

        System.out.println(newsDao);

        News news = newsDao.selectById(1L);

        return news == null ? "null" : news.toString();
    }

}
