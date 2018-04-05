package cheyinshu.exam.models.user;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/**
 * @author cheYINshu
 */
@Table(name = "student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 1:男, 2：女
     */
    private Integer sex;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 专业
     */
    private String major;

    /**
     * 班级
     */
    @Column(name = "college_class")
    private String collegeClass;

    /**
     * 年级
     */
    private String grade;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 学院
     */
    private String institute;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 学号
     */
    @Column(name = "student_no")
    private String studentNo;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 1：管理员  2：老师  3：学生
     */
    private Boolean usertype;

    /**
     * 扩展信息
     */
    @Column(name = "extend_info")
    private String extendInfo;

    /**
     * 0: 正常  1: 删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取1:男, 2：女
     *
     * @return sex - 1:男, 2：女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置1:男, 2：女
     *
     * @param sex 1:男, 2：女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取专业
     *
     * @return major - 专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置专业
     *
     * @param major 专业
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * 获取班级
     *
     * @return class - 班级
     */
    public String getCollegeClass() {
        return collegeClass;
    }

    /**
     * 设置班级
     *
     * @param collegeClass 班级
     */
    public void setCollegeClass(String collegeClass) {
        this.collegeClass = collegeClass == null ? null : collegeClass.trim();
    }

    /**
     * 获取年级
     *
     * @return grade - 年级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置年级
     *
     * @param grade 年级
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取学院
     *
     * @return institute - 学院
     */
    public String getInstitute() {
        return institute;
    }

    /**
     * 设置学院
     *
     * @param institute 学院
     */
    public void setInstitute(String institute) {
        this.institute = institute == null ? null : institute.trim();
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取学号
     *
     * @return student_no - 学号
     */
    public String getStudentNo() {
        return studentNo;
    }

    /**
     * 设置学号
     *
     * @param studentNo 学号
     */
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo == null ? null : studentNo.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取1：管理员  2：老师  3：学生
     *
     * @return usertype - 1：管理员  2：老师  3：学生
     */
    public Boolean getUsertype() {
        return usertype;
    }

    /**
     * 设置1：管理员  2：老师  3：学生
     *
     * @param usertype 1：管理员  2：老师  3：学生
     */
    public void setUsertype(Boolean usertype) {
        this.usertype = usertype;
    }

    /**
     * 获取扩展信息
     *
     * @return extend_info - 扩展信息
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    /**
     * 设置扩展信息
     *
     * @param extendInfo 扩展信息
     */
    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo == null ? null : extendInfo.trim();
    }

    /**
     * 获取0: 正常  1: 删除
     *
     * @return is_delete - 0: 正常  1: 删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置0: 正常  1: 删除
     *
     * @param isDelete 0: 正常  1: 删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}