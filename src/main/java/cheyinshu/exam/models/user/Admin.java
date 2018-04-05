package cheyinshu.exam.models.user;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/**
 * @author cheYINshu
 */
@Table(name = "admin")
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 1:男, 2：女
     */
    private Integer sex;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 工号
     */
    @Column(name = "admin_no")
    private String adminNo;

    /**
     * 1: 管理员  2：老师  3：学生
     */
    private Integer usertype;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "extend_info")
    private String extendInfo;

    /**
     * 0: 正常  1: 删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

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
     * 获取工号
     *
     * @return admin_no - 工号
     */
    public String getAdminNo() {
        return adminNo;
    }

    /**
     * 设置工号
     *
     * @param adminNo 工号
     */
    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo == null ? null : adminNo.trim();
    }

    /**
     * 获取1: 管理员  2：老师  3：学生
     *
     * @return usertype - 1: 管理员  2：老师  3：学生
     */
    public Integer getUsertype() {
        return usertype;
    }

    /**
     * 设置1: 管理员  2：老师  3：学生
     *
     * @param usertype 1: 管理员  2：老师  3：学生
     */
    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
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
     * @return extend_info
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    /**
     * @param extendInfo
     */
    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo == null ? null : extendInfo.trim();
    }

    /**
     * 获取0: 正常  1: 删除
     *
     * @return is_delete - 0: 正常  1: 删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置0: 正常  1: 删除
     *
     * @param isDelete 0: 正常  1: 删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}