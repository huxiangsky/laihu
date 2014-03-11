package com.laihu.sites.service.impl;

import com.laihu.sites.bean.Pagination;
import com.laihu.sites.dao.BaseDao;
import com.laihu.sites.service.BaseService;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Service实现类 - Service实现类基类
 * ============================================================================
 * 版权所有 2010-2012 英科风睿软件有限公司,并保留所有权利。
 * ============================================================================
 */

@Transactional
public class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

	private BaseDao<T, PK> baseDao;

	public BaseDao<T, PK> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao<T, PK> baseDao) {
		this.baseDao = baseDao;
	}
	
	@Transactional(readOnly = true)
	public T get(PK id) {
		return baseDao.get(id);
	}

	@Transactional(readOnly = true)
	public T load(PK id) {
		return baseDao.load(id);
	}

	@Transactional(readOnly = true)
	public List<T> getAllList() {
		return baseDao.getAllList();
	}
	
	@Transactional(readOnly = true)
	public Long getTotalCount() {
		return baseDao.getTotalCount();
	}

	@Transactional
	public PK save(T entity) {
		return baseDao.save(entity);
	}

	@Transactional
	public void update(T entity) {
		baseDao.update(entity);
	}
	
	@Transactional
	public void delete(T entity) {
		baseDao.delete(entity);
	}

	@Transactional
	public void delete(PK id) {
		baseDao.delete(id);
	}

	@Transactional
	public void delete(PK[] ids) {
		baseDao.delete(ids);
	}

	@Transactional(readOnly = true)
	public void flush() {
		baseDao.flush();
	}

	@Transactional(readOnly = true)
	public void evict(Object object) {
		baseDao.evict(object);
	}
	
	@Transactional(readOnly = true)
	public void clear() {
		baseDao.clear();
	}
	
	@Transactional(readOnly = true)
	public Pagination findPagination(Pagination pager) {
		return baseDao.findPagination(pager);
	}
	
	@Transactional(readOnly = true)
	public Pagination findPagination(Pagination pager, Criterion... criterions) {
		return baseDao.findPagination(pager, criterions);
	}

    @Override
    public Pagination findPagination(Pagination pager, Order... orders) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Pagination findPagination(Pagination pager, Criteria criteria) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional(readOnly = true)
	public Pagination findPager(Pagination pager, Order... orders) {
		return baseDao.findPagination(pager, orders);
	}
	
	@Transactional(readOnly = true)
	public Pagination findPager(Pagination pager, Criteria criteria) {
		return baseDao.findPagination(pager, criteria);
	}

}