package org.yarlithub.yschool.model.obj.yschoolLite;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.yarlithub.yschool.model.obj.yschoolLite.iface.IStudentHasOptionalsubject;


/** 
 * Object mapping for hibernate-handled table: student_has_optionalsubject.
 * @author autogenerated
 */

@Entity
@Table(name = "student_has_optionalsubject", schema = "yschool_lite")
public class StudentHasOptionalsubject implements Cloneable, Serializable, IPojoGenEntity, IStudentHasOptionalsubject {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559009387L;

	

	/** Field mapping. */
	@Id 
	private StudentHasOptionalsubjectPK id;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public StudentHasOptionalsubject() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public StudentHasOptionalsubject(StudentHasOptionalsubjectPK id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return StudentHasOptionalsubject.class;
	}
 

    /**
     * Return the value associated with the column: id.
	 * @return A StudentHasOptionalsubjectPK object (this.id)
	 */
	public StudentHasOptionalsubjectPK getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final StudentHasOptionalsubjectPK id) {
		this.id = id;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public StudentHasOptionalsubject clone() throws CloneNotSupportedException {
		
        final StudentHasOptionalsubject copy = (StudentHasOptionalsubject)super.clone();

		copy.setId(this.getId());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		if ( this == aThat ) {
			 return true;
		}

		if ((aThat == null) || ( !(aThat.getClass().equals(this.getClass())))) {
			 return false;
		}
	
		final StudentHasOptionalsubject that = (StudentHasOptionalsubject) aThat;
		return this.getId().equals(that.getId());
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		return getId().hashCode();
	}
	

	
}
