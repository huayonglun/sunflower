package com.spiralsnail.sunflower.domain.community;

import com.spiralsnail.sunflower.base.BaseString;
import com.spiralsnail.sunflower.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 评论模型   
 *
 * @author liuyong
 * @version Comment.java, v 0.1 2019年05月21日 00:25
 */
@Setter
@Getter
public class Comment extends BaseString {

    /** serId */
    private static final long serialVersionUID = 9106936770741423495L;

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

    // 所属动态
    private Post post;

}
