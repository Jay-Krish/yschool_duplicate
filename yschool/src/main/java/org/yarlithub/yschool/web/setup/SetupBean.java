package org.yarlithub.yschool.web.setup;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;
import org.yarlithub.yschool.factories.yschoolLite.HibernateYschoolLiteDaoFactory;
import org.yarlithub.yschool.factories.yschoolLite.YschoolLiteDataPoolFactory;
import org.yarlithub.yschool.model.dao.yschoolLite.UserDao;
import org.yarlithub.yschool.model.obj.yschoolLite.User;
import org.yarlithub.yschool.services.data.DataLayerYschoolLite;
import org.yarlithub.yschool.services.data.DataLayerYschoolLiteImpl;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;


/**
 * Created with IntelliJ IDEA.
 * User: jaykrish
 * Date: 4/25/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */

@ManagedBean
@SessionScoped
public class SetupBean implements Serializable {

    private static final Logger logger = Logger.getLogger(SetupBean.class);
    //string to test initial development of setup.xhtml file
    public String teststr;
    public String userName;
    public String userRole;
    public String userPass1;
    public String userPass2;

    public SetupBean() {
        logger.info("initiating a new setup bean");

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserPass1() {
        return userPass1;
    }

    public void setUserPass1(String userPass1) {
        this.userPass1 = userPass1;
    }

    public String getUserPass2() {
        return userPass2;
    }

    public void setUserPass2(String userPass2) {
        this.userPass2 = userPass2;
    }

    public String getTeststr() {
        return teststr;
    }

    public void setTeststr(String teststr) {
        this.teststr = teststr;
    }

    @Transactional
    public void enterSetup() {
        logger.info("Entering into first time ySchool setup");
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "setting up now.", null));
        DataLayerYschoolLite dataLayerYschoolLite = DataLayerYschoolLiteImpl.getInstance();
        Session  session = dataLayerYschoolLite.getCurrentSession();
        UserDao userDao = HibernateYschoolLiteDaoFactory.getUserDao();

        User user = YschoolLiteDataPoolFactory.getUser();

        user.setEmail("tom@gmail.com");
        user.setUserName("Tom");
        user.setPassword("XXX");
        user.setUserRole((byte) 1);

        userDao.saveOrUpdate(user);
        dataLayerYschoolLite.flushSession();
        dataLayerYschoolLite.evict(user);

    }

}
