package com.example.springboot.service.impl;

import com.example.springboot.entity.Article;
import com.example.springboot.mapper.ArticleMapper;
import com.example.springboot.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李文凯
 * @since 2023-07-03
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
