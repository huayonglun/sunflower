package com.spiralsnail.sunflower.domain;

import java.util.Date;

import com.spiralsnail.sunflower.base.BaseString;

import lombok.Getter;
import lombok.Setter;

/**
 * 资讯
 *
 * @author liuyong 2017-03-19 7:31 com.spiralsnail.sunflower.domain.News.java
 */
@Setter
@Getter
public class News extends BaseString {

    /** serId */
    private static final long serialVersionUID = 7261112626447292360L;

    // ID
    private long newsId;

    // 标题
    private String title;

    // 内容
    private String content;

    // 类目
    private String category;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

}
