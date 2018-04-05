package user;

import base.BaseTest;
import cheyinshu.exam.common.utils.UUIDUtils;
import cheyinshu.exam.models.user.Admin;
import cheyinshu.exam.service.AdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
public class AdminServiceTest extends BaseTest {
    @Autowired
    private AdminService adminService;
    @Test
    public void testSave(){
        Admin admin = new Admin();
        admin.setId(UUIDUtils.getUUID());
        admin.setAdminNo("123");
        admin.setEmail("sf");
        admin.setUsername("zhangsan");
        admin.setPassword("123");
        admin.setSex(1);
        admin.setPhone("12345678908");
        admin.setCreateTime(new Date());
        admin.setUpdateTime(new Date());
        admin.setUsertype(1);
        admin.setIsDelete(0);
        int save = adminService.save(admin);
        System.out.println(save);

    }
    @Test
    public void testSave2(){
        Admin admin = new Admin();
        admin.setId(UUIDUtils.getUUID());
        admin.setAdminNo("3533");
        admin.setEmail("sf33");
        admin.setUsername("lisi");
        admin.setPassword("125");
        admin.setSex(1);
        admin.setPhone("12345678908");
        admin.setCreateTime(new Date());
        admin.setUpdateTime(new Date());
        int save = adminService.save(admin);
        admin.setUsertype(1);
        admin.setIsDelete(0);
       if(save==1){
           System.out.println("添加管理员成功");
       }

    }
}