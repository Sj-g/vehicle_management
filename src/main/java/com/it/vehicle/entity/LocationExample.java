package com.it.vehicle.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LocationExample() {
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

        public Criteria andLocationIdIsNull() {
            addCriterion("location_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("location_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(Integer value) {
            addCriterion("location_id =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(Integer value) {
            addCriterion("location_id <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(Integer value) {
            addCriterion("location_id >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_id >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(Integer value) {
            addCriterion("location_id <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_id <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<Integer> values) {
            addCriterion("location_id in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<Integer> values) {
            addCriterion("location_id not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_id not between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdIsNull() {
            addCriterion("location_truck_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdIsNotNull() {
            addCriterion("location_truck_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdEqualTo(Integer value) {
            addCriterion("location_truck_id =", value, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdNotEqualTo(Integer value) {
            addCriterion("location_truck_id <>", value, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdGreaterThan(Integer value) {
            addCriterion("location_truck_id >", value, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_truck_id >=", value, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdLessThan(Integer value) {
            addCriterion("location_truck_id <", value, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_truck_id <=", value, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdIn(List<Integer> values) {
            addCriterion("location_truck_id in", values, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdNotIn(List<Integer> values) {
            addCriterion("location_truck_id not in", values, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdBetween(Integer value1, Integer value2) {
            addCriterion("location_truck_id between", value1, value2, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andLocationTruckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_truck_id not between", value1, value2, "locationTruckId");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeIsNull() {
            addCriterion("truck_latitude is null");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeIsNotNull() {
            addCriterion("truck_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeEqualTo(String value) {
            addCriterion("truck_latitude =", value, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeNotEqualTo(String value) {
            addCriterion("truck_latitude <>", value, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeGreaterThan(String value) {
            addCriterion("truck_latitude >", value, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("truck_latitude >=", value, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeLessThan(String value) {
            addCriterion("truck_latitude <", value, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeLessThanOrEqualTo(String value) {
            addCriterion("truck_latitude <=", value, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeLike(String value) {
            addCriterion("truck_latitude like", value, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeNotLike(String value) {
            addCriterion("truck_latitude not like", value, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeIn(List<String> values) {
            addCriterion("truck_latitude in", values, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeNotIn(List<String> values) {
            addCriterion("truck_latitude not in", values, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeBetween(String value1, String value2) {
            addCriterion("truck_latitude between", value1, value2, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLatitudeNotBetween(String value1, String value2) {
            addCriterion("truck_latitude not between", value1, value2, "truckLatitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeIsNull() {
            addCriterion("truck_longitude is null");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeIsNotNull() {
            addCriterion("truck_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeEqualTo(String value) {
            addCriterion("truck_longitude =", value, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeNotEqualTo(String value) {
            addCriterion("truck_longitude <>", value, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeGreaterThan(String value) {
            addCriterion("truck_longitude >", value, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("truck_longitude >=", value, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeLessThan(String value) {
            addCriterion("truck_longitude <", value, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeLessThanOrEqualTo(String value) {
            addCriterion("truck_longitude <=", value, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeLike(String value) {
            addCriterion("truck_longitude like", value, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeNotLike(String value) {
            addCriterion("truck_longitude not like", value, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeIn(List<String> values) {
            addCriterion("truck_longitude in", values, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeNotIn(List<String> values) {
            addCriterion("truck_longitude not in", values, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeBetween(String value1, String value2) {
            addCriterion("truck_longitude between", value1, value2, "truckLongitude");
            return (Criteria) this;
        }

        public Criteria andTruckLongitudeNotBetween(String value1, String value2) {
            addCriterion("truck_longitude not between", value1, value2, "truckLongitude");
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