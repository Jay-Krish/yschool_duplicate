package org.yarlithub.yschool.web.setup;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.yarlithub.yschool.service.SetupService;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@ManagedBean
@Scope(value="request")
@Controller
public class SetupBean implements Serializable {

    private static final Logger logger = Logger.getLogger(SetupBean.class);

    @Autowired
    private SetupService setupService;

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

    public void enterSetup() {
        logger.info("Entering into first time ySchool setup");
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "setting up now.", null));
        setupService.createSetup(userName, userPass1, userRole);
    }

}
