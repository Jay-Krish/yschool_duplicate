package org.yarlithub.yschool.model.obj.yschoolLite.iface;
import java.util.Set;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassStaff;
import org.yarlithub.yschool.model.obj.yschoolLite.Classroom;
import org.yarlithub.yschool.model.obj.yschoolLite.School;


/** 
 * Object interface mapping for hibernate-handled table: staff.
 * @author autogenerated
 */

public interface IStaff {



    /**
     * Return the value associated with the column: classroom.
	 * @return A Set&lt;Classroom&gt; object (this.classroom)
	 */
	Set<Classroom> getClassrooms();
	
	/**
	 * Adds a bi-directional link of type Classroom to the classrooms set.
	 * @param classroom item to add
	 */
	void addClassroom(Classroom classroom);

  
    /**  
     * Set the value related to the column: classroom.
	 * @param classroom the classroom value you wish to set
	 */
	void setClassrooms(final Set<Classroom> classroom);

    /**
     * Return the value associated with the column: classStaff.
	 * @return A Set&lt;ClassStaff&gt; object (this.classStaff)
	 */
	Set<ClassStaff> getClassStaffs();
	
	/**
	 * Adds a bi-directional link of type ClassStaff to the classStaffs set.
	 * @param classStaff item to add
	 */
	void addClassStaff(ClassStaff classStaff);

  
    /**  
     * Set the value related to the column: classStaff.
	 * @param classStaff the classStaff value you wish to set
	 */
	void setClassStaffs(final Set<ClassStaff> classStaff);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	String getName();
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	void setName(final String name);

    /**
     * Return the value associated with the column: school.
	 * @return A Set&lt;School&gt; object (this.school)
	 */
	Set<School> getSchools();
	
	/**
	 * Adds a bi-directional link of type School to the schools set.
	 * @param school item to add
	 */
	void addSchool(School school);

  
    /**  
     * Set the value related to the column: school.
	 * @param school the school value you wish to set
	 */
	void setSchools(final Set<School> school);

    /**
     * Return the value associated with the column: type.
	 * @return A Integer object (this.type)
	 */
	Integer getType();
	

  
    /**  
     * Set the value related to the column: type.
	 * @param type the type value you wish to set
	 */
	void setType(final Integer type);

	// end of interface
}