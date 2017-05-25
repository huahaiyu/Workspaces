/**  
 * @Title: CommonDaoImpl.java
 * @Package com.fls.elec.dao
 * @Description: TODO
 * @author honghai xia
 * @date 2017年5月16日
 *
 */
package com.fls.elec.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.fls.elec.dao.ICommonDao;
import com.fls.elec.dao.IElecTextDao;

/**
 * ClassName: CommonDaoImpl
 * 
 * @Description: TODO
 * @author honghai xia
 * @date 2017年5月16日
 *
 */
@Repository(IElecTextDao.SERVICE_NAME)
public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDao<T> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.fls.elec.dao.ICommonDao#save(java.lang.Object)
	 */
	public void save(T  entity) {
		this.getHibernateTemplate().save(entity);
	}

	@Resource(name = "sessionFactory")
	public final void setSessionFactoryDi(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);

	}

}
