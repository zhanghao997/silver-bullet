package com.silverbullet.auth.domain;

public class SysAuthUserOrg {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_userorg.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_userorg.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_userorg.organization_id
     *
     * @mbggenerated
     */
    private String organizationId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_userorg.id
     *
     * @return the value of sys_auth_userorg.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_userorg.id
     *
     * @param id the value for sys_auth_userorg.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_userorg.user_id
     *
     * @return the value of sys_auth_userorg.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_userorg.user_id
     *
     * @param userId the value for sys_auth_userorg.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_userorg.organization_id
     *
     * @return the value of sys_auth_userorg.organization_id
     *
     * @mbggenerated
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_userorg.organization_id
     *
     * @param organizationId the value for sys_auth_userorg.organization_id
     *
     * @mbggenerated
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }
}