package com.jzfq.rms.third.common.pojo;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public class User extends BaseBean {

    private long userID; //用户ID
    private String name; //姓名
    private int gender; //性别
    private String birthdate; //出生日期
    private int marriage; //婚姻状态
    private int education; //学历
    private String joinWorkDate; //参加工作时间 年月
    private String email; //邮箱

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getMarriage() {
        return marriage;
    }

    public void setMarriage(int marriage) {
        this.marriage = marriage;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public String getJoinWorkDate() {
        return joinWorkDate;
    }

    public void setJoinWorkDate(String joinWorkDate) {
        this.joinWorkDate = joinWorkDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}