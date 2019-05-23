package com.spiralsnail.sunflower.domain.community;

import com.google.common.collect.Sets;
import com.spiralsnail.sunflower.base.BaseString;
import com.spiralsnail.sunflower.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

/**
 *    社群动态模型
 *
 * @author liuyong
 * @version Post.java, v 0.1 2019年05月21日 00:46
 */
@Setter
@Getter
public class Post extends BaseString {

    /** serId */
    private static final long serialVersionUID = -2851132943889839778L;

    // 动态ID
    private long postId;

    // 动态标题
    private String title;

    // 动态内容
    private String content;

    // 动态绑定图片URL
    private String postPicUrl;

    // 是否置顶(0 表示不需要置顶， 1 表示置顶)
    private int top = 0;

    // 动态发布位置(0表示社区，1表示俱乐部)
    private int situation;

    // 所在地理位置社区名
    private String posCommunityName;

    // 评论个数
    private int commentsCount;

    // 所属俱乐部ID
    private long clubId;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

    // 发布者
    private User author;

    // 评论集合
    private Set<Comment> comments = Sets.newHashSet();

}
