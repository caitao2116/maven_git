package cn.itcast.dao;

import cn.itcast.domain.Item;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemMapper {

    @Select("select * from items where id = #{id}")
    Item findById(int id);
}
