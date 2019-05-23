package com.spiralsnail.sunflower.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.spiralsnail.sunflower.domain.News;

/**
 *    资讯数据访问
 *
 * @author liuyong
 * @version NewsDao.java, v 0.1 2019年05月23日 00:26
 */
@Repository
public interface NewsDao {

    /**
     * 插入一条资讯
     * 
     * @param news
     *            资讯模型
     * @return 影响行数
     */
    int insert(@Param("data") News news);

    /**
     * 根据ID查询资讯信息
     * 
     * @param newsId
     *            资讯ID
     * @return 资讯信息
     */
    News selectById(@Param("newsId") Long newsId);
}
