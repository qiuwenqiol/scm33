package cn.itcast.scm.service;

import cn.itcast.scm.entity.Page;

public interface BaseService<T> {
	public int insert (T entity) throws Exception;
	public int update(T entity) throws Exception;
	public int delete(T entity) throws Exception;
	public int deleteList(String [] pks) throws Exception;
	public T select(T entity);
	public Page<T> selectPage(Page<T> page); 
	public Page<T> selectPageUseDyc(Page<T> page); 
}
