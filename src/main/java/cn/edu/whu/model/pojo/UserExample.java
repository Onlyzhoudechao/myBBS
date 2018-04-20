package cn.edu.whu.model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userPassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userPassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userPassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userPassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userPassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userPassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userPassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userPassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userPassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userPassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userPassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userPassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("userEmail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("userEmail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("userEmail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("userEmail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("userEmail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("userEmail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("userSex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("userSex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("userSex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("userSex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("userSex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("userSex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("userSex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("userSex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("userSex like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("userSex not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("userSex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("userSex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("userSex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("userSex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUserpostIsNull() {
            addCriterion("userPost is null");
            return (Criteria) this;
        }

        public Criteria andUserpostIsNotNull() {
            addCriterion("userPost is not null");
            return (Criteria) this;
        }

        public Criteria andUserpostEqualTo(String value) {
            addCriterion("userPost =", value, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostNotEqualTo(String value) {
            addCriterion("userPost <>", value, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostGreaterThan(String value) {
            addCriterion("userPost >", value, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostGreaterThanOrEqualTo(String value) {
            addCriterion("userPost >=", value, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostLessThan(String value) {
            addCriterion("userPost <", value, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostLessThanOrEqualTo(String value) {
            addCriterion("userPost <=", value, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostLike(String value) {
            addCriterion("userPost like", value, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostNotLike(String value) {
            addCriterion("userPost not like", value, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostIn(List<String> values) {
            addCriterion("userPost in", values, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostNotIn(List<String> values) {
            addCriterion("userPost not in", values, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostBetween(String value1, String value2) {
            addCriterion("userPost between", value1, value2, "userpost");
            return (Criteria) this;
        }

        public Criteria andUserpostNotBetween(String value1, String value2) {
            addCriterion("userPost not between", value1, value2, "userpost");
            return (Criteria) this;
        }

        public Criteria andUsertopicIsNull() {
            addCriterion("userTopic is null");
            return (Criteria) this;
        }

        public Criteria andUsertopicIsNotNull() {
            addCriterion("userTopic is not null");
            return (Criteria) this;
        }

        public Criteria andUsertopicEqualTo(String value) {
            addCriterion("userTopic =", value, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicNotEqualTo(String value) {
            addCriterion("userTopic <>", value, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicGreaterThan(String value) {
            addCriterion("userTopic >", value, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicGreaterThanOrEqualTo(String value) {
            addCriterion("userTopic >=", value, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicLessThan(String value) {
            addCriterion("userTopic <", value, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicLessThanOrEqualTo(String value) {
            addCriterion("userTopic <=", value, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicLike(String value) {
            addCriterion("userTopic like", value, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicNotLike(String value) {
            addCriterion("userTopic not like", value, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicIn(List<String> values) {
            addCriterion("userTopic in", values, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicNotIn(List<String> values) {
            addCriterion("userTopic not in", values, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicBetween(String value1, String value2) {
            addCriterion("userTopic between", value1, value2, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUsertopicNotBetween(String value1, String value2) {
            addCriterion("userTopic not between", value1, value2, "usertopic");
            return (Criteria) this;
        }

        public Criteria andUserfaceIsNull() {
            addCriterion("userFace is null");
            return (Criteria) this;
        }

        public Criteria andUserfaceIsNotNull() {
            addCriterion("userFace is not null");
            return (Criteria) this;
        }

        public Criteria andUserfaceEqualTo(String value) {
            addCriterion("userFace =", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceNotEqualTo(String value) {
            addCriterion("userFace <>", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceGreaterThan(String value) {
            addCriterion("userFace >", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceGreaterThanOrEqualTo(String value) {
            addCriterion("userFace >=", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceLessThan(String value) {
            addCriterion("userFace <", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceLessThanOrEqualTo(String value) {
            addCriterion("userFace <=", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceLike(String value) {
            addCriterion("userFace like", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceNotLike(String value) {
            addCriterion("userFace not like", value, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceIn(List<String> values) {
            addCriterion("userFace in", values, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceNotIn(List<String> values) {
            addCriterion("userFace not in", values, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceBetween(String value1, String value2) {
            addCriterion("userFace between", value1, value2, "userface");
            return (Criteria) this;
        }

        public Criteria andUserfaceNotBetween(String value1, String value2) {
            addCriterion("userFace not between", value1, value2, "userface");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNull() {
            addCriterion("JoinDate is null");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNotNull() {
            addCriterion("JoinDate is not null");
            return (Criteria) this;
        }

        public Criteria andJoindateEqualTo(Date value) {
            addCriterion("JoinDate =", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotEqualTo(Date value) {
            addCriterion("JoinDate <>", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThan(Date value) {
            addCriterion("JoinDate >", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThanOrEqualTo(Date value) {
            addCriterion("JoinDate >=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThan(Date value) {
            addCriterion("JoinDate <", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThanOrEqualTo(Date value) {
            addCriterion("JoinDate <=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateIn(List<Date> values) {
            addCriterion("JoinDate in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotIn(List<Date> values) {
            addCriterion("JoinDate not in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateBetween(Date value1, Date value2) {
            addCriterion("JoinDate between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotBetween(Date value1, Date value2) {
            addCriterion("JoinDate not between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("lastLogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("lastLogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Date value) {
            addCriterion("lastLogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Date value) {
            addCriterion("lastLogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Date value) {
            addCriterion("lastLogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Date value) {
            addCriterion("lastLogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Date value) {
            addCriterion("lastLogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Date> values) {
            addCriterion("lastLogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Date> values) {
            addCriterion("lastLogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Date value1, Date value2) {
            addCriterion("lastLogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Date value1, Date value2) {
            addCriterion("lastLogin not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginsIsNull() {
            addCriterion("userLogins is null");
            return (Criteria) this;
        }

        public Criteria andUserloginsIsNotNull() {
            addCriterion("userLogins is not null");
            return (Criteria) this;
        }

        public Criteria andUserloginsEqualTo(Integer value) {
            addCriterion("userLogins =", value, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserloginsNotEqualTo(Integer value) {
            addCriterion("userLogins <>", value, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserloginsGreaterThan(Integer value) {
            addCriterion("userLogins >", value, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserloginsGreaterThanOrEqualTo(Integer value) {
            addCriterion("userLogins >=", value, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserloginsLessThan(Integer value) {
            addCriterion("userLogins <", value, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserloginsLessThanOrEqualTo(Integer value) {
            addCriterion("userLogins <=", value, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserloginsIn(List<Integer> values) {
            addCriterion("userLogins in", values, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserloginsNotIn(List<Integer> values) {
            addCriterion("userLogins not in", values, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserloginsBetween(Integer value1, Integer value2) {
            addCriterion("userLogins between", value1, value2, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserloginsNotBetween(Integer value1, Integer value2) {
            addCriterion("userLogins not between", value1, value2, "userlogins");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIsNull() {
            addCriterion("userBirthday is null");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIsNotNull() {
            addCriterion("userBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayEqualTo(String value) {
            addCriterion("userBirthday =", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotEqualTo(String value) {
            addCriterion("userBirthday <>", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayGreaterThan(String value) {
            addCriterion("userBirthday >", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("userBirthday >=", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLessThan(String value) {
            addCriterion("userBirthday <", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLessThanOrEqualTo(String value) {
            addCriterion("userBirthday <=", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLike(String value) {
            addCriterion("userBirthday like", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotLike(String value) {
            addCriterion("userBirthday not like", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIn(List<String> values) {
            addCriterion("userBirthday in", values, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotIn(List<String> values) {
            addCriterion("userBirthday not in", values, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayBetween(String value1, String value2) {
            addCriterion("userBirthday between", value1, value2, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotBetween(String value1, String value2) {
            addCriterion("userBirthday not between", value1, value2, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserquestionIsNull() {
            addCriterion("userQuestion is null");
            return (Criteria) this;
        }

        public Criteria andUserquestionIsNotNull() {
            addCriterion("userQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andUserquestionEqualTo(String value) {
            addCriterion("userQuestion =", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotEqualTo(String value) {
            addCriterion("userQuestion <>", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionGreaterThan(String value) {
            addCriterion("userQuestion >", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionGreaterThanOrEqualTo(String value) {
            addCriterion("userQuestion >=", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionLessThan(String value) {
            addCriterion("userQuestion <", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionLessThanOrEqualTo(String value) {
            addCriterion("userQuestion <=", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionLike(String value) {
            addCriterion("userQuestion like", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotLike(String value) {
            addCriterion("userQuestion not like", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionIn(List<String> values) {
            addCriterion("userQuestion in", values, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotIn(List<String> values) {
            addCriterion("userQuestion not in", values, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionBetween(String value1, String value2) {
            addCriterion("userQuestion between", value1, value2, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotBetween(String value1, String value2) {
            addCriterion("userQuestion not between", value1, value2, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUseranswerIsNull() {
            addCriterion("userAnswer is null");
            return (Criteria) this;
        }

        public Criteria andUseranswerIsNotNull() {
            addCriterion("userAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andUseranswerEqualTo(String value) {
            addCriterion("userAnswer =", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotEqualTo(String value) {
            addCriterion("userAnswer <>", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerGreaterThan(String value) {
            addCriterion("userAnswer >", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerGreaterThanOrEqualTo(String value) {
            addCriterion("userAnswer >=", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerLessThan(String value) {
            addCriterion("userAnswer <", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerLessThanOrEqualTo(String value) {
            addCriterion("userAnswer <=", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerLike(String value) {
            addCriterion("userAnswer like", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotLike(String value) {
            addCriterion("userAnswer not like", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerIn(List<String> values) {
            addCriterion("userAnswer in", values, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotIn(List<String> values) {
            addCriterion("userAnswer not in", values, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerBetween(String value1, String value2) {
            addCriterion("userAnswer between", value1, value2, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotBetween(String value1, String value2) {
            addCriterion("userAnswer not between", value1, value2, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUserphotoIsNull() {
            addCriterion("userPhoto is null");
            return (Criteria) this;
        }

        public Criteria andUserphotoIsNotNull() {
            addCriterion("userPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andUserphotoEqualTo(String value) {
            addCriterion("userPhoto =", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotEqualTo(String value) {
            addCriterion("userPhoto <>", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoGreaterThan(String value) {
            addCriterion("userPhoto >", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoGreaterThanOrEqualTo(String value) {
            addCriterion("userPhoto >=", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLessThan(String value) {
            addCriterion("userPhoto <", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLessThanOrEqualTo(String value) {
            addCriterion("userPhoto <=", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoLike(String value) {
            addCriterion("userPhoto like", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotLike(String value) {
            addCriterion("userPhoto not like", value, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoIn(List<String> values) {
            addCriterion("userPhoto in", values, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotIn(List<String> values) {
            addCriterion("userPhoto not in", values, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoBetween(String value1, String value2) {
            addCriterion("userPhoto between", value1, value2, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUserphotoNotBetween(String value1, String value2) {
            addCriterion("userPhoto not between", value1, value2, "userphoto");
            return (Criteria) this;
        }

        public Criteria andUsersettingIsNull() {
            addCriterion("userSetting is null");
            return (Criteria) this;
        }

        public Criteria andUsersettingIsNotNull() {
            addCriterion("userSetting is not null");
            return (Criteria) this;
        }

        public Criteria andUsersettingEqualTo(String value) {
            addCriterion("userSetting =", value, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingNotEqualTo(String value) {
            addCriterion("userSetting <>", value, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingGreaterThan(String value) {
            addCriterion("userSetting >", value, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingGreaterThanOrEqualTo(String value) {
            addCriterion("userSetting >=", value, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingLessThan(String value) {
            addCriterion("userSetting <", value, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingLessThanOrEqualTo(String value) {
            addCriterion("userSetting <=", value, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingLike(String value) {
            addCriterion("userSetting like", value, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingNotLike(String value) {
            addCriterion("userSetting not like", value, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingIn(List<String> values) {
            addCriterion("userSetting in", values, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingNotIn(List<String> values) {
            addCriterion("userSetting not in", values, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingBetween(String value1, String value2) {
            addCriterion("userSetting between", value1, value2, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUsersettingNotBetween(String value1, String value2) {
            addCriterion("userSetting not between", value1, value2, "usersetting");
            return (Criteria) this;
        }

        public Criteria andUserinfoIsNull() {
            addCriterion("userInfo is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIsNotNull() {
            addCriterion("userInfo is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoEqualTo(String value) {
            addCriterion("userInfo =", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotEqualTo(String value) {
            addCriterion("userInfo <>", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoGreaterThan(String value) {
            addCriterion("userInfo >", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo >=", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoLessThan(String value) {
            addCriterion("userInfo <", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoLessThanOrEqualTo(String value) {
            addCriterion("userInfo <=", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoLike(String value) {
            addCriterion("userInfo like", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotLike(String value) {
            addCriterion("userInfo not like", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoIn(List<String> values) {
            addCriterion("userInfo in", values, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotIn(List<String> values) {
            addCriterion("userInfo not in", values, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoBetween(String value1, String value2) {
            addCriterion("userInfo between", value1, value2, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotBetween(String value1, String value2) {
            addCriterion("userInfo not between", value1, value2, "userinfo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}