package com.it.vehicle.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransportExample() {
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

        public Criteria andTransportOriginIsNull() {
            addCriterion("transport_origin is null");
            return (Criteria) this;
        }

        public Criteria andTransportOriginIsNotNull() {
            addCriterion("transport_origin is not null");
            return (Criteria) this;
        }

        public Criteria andTransportOriginEqualTo(String value) {
            addCriterion("transport_origin =", value, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginNotEqualTo(String value) {
            addCriterion("transport_origin <>", value, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginGreaterThan(String value) {
            addCriterion("transport_origin >", value, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginGreaterThanOrEqualTo(String value) {
            addCriterion("transport_origin >=", value, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginLessThan(String value) {
            addCriterion("transport_origin <", value, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginLessThanOrEqualTo(String value) {
            addCriterion("transport_origin <=", value, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginLike(String value) {
            addCriterion("transport_origin like", value, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginNotLike(String value) {
            addCriterion("transport_origin not like", value, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginIn(List<String> values) {
            addCriterion("transport_origin in", values, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginNotIn(List<String> values) {
            addCriterion("transport_origin not in", values, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginBetween(String value1, String value2) {
            addCriterion("transport_origin between", value1, value2, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportOriginNotBetween(String value1, String value2) {
            addCriterion("transport_origin not between", value1, value2, "transportOrigin");
            return (Criteria) this;
        }

        public Criteria andTransportEndIsNull() {
            addCriterion("transport_end is null");
            return (Criteria) this;
        }

        public Criteria andTransportEndIsNotNull() {
            addCriterion("transport_end is not null");
            return (Criteria) this;
        }

        public Criteria andTransportEndEqualTo(String value) {
            addCriterion("transport_end =", value, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndNotEqualTo(String value) {
            addCriterion("transport_end <>", value, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndGreaterThan(String value) {
            addCriterion("transport_end >", value, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndGreaterThanOrEqualTo(String value) {
            addCriterion("transport_end >=", value, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndLessThan(String value) {
            addCriterion("transport_end <", value, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndLessThanOrEqualTo(String value) {
            addCriterion("transport_end <=", value, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndLike(String value) {
            addCriterion("transport_end like", value, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndNotLike(String value) {
            addCriterion("transport_end not like", value, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndIn(List<String> values) {
            addCriterion("transport_end in", values, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndNotIn(List<String> values) {
            addCriterion("transport_end not in", values, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndBetween(String value1, String value2) {
            addCriterion("transport_end between", value1, value2, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportEndNotBetween(String value1, String value2) {
            addCriterion("transport_end not between", value1, value2, "transportEnd");
            return (Criteria) this;
        }

        public Criteria andTransportStateIsNull() {
            addCriterion("transport_state is null");
            return (Criteria) this;
        }

        public Criteria andTransportStateIsNotNull() {
            addCriterion("transport_state is not null");
            return (Criteria) this;
        }

        public Criteria andTransportStateEqualTo(Integer value) {
            addCriterion("transport_state =", value, "transportState");
            return (Criteria) this;
        }

        public Criteria andTransportStateNotEqualTo(Integer value) {
            addCriterion("transport_state <>", value, "transportState");
            return (Criteria) this;
        }

        public Criteria andTransportStateGreaterThan(Integer value) {
            addCriterion("transport_state >", value, "transportState");
            return (Criteria) this;
        }

        public Criteria andTransportStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_state >=", value, "transportState");
            return (Criteria) this;
        }

        public Criteria andTransportStateLessThan(Integer value) {
            addCriterion("transport_state <", value, "transportState");
            return (Criteria) this;
        }

        public Criteria andTransportStateLessThanOrEqualTo(Integer value) {
            addCriterion("transport_state <=", value, "transportState");
            return (Criteria) this;
        }

        public Criteria andTransportStateIn(List<Integer> values) {
            addCriterion("transport_state in", values, "transportState");
            return (Criteria) this;
        }

        public Criteria andTransportStateNotIn(List<Integer> values) {
            addCriterion("transport_state not in", values, "transportState");
            return (Criteria) this;
        }

        public Criteria andTransportStateBetween(Integer value1, Integer value2) {
            addCriterion("transport_state between", value1, value2, "transportState");
            return (Criteria) this;
        }

        public Criteria andTransportStateNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_state not between", value1, value2, "transportState");
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

        public Criteria andTransportWeightIsNull() {
            addCriterion("transport_weight is null");
            return (Criteria) this;
        }

        public Criteria andTransportWeightIsNotNull() {
            addCriterion("transport_weight is not null");
            return (Criteria) this;
        }

        public Criteria andTransportWeightEqualTo(Float value) {
            addCriterion("transport_weight =", value, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportWeightNotEqualTo(Float value) {
            addCriterion("transport_weight <>", value, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportWeightGreaterThan(Float value) {
            addCriterion("transport_weight >", value, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("transport_weight >=", value, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportWeightLessThan(Float value) {
            addCriterion("transport_weight <", value, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportWeightLessThanOrEqualTo(Float value) {
            addCriterion("transport_weight <=", value, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportWeightIn(List<Float> values) {
            addCriterion("transport_weight in", values, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportWeightNotIn(List<Float> values) {
            addCriterion("transport_weight not in", values, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportWeightBetween(Float value1, Float value2) {
            addCriterion("transport_weight between", value1, value2, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportWeightNotBetween(Float value1, Float value2) {
            addCriterion("transport_weight not between", value1, value2, "transportWeight");
            return (Criteria) this;
        }

        public Criteria andTransportPathIsNull() {
            addCriterion("transport_path is null");
            return (Criteria) this;
        }

        public Criteria andTransportPathIsNotNull() {
            addCriterion("transport_path is not null");
            return (Criteria) this;
        }

        public Criteria andTransportPathEqualTo(String value) {
            addCriterion("transport_path =", value, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathNotEqualTo(String value) {
            addCriterion("transport_path <>", value, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathGreaterThan(String value) {
            addCriterion("transport_path >", value, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathGreaterThanOrEqualTo(String value) {
            addCriterion("transport_path >=", value, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathLessThan(String value) {
            addCriterion("transport_path <", value, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathLessThanOrEqualTo(String value) {
            addCriterion("transport_path <=", value, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathLike(String value) {
            addCriterion("transport_path like", value, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathNotLike(String value) {
            addCriterion("transport_path not like", value, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathIn(List<String> values) {
            addCriterion("transport_path in", values, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathNotIn(List<String> values) {
            addCriterion("transport_path not in", values, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathBetween(String value1, String value2) {
            addCriterion("transport_path between", value1, value2, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportPathNotBetween(String value1, String value2) {
            addCriterion("transport_path not between", value1, value2, "transportPath");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeIsNull() {
            addCriterion("transportz_delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeIsNotNull() {
            addCriterion("transportz_delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeEqualTo(Date value) {
            addCriterion("transportz_delivery_time =", value, "transportzDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeNotEqualTo(Date value) {
            addCriterion("transportz_delivery_time <>", value, "transportzDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeGreaterThan(Date value) {
            addCriterion("transportz_delivery_time >", value, "transportzDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transportz_delivery_time >=", value, "transportzDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeLessThan(Date value) {
            addCriterion("transportz_delivery_time <", value, "transportzDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("transportz_delivery_time <=", value, "transportzDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeIn(List<Date> values) {
            addCriterion("transportz_delivery_time in", values, "transportzDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeNotIn(List<Date> values) {
            addCriterion("transportz_delivery_time not in", values, "transportzDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("transportz_delivery_time between", value1, value2, "transportzDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andTransportzDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("transportz_delivery_time not between", value1, value2, "transportzDeliveryTime");
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