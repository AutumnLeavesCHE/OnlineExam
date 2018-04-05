package cheyinshu.exam.repositories.usermapper;


import cheyinshu.exam.common.base.IBaseMapper;
import cheyinshu.exam.models.user.Teacher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author cheYINshu
 */
@Component
@Primary
public interface TeacherMapper extends IBaseMapper<Teacher> {
}