package com.laihu.sites.dao;

import com.laihu.sites.bean.Pagination;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

import java.io.Serializable;
import java.util.List;

/**
 * Dao接口 - Dao基接口
 * ============================================================================
 * 版权所有 2013 库塔科技有限公司,并保留所有权利。
 * ============================================================================
 */

public interface BaseDao<T, PK extends Serializable> {

	/**
	 * 根据ID获取实体对象
	 * 
	 * @param id
	 *            记录ID
	 * @return 实体对象
	 */
	public T get(PK id);

	/**
	 * 根据ID获取实体对象
	 * 
	 * @param id
	 *            记录ID
	 * @return 实体对象
	 */
	public T load(PK id);

	/**
	 * 获取所有实体对象集合
	 * 
	 * @return 实体对象集合
	 */
	public List<T> getAllList();
	
	/**
	 * 获取所有实体对象总数
	 * 
	 * @return 实体对象总数
	 */
	public Long getTotalCount();

	/**
	 * 保存实体对象
	 * 
	 * @param entity
	 *            对象
	 * @return ID
	 */
	public PK save(T entity);

	/**
	 * 更新实体对象
	 * 
	 * @param entity
	 *            对象
	 */
	public void update(T entity);
	
	/**
	 * 删除实体对象
	 * 
	 * @param entity
	 *            对象
	 * @return
	 */
	public void delete(T entity);

	/**
	 * 根据ID删除实体对象
	 * 
	 * @param id
	 *            记录ID
	 */
	public void delete(PK id);

	/**
	 * 根据ID数组删除实体对象
	 * 
	 * @param ids
	 *            ID数组
	 */
	public void delete(PK[] ids);

	/**
	 * 刷新session
	 * 
	 */
	public void flush();

	/**
	 * 清除对象
	 * 
	 * @param object
	 *            需要清除的对象
	 */
	public void evict(Object object);
	
	/**
	 * 清除Session
	 * 
	 */
	public void clear();
	
	/**
	 * 根据Pagination进行查询(提供分页、查找、排序功能)
	 * 
	 * @param page
	 *            Pagination对象
	 * 
	 * @return Pagination对象
	 */
	public Pagination findPagination(Pagination page);
	
	/**
	 * 根据Pager、Criterion进行查询(提供分页、查找、排序功能)
	 * 
	 * @param pager
	 *            Pager对象
	 *            
	 * @param criterions
	 *            Criterion数组
	 * 
	 * @return Pager对象
	 */
	public Pagination findPagination(Pagination pager, Criterion... criterions);
	
	
	/**
	 * 根据Pagination、Criterion进行查询(提供分页、查找、排序功能)
	 * 
	 * @param page
	 *            Pagination对象
	 *            
	 * @param orders
	 *            Order数组
	 * 
	 * @return Pager对象
	 */
	public Pagination findPagination(Pagination page, Order... orders);
	
	/**
	 * 根据Pagination、Criteria进行查询(提供分页、查找、排序功能)
	 * 
	 * @param page
	 *            Pagination对象
	 *            
	 * @param criteria
	 *            Criteria对象
	 * 
	 * @return Pagination对象
	 */
	public Pagination findPagination(Pagination page, Criteria criteria);

}