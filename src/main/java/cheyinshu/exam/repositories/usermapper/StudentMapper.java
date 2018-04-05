package cheyinshu.exam.repositories.usermapper;


import cheyinshu.exam.common.base.IBaseMapper;
import cheyinshu.exam.models.user.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author cheYINshu
 */
@Component
@Qualifier
public interface StudentMapper extends IBaseMapper<Student> {
}