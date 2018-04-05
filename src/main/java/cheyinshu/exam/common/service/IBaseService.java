package cheyinshu.exam.common.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>通用接口</p>
 *
 * @author cheYINshu
 */
@Service
public interface IBaseService<T> {
    /**
     * 根据主键查询
     *
     * @param key
     * @return
     */
    T selectByKey(Object key);

    /**
     * 保存操作
     *
     * @param entity
     * @return
     */
    int save(T entity);

    /**
     * 删除操作
     *
     * @param key
     * @return
     */
    int delete(Object key);

    /**
     * 更新操作
     *
     * @param entity
     * @return
     */
    int updateAll(T entity);

    /**
     * 字段部位null的更新操作
     *
     * @param entity
     * @return
     */
    int updateNotNull(T entity);

    /**
     * 查询列表
     *
     * @param example
     * @return
     */
    List<T> selectByExample(Object example);

}

































