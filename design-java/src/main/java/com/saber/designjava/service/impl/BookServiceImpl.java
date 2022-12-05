package com.saber.designjava.service.impl;

import com.saber.designjava.pojo.Book;
import com.saber.designjava.mapper.BookMapper;
import com.saber.designjava.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书 服务实现类
 * </p>
 *
 * @author caochenlei
 * @since 2022-12-06
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
