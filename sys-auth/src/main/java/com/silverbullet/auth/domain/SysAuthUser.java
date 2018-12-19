package com.silverbullet.auth.domain;

import com.silverbullet.core.validate.AddValidate;
import com.silverbullet.core.validate.FullValidate;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.Date;

public class SysAuthUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.name
     *
     * @mbggenerated
     */
    @NotBlank(message = "不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(max=64, message = "长度不能超过64", groups = {FullValidate.class, AddValidate.class})
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.salt
     *
     * @mbggenerated
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.comments
     *
     * @mbggenerated
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.user_type
     *
     * @mbggenerated
     */
    private String userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.create_user
     *
     * @mbggenerated
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.modify_user
     *
     * @mbggenerated
     */
    private Integer modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.state
     *
     * @mbggenerated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.login_no
     *
     * @mbggenerated
     */

    @NotBlank(message = "不能为空" , groups = {FullValidate.class, AddValidate.class})
    @Size(max=64, message = "长度不能超过64", groups = {FullValidate.class, AddValidate.class})
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.login_time
     *
     * @mbggenerated
     */
    private Date loginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.image_id
     *
     * @mbggenerated
     */
    private String imageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_user.classify
     *
     * @mbggenerated
     */
    private Integer classify = 0;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.id
     *
     * @return the value of sys_auth_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.id
     *
     * @param id the value for sys_auth_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.name
     *
     * @return the value of sys_auth_user.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.name
     *
     * @param name the value for sys_auth_user.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.password
     *
     * @return the value of sys_auth_user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.password
     *
     * @param password the value for sys_auth_user.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.salt
     *
     * @return the value of sys_auth_user.salt
     *
     * @mbggenerated
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.salt
     *
     * @param salt the value for sys_auth_user.salt
     *
     * @mbggenerated
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.comments
     *
     * @return the value of sys_auth_user.comments
     *
     * @mbggenerated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.comments
     *
     * @param comments the value for sys_auth_user.comments
     *
     * @mbggenerated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.user_type
     *
     * @return the value of sys_auth_user.user_type
     *
     * @mbggenerated
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.user_type
     *
     * @param userType the value for sys_auth_user.user_type
     *
     * @mbggenerated
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.create_user
     *
     * @return the value of sys_auth_user.create_user
     *
     * @mbggenerated
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.create_user
     *
     * @param createUser the value for sys_auth_user.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.create_time
     *
     * @return the value of sys_auth_user.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.create_time
     *
     * @param createTime the value for sys_auth_user.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.modify_user
     *
     * @return the value of sys_auth_user.modify_user
     *
     * @mbggenerated
     */
    public Integer getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.modify_user
     *
     * @param modifyUser the value for sys_auth_user.modify_user
     *
     * @mbggenerated
     */
    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.modify_time
     *
     * @return the value of sys_auth_user.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.modify_time
     *
     * @param modifyTime the value for sys_auth_user.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.state
     *
     * @return the value of sys_auth_user.state
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.state
     *
     * @param state the value for sys_auth_user.state
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.login_time
     *
     * @return the value of sys_auth_user.login_time
     *
     * @mbggenerated
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.login_time
     *
     * @param loginTime the value for sys_auth_user.login_time
     *
     * @mbggenerated
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.image_id
     *
     * @return the value of sys_auth_user.image_id
     *
     * @mbggenerated
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.image_id
     *
     * @param imageId the value for sys_auth_user.image_id
     *
     * @mbggenerated
     */
    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_user.classify
     *
     * @return the value of sys_auth_user.classify
     *
     * @mbggenerated
     */
    public Integer getClassify() {
        return classify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_user.classify
     *
     * @param classify the value for sys_auth_user.classify
     *
     * @mbggenerated
     */
    public void setClassify(Integer classify) {
        this.classify = classify;
    }
}