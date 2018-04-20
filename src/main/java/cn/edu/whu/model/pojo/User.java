package cn.edu.whu.model.pojo;

import java.util.Date;


public class User {
    private Integer userid;

    private String username;

    private String userpassword;

    private String useremail;

    private String usersex;

    private String userpost;

    private String usertopic;

    private String userface;

    private Date joindate;

    private Date lastlogin;

    private Integer userlogins;

    private String userbirthday;

    private String userquestion;

    private String useranswer;

    private String userphoto;

    private String usersetting;

    private String userinfo;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUserpost() {
        return userpost;
    }

    public void setUserpost(String userpost) {
        this.userpost = userpost == null ? null : userpost.trim();
    }

    public String getUsertopic() {
        return usertopic;
    }

    public void setUsertopic(String usertopic) {
        this.usertopic = usertopic == null ? null : usertopic.trim();
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface == null ? null : userface.trim();
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Integer getUserlogins() {
        return userlogins;
    }

    public void setUserlogins(Integer userlogins) {
        this.userlogins = userlogins;
    }

    public String getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(String userbirthday) {
        this.userbirthday = userbirthday == null ? null : userbirthday.trim();
    }

    public String getUserquestion() {
        return userquestion;
    }

    public void setUserquestion(String userquestion) {
        this.userquestion = userquestion == null ? null : userquestion.trim();
    }

    public String getUseranswer() {
        return useranswer;
    }

    public void setUseranswer(String useranswer) {
        this.useranswer = useranswer == null ? null : useranswer.trim();
    }

    public String getUserphoto() {
        return userphoto;
    }

    public void setUserphoto(String userphoto) {
        this.userphoto = userphoto == null ? null : userphoto.trim();
    }

    public String getUsersetting() {
        return usersetting;
    }

    public void setUsersetting(String usersetting) {
        this.usersetting = usersetting == null ? null : usersetting.trim();
    }

    public String getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo == null ? null : userinfo.trim();
    }
}