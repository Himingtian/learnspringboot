package com.learnspringboot.springboot01.service.impl;

import com.github.pagehelper.PageHelper;
import com.learnspringboot.springboot01.mapper.ItemsMapper;
import com.learnspringboot.springboot01.pojo.Items;
import com.learnspringboot.springboot01.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {


    @Autowired
    private ItemsMapper itemsMapper;


    @Cacheable(value = "items",key = "'itemskey'")
    @Override
    public List<Items> findItemsAll() {
        System.out.println("执行了查询");
        PageHelper.startPage(1,2);
        return itemsMapper.select(null);
    }
}
