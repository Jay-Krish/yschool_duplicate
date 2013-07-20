package org.yarlithub;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.yarlithub.yschool.factories.yschoolLite.HibernateYschoolLiteDaoFactory;
import org.yarlithub.yschool.factories.yschoolLite.YschoolLiteDataPoolFactory;
import org.yarlithub.yschool.model.dao.yschoolLite.UserDao;
import org.yarlithub.yschool.model.obj.yschoolLite.User;
import org.yarlithub.yschool.services.data.DataLayerYschoolLite;
import org.yarlithub.yschool.services.data.DataLayerYschoolLiteImpl;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jayrksih
 * Date: 7/20/13
 * Time: 5:44 PM
 * To change this template use File | Settings | File Templates.
 */

@ContextConfiguration(locations = { "/applicationContext.xml" } )
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Test
    @Transactional
    public void testUserDao() {
        DataLayerYschoolLite dataLayerYschoolLite = DataLayerYschoolLiteImpl.getInstance();
        UserDao userDao = HibernateYschoolLiteDaoFactory.getUserDao();

        User user = YschoolLiteDataPoolFactory.getUser();

        user.setEmail("tom@gmail.com");
        user.setUserName("Tom");
        user.setPassword("XXX");
        user.setUserRole((byte) 1);

        userDao.saveOrUpdate(user);
        dataLayerYschoolLite.flushSession();
        dataLayerYschoolLite.evict(user);

        List<User> users = userDao.findAll();
        Assert.assertEquals(3, users.size());
    }
}
