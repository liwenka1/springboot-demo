package com.example.springboot.service.impl;

import com.example.springboot.entity.Comment;
import com.example.springboot.mapper.CommentMapper;
import com.example.springboot.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李文凯
 * @since 2023-07-06
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
