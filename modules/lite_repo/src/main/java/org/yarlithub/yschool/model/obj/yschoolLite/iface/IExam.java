package org.yarlithub.yschool.model.obj.yschoolLite.iface;
import java.util.Date;
import java.util.Set;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassSubject;
import org.yarlithub.yschool.model.obj.yschoolLite.Marks;


/** 
 * Object interface mapping for hibernate-handled table: exam.
 * @author autogenerated
 */

public interface IExam {



    /**
     * Return the value associated with the column: classSubjectIdclassSubject.
	 * @return A ClassSubject object (this.classSubjectIdclassSubject)
	 */
	ClassSubject getClassSubjectIdclassSubject();
	

  
    /**  
     * Set the value related to the column: classSubjectIdclassSubject.
	 * @param classSubjectIdclassSubject the classSubjectIdclassSubject value you wish to set
	 */
	void setClassSubjectIdclassSubject(final ClassSubject classSubjectIdclassSubject);

    /**
     * Return the value associated with the column: date.
	 * @return A Date object (this.date)
	 */
	Date getDate();
	

  
    /**  
     * Set the value related to the column: date.
	 * @param date the date value you wish to set
	 */
	void setDate(final Date date);

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
     * Return the value associated with the column: marks.
	 * @return A Set&lt;Marks&gt; object (this.marks)
	 */
	Set<Marks> getMarkss();
	
	/**
	 * Adds a bi-directional link of type Marks to the markss set.
	 * @param marks item to add
	 */
	void addMarks(Marks marks);

  
    /**  
     * Set the value related to the column: marks.
	 * @param marks the marks value you wish to set
	 */
	void setMarkss(final Set<Marks> marks);

    /**
     * Return the value associated with the column: term.
	 * @return A Integer object (this.term)
	 */
	Integer getTerm();
	

  
    /**  
     * Set the value related to the column: term.
	 * @param term the term value you wish to set
	 */
	void setTerm(final Integer term);

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

    /**
     * Return the value associated with the column: year.
	 * @return A Date object (this.year)
	 */
	Date getYear();
	

  
    /**  
     * Set the value related to the column: year.
	 * @param year the year value you wish to set
	 */
	void setYear(final Date year);

	// end of interface
}