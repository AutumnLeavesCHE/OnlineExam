package cheyinshu.exam.service;

import cheyinshu.exam.common.service.BaseService;
import cheyinshu.exam.models.user.Admin;
import cheyinshu.exam.repositories.usermapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cheYINshu
 */
@Service
public class AdminService extends BaseService {
    @Autowired
    private AdminMapper adminMapper;

    public int save(Admin admin) {
        return adminMapper.insert(admin);
    }


}























