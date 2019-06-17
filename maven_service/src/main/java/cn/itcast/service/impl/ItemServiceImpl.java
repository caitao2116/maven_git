package cn.itcast.service.impl;

import cn.itcast.dao.ItemMapper;
import cn.itcast.domain.Item;
import cn.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper itemMapper;

    public Item findById(int id) {
        return itemMapper.findById(id);
    }
}
