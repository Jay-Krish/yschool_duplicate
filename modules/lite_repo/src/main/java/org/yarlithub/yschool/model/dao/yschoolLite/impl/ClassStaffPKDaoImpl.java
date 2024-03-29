package org.yarlithub.yschool.model.dao.yschoolLite.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassStaffPK;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.model.dao.yschoolLite.ClassStaffPKDao;
import java.io.Serializable;
 
/**
 * DAO for table: ClassStaffPK.
 * @author autogenerated
 */
@Repository
public class ClassStaffPKDaoImpl extends GenericHibernateDaoImpl<ClassStaffPK, Serializable> implements ClassStaffPKDao {
	
	/** Constructor method. */
		public ClassStaffPKDaoImpl() {
			super(ClassStaffPK.class);
		}
	}

