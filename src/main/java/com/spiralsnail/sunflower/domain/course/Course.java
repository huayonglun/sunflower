package com.spiralsnail.sunflower.domain.course;

import com.spiralsnail.sunflower.base.BaseString;

import java.util.Date;

/**
 * author: Liu Yong date: 2017/5/12
 */
public class Course extends BaseString {

    /** serId */
    private static final long serialVersionUID = -7656004907480954414L;

    // 课程ID
    private long courseId;

    // 课程标题
    private String title;

    // 课程视频链接
    private String videoUrl;

    // 课程根分类
    private String rootCategory;

    // 课程二级分类
    private String subCategory;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

}
