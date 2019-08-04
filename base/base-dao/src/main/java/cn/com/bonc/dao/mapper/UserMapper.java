package cn.com.bonc.dao.mapper;

import cn.com.bonc.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author greatdistance
 */
@Mapper
public interface UserMapper {
    /**
     * 根据主键删除User
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加User
     *
     * @param record
     * @return
     */
    int insert(User record);

    int insertSelective(User record);

    /**
     * 根据主键查询USer
     *
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    /**
     * 根据主键修改USer
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);
}