package com.learnspringboot.springboot01.service;

import com.learnspringboot.springboot01.pojo.Items;

import java.util.List;

public interface ItemsService {
    List<Items> findItemsAll();
}
