package com.spiralsnail.sunflower.domain.liferecord;

import java.util.Date;

import com.spiralsnail.sunflower.base.BaseString;
import com.spiralsnail.sunflower.domain.User;

/**
 * 生活记录评论模型
 *
 * @author liuyong 2017-03-19 12:18 com.spiralsnail.sunflower.domain.community.RecordComment.java
 */
public class RecordComment extends BaseString {

    /** serId */
    private static final long serialVersionUID = -4278784417705679037L;

    // 评论ID
    private long comId;

    // 评论内容
    private String content;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

    // 评论人
    private User author;

    // 接收人
    private User receiveUser;

    // 所属生活记录
    private LifeRecord lifeRecord;

}
