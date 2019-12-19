package com.it.vehicle.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SigningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SigningExample() {
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

        public Criteria andSigningIdIsNull() {
            addCriterion("signing_id is null");
            return (Criteria) this;
        }

        public Criteria andSigningIdIsNotNull() {
            addCriterion("signing_id is not null");
            return (Criteria) this;
        }

        public Criteria andSigningIdEqualTo(Integer value) {
            addCriterion("signing_id =", value, "signingId");
            return (Criteria) this;
        }

        public Criteria andSigningIdNotEqualTo(Integer value) {
            addCriterion("signing_id <>", value, "signingId");
            return (Criteria) this;
        }

        public Criteria andSigningIdGreaterThan(Integer value) {
            addCriterion("signing_id >", value, "signingId");
            return (Criteria) this;
        }

        public Criteria andSigningIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("signing_id >=", value, "signingId");
            return (Criteria) this;
        }

        public Criteria andSigningIdLessThan(Integer value) {
            addCriterion("signing_id <", value, "signingId");
            return (Criteria) this;
        }

        public Criteria andSigningIdLessThanOrEqualTo(Integer value) {
            addCriterion("signing_id <=", value, "signingId");
            return (Criteria) this;
        }

        public Criteria andSigningIdIn(List<Integer> values) {
            addCriterion("signing_id in", values, "signingId");
            return (Criteria) this;
        }

        public Criteria andSigningIdNotIn(List<Integer> values) {
            addCriterion("signing_id not in", values, "signingId");
            return (Criteria) this;
        }

        public Criteria andSigningIdBetween(Integer value1, Integer value2) {
            addCriterion("signing_id between", value1, value2, "signingId");
            return (Criteria) this;
        }

        public Criteria andSigningIdNotBetween(Integer value1, Integer value2) {
            addCriterion("signing_id not between", value1, value2, "signingId");
            return (Criteria) this;
        }

        public Criteria andTransportNumberIsNull() {
            addCriterion("transport_number is null");
            return (Criteria) this;
        }

        public Criteria andTransportNumberIsNotNull() {
            addCriterion("transport_number is not null");
            return (Criteria) this;
        }

        public Criteria andTransportNumberEqualTo(String value) {
            addCriterion("transport_number =", value, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberNotEqualTo(String value) {
            addCriterion("transport_number <>", value, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberGreaterThan(String value) {
            addCriterion("transport_number >", value, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberGreaterThanOrEqualTo(String value) {
            addCriterion("transport_number >=", value, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberLessThan(String value) {
            addCriterion("transport_number <", value, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberLessThanOrEqualTo(String value) {
            addCriterion("transport_number <=", value, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberLike(String value) {
            addCriterion("transport_number like", value, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberNotLike(String value) {
            addCriterion("transport_number not like", value, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberIn(List<String> values) {
            addCriterion("transport_number in", values, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberNotIn(List<String> values) {
            addCriterion("transport_number not in", values, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberBetween(String value1, String value2) {
            addCriterion("transport_number between", value1, value2, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andTransportNumberNotBetween(String value1, String value2) {
            addCriterion("transport_number not between", value1, value2, "transportNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberIsNull() {
            addCriterion("\"signing_ identity_card_number\" is null");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberIsNotNull() {
            addCriterion("\"signing_ identity_card_number\" is not null");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberEqualTo(String value) {
            addCriterion("\"signing_ identity_card_number\" =", value, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberNotEqualTo(String value) {
            addCriterion("\"signing_ identity_card_number\" <>", value, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberGreaterThan(String value) {
            addCriterion("\"signing_ identity_card_number\" >", value, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("\"signing_ identity_card_number\" >=", value, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberLessThan(String value) {
            addCriterion("\"signing_ identity_card_number\" <", value, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberLessThanOrEqualTo(String value) {
            addCriterion("\"signing_ identity_card_number\" <=", value, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberLike(String value) {
            addCriterion("\"signing_ identity_card_number\" like", value, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberNotLike(String value) {
            addCriterion("\"signing_ identity_card_number\" not like", value, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberIn(List<String> values) {
            addCriterion("\"signing_ identity_card_number\" in", values, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberNotIn(List<String> values) {
            addCriterion("\"signing_ identity_card_number\" not in", values, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberBetween(String value1, String value2) {
            addCriterion("\"signing_ identity_card_number\" between", value1, value2, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningIdentityCardNumberNotBetween(String value1, String value2) {
            addCriterion("\"signing_ identity_card_number\" not between", value1, value2, "signingIdentityCardNumber");
            return (Criteria) this;
        }

        public Criteria andSigningStatusIsNull() {
            addCriterion("signing_status is null");
            return (Criteria) this;
        }

        public Criteria andSigningStatusIsNotNull() {
            addCriterion("signing_status is not null");
            return (Criteria) this;
        }

        public Criteria andSigningStatusEqualTo(Integer value) {
            addCriterion("signing_status =", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusNotEqualTo(Integer value) {
            addCriterion("signing_status <>", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusGreaterThan(Integer value) {
            addCriterion("signing_status >", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("signing_status >=", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusLessThan(Integer value) {
            addCriterion("signing_status <", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusLessThanOrEqualTo(Integer value) {
            addCriterion("signing_status <=", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusIn(List<Integer> values) {
            addCriterion("signing_status in", values, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusNotIn(List<Integer> values) {
            addCriterion("signing_status not in", values, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusBetween(Integer value1, Integer value2) {
            addCriterion("signing_status between", value1, value2, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("signing_status not between", value1, value2, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningNoteIsNull() {
            addCriterion("signing_note is null");
            return (Criteria) this;
        }

        public Criteria andSigningNoteIsNotNull() {
            addCriterion("signing_note is not null");
            return (Criteria) this;
        }

        public Criteria andSigningNoteEqualTo(String value) {
            addCriterion("signing_note =", value, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteNotEqualTo(String value) {
            addCriterion("signing_note <>", value, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteGreaterThan(String value) {
            addCriterion("signing_note >", value, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteGreaterThanOrEqualTo(String value) {
            addCriterion("signing_note >=", value, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteLessThan(String value) {
            addCriterion("signing_note <", value, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteLessThanOrEqualTo(String value) {
            addCriterion("signing_note <=", value, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteLike(String value) {
            addCriterion("signing_note like", value, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteNotLike(String value) {
            addCriterion("signing_note not like", value, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteIn(List<String> values) {
            addCriterion("signing_note in", values, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteNotIn(List<String> values) {
            addCriterion("signing_note not in", values, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteBetween(String value1, String value2) {
            addCriterion("signing_note between", value1, value2, "signingNote");
            return (Criteria) this;
        }

        public Criteria andSigningNoteNotBetween(String value1, String value2) {
            addCriterion("signing_note not between", value1, value2, "signingNote");
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

        public Criteria andTransportIdIsNull() {
            addCriterion("transport_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportIdIsNotNull() {
            addCriterion("transport_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportIdEqualTo(Integer value) {
            addCriterion("transport_id =", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotEqualTo(Integer value) {
            addCriterion("transport_id <>", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThan(Integer value) {
            addCriterion("transport_id >", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_id >=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThan(Integer value) {
            addCriterion("transport_id <", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThanOrEqualTo(Integer value) {
            addCriterion("transport_id <=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdIn(List<Integer> values) {
            addCriterion("transport_id in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotIn(List<Integer> values) {
            addCriterion("transport_id not in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdBetween(Integer value1, Integer value2) {
            addCriterion("transport_id between", value1, value2, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_id not between", value1, value2, "transportId");
            return (Criteria) this;
        }

        public Criteria andPictureAddressIsNull() {
            addCriterion("picture_address is null");
            return (Criteria) this;
        }

        public Criteria andPictureAddressIsNotNull() {
            addCriterion("picture_address is not null");
            return (Criteria) this;
        }

        public Criteria andPictureAddressEqualTo(String value) {
            addCriterion("picture_address =", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressNotEqualTo(String value) {
            addCriterion("picture_address <>", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressGreaterThan(String value) {
            addCriterion("picture_address >", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressGreaterThanOrEqualTo(String value) {
            addCriterion("picture_address >=", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressLessThan(String value) {
            addCriterion("picture_address <", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressLessThanOrEqualTo(String value) {
            addCriterion("picture_address <=", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressLike(String value) {
            addCriterion("picture_address like", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressNotLike(String value) {
            addCriterion("picture_address not like", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressIn(List<String> values) {
            addCriterion("picture_address in", values, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressNotIn(List<String> values) {
            addCriterion("picture_address not in", values, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressBetween(String value1, String value2) {
            addCriterion("picture_address between", value1, value2, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressNotBetween(String value1, String value2) {
            addCriterion("picture_address not between", value1, value2, "pictureAddress");
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