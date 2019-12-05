package com.it.vehicle.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("driver_id like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("driver_id not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameIsNull() {
            addCriterion("driver_real_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameIsNotNull() {
            addCriterion("driver_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameEqualTo(String value) {
            addCriterion("driver_real_name =", value, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameNotEqualTo(String value) {
            addCriterion("driver_real_name <>", value, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameGreaterThan(String value) {
            addCriterion("driver_real_name >", value, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_real_name >=", value, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameLessThan(String value) {
            addCriterion("driver_real_name <", value, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameLessThanOrEqualTo(String value) {
            addCriterion("driver_real_name <=", value, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameLike(String value) {
            addCriterion("driver_real_name like", value, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameNotLike(String value) {
            addCriterion("driver_real_name not like", value, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameIn(List<String> values) {
            addCriterion("driver_real_name in", values, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameNotIn(List<String> values) {
            addCriterion("driver_real_name not in", values, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameBetween(String value1, String value2) {
            addCriterion("driver_real_name between", value1, value2, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverRealNameNotBetween(String value1, String value2) {
            addCriterion("driver_real_name not between", value1, value2, "driverRealName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordIsNull() {
            addCriterion("driver_password is null");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordIsNotNull() {
            addCriterion("driver_password is not null");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordEqualTo(String value) {
            addCriterion("driver_password =", value, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordNotEqualTo(String value) {
            addCriterion("driver_password <>", value, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordGreaterThan(String value) {
            addCriterion("driver_password >", value, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("driver_password >=", value, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordLessThan(String value) {
            addCriterion("driver_password <", value, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordLessThanOrEqualTo(String value) {
            addCriterion("driver_password <=", value, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordLike(String value) {
            addCriterion("driver_password like", value, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordNotLike(String value) {
            addCriterion("driver_password not like", value, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordIn(List<String> values) {
            addCriterion("driver_password in", values, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordNotIn(List<String> values) {
            addCriterion("driver_password not in", values, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordBetween(String value1, String value2) {
            addCriterion("driver_password between", value1, value2, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverPasswordNotBetween(String value1, String value2) {
            addCriterion("driver_password not between", value1, value2, "driverPassword");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayIsNull() {
            addCriterion("driver_birthday is null");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayIsNotNull() {
            addCriterion("driver_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("driver_birthday =", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("driver_birthday <>", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("driver_birthday >", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driver_birthday >=", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("driver_birthday <", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driver_birthday <=", value, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("driver_birthday in", values, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("driver_birthday not in", values, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driver_birthday between", value1, value2, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driver_birthday not between", value1, value2, "driverBirthday");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberIsNull() {
            addCriterion("driver_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberIsNotNull() {
            addCriterion("driver_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberEqualTo(String value) {
            addCriterion("driver_phone_number =", value, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberNotEqualTo(String value) {
            addCriterion("driver_phone_number <>", value, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberGreaterThan(String value) {
            addCriterion("driver_phone_number >", value, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("driver_phone_number >=", value, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberLessThan(String value) {
            addCriterion("driver_phone_number <", value, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("driver_phone_number <=", value, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberLike(String value) {
            addCriterion("driver_phone_number like", value, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberNotLike(String value) {
            addCriterion("driver_phone_number not like", value, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberIn(List<String> values) {
            addCriterion("driver_phone_number in", values, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberNotIn(List<String> values) {
            addCriterion("driver_phone_number not in", values, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberBetween(String value1, String value2) {
            addCriterion("driver_phone_number between", value1, value2, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("driver_phone_number not between", value1, value2, "driverPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberIsNull() {
            addCriterion("driver_id_number is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberIsNotNull() {
            addCriterion("driver_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberEqualTo(String value) {
            addCriterion("driver_id_number =", value, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberNotEqualTo(String value) {
            addCriterion("driver_id_number <>", value, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberGreaterThan(String value) {
            addCriterion("driver_id_number >", value, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id_number >=", value, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberLessThan(String value) {
            addCriterion("driver_id_number <", value, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberLessThanOrEqualTo(String value) {
            addCriterion("driver_id_number <=", value, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberLike(String value) {
            addCriterion("driver_id_number like", value, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberNotLike(String value) {
            addCriterion("driver_id_number not like", value, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberIn(List<String> values) {
            addCriterion("driver_id_number in", values, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberNotIn(List<String> values) {
            addCriterion("driver_id_number not in", values, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberBetween(String value1, String value2) {
            addCriterion("driver_id_number between", value1, value2, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverIdNumberNotBetween(String value1, String value2) {
            addCriterion("driver_id_number not between", value1, value2, "driverIdNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNativeIsNull() {
            addCriterion("driver_native is null");
            return (Criteria) this;
        }

        public Criteria andDriverNativeIsNotNull() {
            addCriterion("driver_native is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNativeEqualTo(String value) {
            addCriterion("driver_native =", value, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeNotEqualTo(String value) {
            addCriterion("driver_native <>", value, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeGreaterThan(String value) {
            addCriterion("driver_native >", value, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeGreaterThanOrEqualTo(String value) {
            addCriterion("driver_native >=", value, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeLessThan(String value) {
            addCriterion("driver_native <", value, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeLessThanOrEqualTo(String value) {
            addCriterion("driver_native <=", value, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeLike(String value) {
            addCriterion("driver_native like", value, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeNotLike(String value) {
            addCriterion("driver_native not like", value, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeIn(List<String> values) {
            addCriterion("driver_native in", values, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeNotIn(List<String> values) {
            addCriterion("driver_native not in", values, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeBetween(String value1, String value2) {
            addCriterion("driver_native between", value1, value2, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNativeNotBetween(String value1, String value2) {
            addCriterion("driver_native not between", value1, value2, "driverNative");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressIsNull() {
            addCriterion("driver_now_address is null");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressIsNotNull() {
            addCriterion("driver_now_address is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressEqualTo(String value) {
            addCriterion("driver_now_address =", value, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressNotEqualTo(String value) {
            addCriterion("driver_now_address <>", value, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressGreaterThan(String value) {
            addCriterion("driver_now_address >", value, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressGreaterThanOrEqualTo(String value) {
            addCriterion("driver_now_address >=", value, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressLessThan(String value) {
            addCriterion("driver_now_address <", value, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressLessThanOrEqualTo(String value) {
            addCriterion("driver_now_address <=", value, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressLike(String value) {
            addCriterion("driver_now_address like", value, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressNotLike(String value) {
            addCriterion("driver_now_address not like", value, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressIn(List<String> values) {
            addCriterion("driver_now_address in", values, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressNotIn(List<String> values) {
            addCriterion("driver_now_address not in", values, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressBetween(String value1, String value2) {
            addCriterion("driver_now_address between", value1, value2, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverNowAddressNotBetween(String value1, String value2) {
            addCriterion("driver_now_address not between", value1, value2, "driverNowAddress");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddIsNull() {
            addCriterion("driver_id_img_front_add is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddIsNotNull() {
            addCriterion("driver_id_img_front_add is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddEqualTo(String value) {
            addCriterion("driver_id_img_front_add =", value, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddNotEqualTo(String value) {
            addCriterion("driver_id_img_front_add <>", value, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddGreaterThan(String value) {
            addCriterion("driver_id_img_front_add >", value, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id_img_front_add >=", value, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddLessThan(String value) {
            addCriterion("driver_id_img_front_add <", value, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddLessThanOrEqualTo(String value) {
            addCriterion("driver_id_img_front_add <=", value, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddLike(String value) {
            addCriterion("driver_id_img_front_add like", value, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddNotLike(String value) {
            addCriterion("driver_id_img_front_add not like", value, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddIn(List<String> values) {
            addCriterion("driver_id_img_front_add in", values, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddNotIn(List<String> values) {
            addCriterion("driver_id_img_front_add not in", values, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddBetween(String value1, String value2) {
            addCriterion("driver_id_img_front_add between", value1, value2, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgFrontAddNotBetween(String value1, String value2) {
            addCriterion("driver_id_img_front_add not between", value1, value2, "driverIdImgFrontAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddIsNull() {
            addCriterion("driver_id_img_reverse_add is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddIsNotNull() {
            addCriterion("driver_id_img_reverse_add is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddEqualTo(String value) {
            addCriterion("driver_id_img_reverse_add =", value, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddNotEqualTo(String value) {
            addCriterion("driver_id_img_reverse_add <>", value, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddGreaterThan(String value) {
            addCriterion("driver_id_img_reverse_add >", value, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id_img_reverse_add >=", value, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddLessThan(String value) {
            addCriterion("driver_id_img_reverse_add <", value, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddLessThanOrEqualTo(String value) {
            addCriterion("driver_id_img_reverse_add <=", value, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddLike(String value) {
            addCriterion("driver_id_img_reverse_add like", value, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddNotLike(String value) {
            addCriterion("driver_id_img_reverse_add not like", value, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddIn(List<String> values) {
            addCriterion("driver_id_img_reverse_add in", values, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddNotIn(List<String> values) {
            addCriterion("driver_id_img_reverse_add not in", values, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddBetween(String value1, String value2) {
            addCriterion("driver_id_img_reverse_add between", value1, value2, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andDriverIdImgReverseAddNotBetween(String value1, String value2) {
            addCriterion("driver_id_img_reverse_add not between", value1, value2, "driverIdImgReverseAdd");
            return (Criteria) this;
        }

        public Criteria andLicenseIdIsNull() {
            addCriterion("license_id is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIdIsNotNull() {
            addCriterion("license_id is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseIdEqualTo(String value) {
            addCriterion("license_id =", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotEqualTo(String value) {
            addCriterion("license_id <>", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdGreaterThan(String value) {
            addCriterion("license_id >", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdGreaterThanOrEqualTo(String value) {
            addCriterion("license_id >=", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdLessThan(String value) {
            addCriterion("license_id <", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdLessThanOrEqualTo(String value) {
            addCriterion("license_id <=", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdLike(String value) {
            addCriterion("license_id like", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotLike(String value) {
            addCriterion("license_id not like", value, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdIn(List<String> values) {
            addCriterion("license_id in", values, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotIn(List<String> values) {
            addCriterion("license_id not in", values, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdBetween(String value1, String value2) {
            addCriterion("license_id between", value1, value2, "licenseId");
            return (Criteria) this;
        }

        public Criteria andLicenseIdNotBetween(String value1, String value2) {
            addCriterion("license_id not between", value1, value2, "licenseId");
            return (Criteria) this;
        }

        public Criteria andAllowTypeIsNull() {
            addCriterion("allow_type is null");
            return (Criteria) this;
        }

        public Criteria andAllowTypeIsNotNull() {
            addCriterion("allow_type is not null");
            return (Criteria) this;
        }

        public Criteria andAllowTypeEqualTo(String value) {
            addCriterion("allow_type =", value, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeNotEqualTo(String value) {
            addCriterion("allow_type <>", value, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeGreaterThan(String value) {
            addCriterion("allow_type >", value, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("allow_type >=", value, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeLessThan(String value) {
            addCriterion("allow_type <", value, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeLessThanOrEqualTo(String value) {
            addCriterion("allow_type <=", value, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeLike(String value) {
            addCriterion("allow_type like", value, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeNotLike(String value) {
            addCriterion("allow_type not like", value, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeIn(List<String> values) {
            addCriterion("allow_type in", values, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeNotIn(List<String> values) {
            addCriterion("allow_type not in", values, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeBetween(String value1, String value2) {
            addCriterion("allow_type between", value1, value2, "allowType");
            return (Criteria) this;
        }

        public Criteria andAllowTypeNotBetween(String value1, String value2) {
            addCriterion("allow_type not between", value1, value2, "allowType");
            return (Criteria) this;
        }

        public Criteria andTruckIdIsNull() {
            addCriterion("truck_id is null");
            return (Criteria) this;
        }

        public Criteria andTruckIdIsNotNull() {
            addCriterion("truck_id is not null");
            return (Criteria) this;
        }

        public Criteria andTruckIdEqualTo(String value) {
            addCriterion("truck_id =", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotEqualTo(String value) {
            addCriterion("truck_id <>", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThan(String value) {
            addCriterion("truck_id >", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThanOrEqualTo(String value) {
            addCriterion("truck_id >=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThan(String value) {
            addCriterion("truck_id <", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThanOrEqualTo(String value) {
            addCriterion("truck_id <=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLike(String value) {
            addCriterion("truck_id like", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotLike(String value) {
            addCriterion("truck_id not like", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdIn(List<String> values) {
            addCriterion("truck_id in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotIn(List<String> values) {
            addCriterion("truck_id not in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdBetween(String value1, String value2) {
            addCriterion("truck_id between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotBetween(String value1, String value2) {
            addCriterion("truck_id not between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatePassIsNull() {
            addCriterion("state_pass is null");
            return (Criteria) this;
        }

        public Criteria andStatePassIsNotNull() {
            addCriterion("state_pass is not null");
            return (Criteria) this;
        }

        public Criteria andStatePassEqualTo(Integer value) {
            addCriterion("state_pass =", value, "statePass");
            return (Criteria) this;
        }

        public Criteria andStatePassNotEqualTo(Integer value) {
            addCriterion("state_pass <>", value, "statePass");
            return (Criteria) this;
        }

        public Criteria andStatePassGreaterThan(Integer value) {
            addCriterion("state_pass >", value, "statePass");
            return (Criteria) this;
        }

        public Criteria andStatePassGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_pass >=", value, "statePass");
            return (Criteria) this;
        }

        public Criteria andStatePassLessThan(Integer value) {
            addCriterion("state_pass <", value, "statePass");
            return (Criteria) this;
        }

        public Criteria andStatePassLessThanOrEqualTo(Integer value) {
            addCriterion("state_pass <=", value, "statePass");
            return (Criteria) this;
        }

        public Criteria andStatePassIn(List<Integer> values) {
            addCriterion("state_pass in", values, "statePass");
            return (Criteria) this;
        }

        public Criteria andStatePassNotIn(List<Integer> values) {
            addCriterion("state_pass not in", values, "statePass");
            return (Criteria) this;
        }

        public Criteria andStatePassBetween(Integer value1, Integer value2) {
            addCriterion("state_pass between", value1, value2, "statePass");
            return (Criteria) this;
        }

        public Criteria andStatePassNotBetween(Integer value1, Integer value2) {
            addCriterion("state_pass not between", value1, value2, "statePass");
            return (Criteria) this;
        }

        public Criteria andStateNowIsNull() {
            addCriterion("state_now is null");
            return (Criteria) this;
        }

        public Criteria andStateNowIsNotNull() {
            addCriterion("state_now is not null");
            return (Criteria) this;
        }

        public Criteria andStateNowEqualTo(Integer value) {
            addCriterion("state_now =", value, "stateNow");
            return (Criteria) this;
        }

        public Criteria andStateNowNotEqualTo(Integer value) {
            addCriterion("state_now <>", value, "stateNow");
            return (Criteria) this;
        }

        public Criteria andStateNowGreaterThan(Integer value) {
            addCriterion("state_now >", value, "stateNow");
            return (Criteria) this;
        }

        public Criteria andStateNowGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_now >=", value, "stateNow");
            return (Criteria) this;
        }

        public Criteria andStateNowLessThan(Integer value) {
            addCriterion("state_now <", value, "stateNow");
            return (Criteria) this;
        }

        public Criteria andStateNowLessThanOrEqualTo(Integer value) {
            addCriterion("state_now <=", value, "stateNow");
            return (Criteria) this;
        }

        public Criteria andStateNowIn(List<Integer> values) {
            addCriterion("state_now in", values, "stateNow");
            return (Criteria) this;
        }

        public Criteria andStateNowNotIn(List<Integer> values) {
            addCriterion("state_now not in", values, "stateNow");
            return (Criteria) this;
        }

        public Criteria andStateNowBetween(Integer value1, Integer value2) {
            addCriterion("state_now between", value1, value2, "stateNow");
            return (Criteria) this;
        }

        public Criteria andStateNowNotBetween(Integer value1, Integer value2) {
            addCriterion("state_now not between", value1, value2, "stateNow");
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