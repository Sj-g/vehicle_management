package com.it.vehicle.entity;

import java.util.ArrayList;
import java.util.List;

public class TruckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TruckExample() {
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

        public Criteria andTruckIdIsNull() {
            addCriterion("truck_id is null");
            return (Criteria) this;
        }

        public Criteria andTruckIdIsNotNull() {
            addCriterion("truck_id is not null");
            return (Criteria) this;
        }

        public Criteria andTruckIdEqualTo(Integer value) {
            addCriterion("truck_id =", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotEqualTo(Integer value) {
            addCriterion("truck_id <>", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThan(Integer value) {
            addCriterion("truck_id >", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("truck_id >=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThan(Integer value) {
            addCriterion("truck_id <", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThanOrEqualTo(Integer value) {
            addCriterion("truck_id <=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdIn(List<Integer> values) {
            addCriterion("truck_id in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotIn(List<Integer> values) {
            addCriterion("truck_id not in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdBetween(Integer value1, Integer value2) {
            addCriterion("truck_id between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("truck_id not between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckNumberIsNull() {
            addCriterion("truck_number is null");
            return (Criteria) this;
        }

        public Criteria andTruckNumberIsNotNull() {
            addCriterion("truck_number is not null");
            return (Criteria) this;
        }

        public Criteria andTruckNumberEqualTo(String value) {
            addCriterion("truck_number =", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberNotEqualTo(String value) {
            addCriterion("truck_number <>", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberGreaterThan(String value) {
            addCriterion("truck_number >", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberGreaterThanOrEqualTo(String value) {
            addCriterion("truck_number >=", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberLessThan(String value) {
            addCriterion("truck_number <", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberLessThanOrEqualTo(String value) {
            addCriterion("truck_number <=", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberLike(String value) {
            addCriterion("truck_number like", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberNotLike(String value) {
            addCriterion("truck_number not like", value, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberIn(List<String> values) {
            addCriterion("truck_number in", values, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberNotIn(List<String> values) {
            addCriterion("truck_number not in", values, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberBetween(String value1, String value2) {
            addCriterion("truck_number between", value1, value2, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckNumberNotBetween(String value1, String value2) {
            addCriterion("truck_number not between", value1, value2, "truckNumber");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIsNull() {
            addCriterion("truck_type is null");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIsNotNull() {
            addCriterion("truck_type is not null");
            return (Criteria) this;
        }

        public Criteria andTruckTypeEqualTo(String value) {
            addCriterion("truck_type =", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeNotEqualTo(String value) {
            addCriterion("truck_type <>", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeGreaterThan(String value) {
            addCriterion("truck_type >", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("truck_type >=", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeLessThan(String value) {
            addCriterion("truck_type <", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeLessThanOrEqualTo(String value) {
            addCriterion("truck_type <=", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeLike(String value) {
            addCriterion("truck_type like", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeNotLike(String value) {
            addCriterion("truck_type not like", value, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIn(List<String> values) {
            addCriterion("truck_type in", values, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeNotIn(List<String> values) {
            addCriterion("truck_type not in", values, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeBetween(String value1, String value2) {
            addCriterion("truck_type between", value1, value2, "truckType");
            return (Criteria) this;
        }

        public Criteria andTruckTypeNotBetween(String value1, String value2) {
            addCriterion("truck_type not between", value1, value2, "truckType");
            return (Criteria) this;
        }

        public Criteria andMotorIdIsNull() {
            addCriterion("motor_id is null");
            return (Criteria) this;
        }

        public Criteria andMotorIdIsNotNull() {
            addCriterion("motor_id is not null");
            return (Criteria) this;
        }

        public Criteria andMotorIdEqualTo(String value) {
            addCriterion("motor_id =", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdNotEqualTo(String value) {
            addCriterion("motor_id <>", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdGreaterThan(String value) {
            addCriterion("motor_id >", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdGreaterThanOrEqualTo(String value) {
            addCriterion("motor_id >=", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdLessThan(String value) {
            addCriterion("motor_id <", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdLessThanOrEqualTo(String value) {
            addCriterion("motor_id <=", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdLike(String value) {
            addCriterion("motor_id like", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdNotLike(String value) {
            addCriterion("motor_id not like", value, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdIn(List<String> values) {
            addCriterion("motor_id in", values, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdNotIn(List<String> values) {
            addCriterion("motor_id not in", values, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdBetween(String value1, String value2) {
            addCriterion("motor_id between", value1, value2, "motorId");
            return (Criteria) this;
        }

        public Criteria andMotorIdNotBetween(String value1, String value2) {
            addCriterion("motor_id not between", value1, value2, "motorId");
            return (Criteria) this;
        }

        public Criteria andChassisIdIsNull() {
            addCriterion("chassis_id is null");
            return (Criteria) this;
        }

        public Criteria andChassisIdIsNotNull() {
            addCriterion("chassis_id is not null");
            return (Criteria) this;
        }

        public Criteria andChassisIdEqualTo(String value) {
            addCriterion("chassis_id =", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdNotEqualTo(String value) {
            addCriterion("chassis_id <>", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdGreaterThan(String value) {
            addCriterion("chassis_id >", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdGreaterThanOrEqualTo(String value) {
            addCriterion("chassis_id >=", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdLessThan(String value) {
            addCriterion("chassis_id <", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdLessThanOrEqualTo(String value) {
            addCriterion("chassis_id <=", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdLike(String value) {
            addCriterion("chassis_id like", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdNotLike(String value) {
            addCriterion("chassis_id not like", value, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdIn(List<String> values) {
            addCriterion("chassis_id in", values, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdNotIn(List<String> values) {
            addCriterion("chassis_id not in", values, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdBetween(String value1, String value2) {
            addCriterion("chassis_id between", value1, value2, "chassisId");
            return (Criteria) this;
        }

        public Criteria andChassisIdNotBetween(String value1, String value2) {
            addCriterion("chassis_id not between", value1, value2, "chassisId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIsNull() {
            addCriterion("insurance_company is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIsNotNull() {
            addCriterion("insurance_company is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyEqualTo(String value) {
            addCriterion("insurance_company =", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNotEqualTo(String value) {
            addCriterion("insurance_company <>", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyGreaterThan(String value) {
            addCriterion("insurance_company >", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_company >=", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyLessThan(String value) {
            addCriterion("insurance_company <", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyLessThanOrEqualTo(String value) {
            addCriterion("insurance_company <=", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyLike(String value) {
            addCriterion("insurance_company like", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNotLike(String value) {
            addCriterion("insurance_company not like", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIn(List<String> values) {
            addCriterion("insurance_company in", values, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNotIn(List<String> values) {
            addCriterion("insurance_company not in", values, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyBetween(String value1, String value2) {
            addCriterion("insurance_company between", value1, value2, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNotBetween(String value1, String value2) {
            addCriterion("insurance_company not between", value1, value2, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressIsNull() {
            addCriterion("truck_image_address is null");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressIsNotNull() {
            addCriterion("truck_image_address is not null");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressEqualTo(String value) {
            addCriterion("truck_image_address =", value, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressNotEqualTo(String value) {
            addCriterion("truck_image_address <>", value, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressGreaterThan(String value) {
            addCriterion("truck_image_address >", value, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressGreaterThanOrEqualTo(String value) {
            addCriterion("truck_image_address >=", value, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressLessThan(String value) {
            addCriterion("truck_image_address <", value, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressLessThanOrEqualTo(String value) {
            addCriterion("truck_image_address <=", value, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressLike(String value) {
            addCriterion("truck_image_address like", value, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressNotLike(String value) {
            addCriterion("truck_image_address not like", value, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressIn(List<String> values) {
            addCriterion("truck_image_address in", values, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressNotIn(List<String> values) {
            addCriterion("truck_image_address not in", values, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressBetween(String value1, String value2) {
            addCriterion("truck_image_address between", value1, value2, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckImageAddressNotBetween(String value1, String value2) {
            addCriterion("truck_image_address not between", value1, value2, "truckImageAddress");
            return (Criteria) this;
        }

        public Criteria andTruckWeightIsNull() {
            addCriterion("truck_weight is null");
            return (Criteria) this;
        }

        public Criteria andTruckWeightIsNotNull() {
            addCriterion("truck_weight is not null");
            return (Criteria) this;
        }

        public Criteria andTruckWeightEqualTo(Float value) {
            addCriterion("truck_weight =", value, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andTruckWeightNotEqualTo(Float value) {
            addCriterion("truck_weight <>", value, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andTruckWeightGreaterThan(Float value) {
            addCriterion("truck_weight >", value, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andTruckWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("truck_weight >=", value, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andTruckWeightLessThan(Float value) {
            addCriterion("truck_weight <", value, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andTruckWeightLessThanOrEqualTo(Float value) {
            addCriterion("truck_weight <=", value, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andTruckWeightIn(List<Float> values) {
            addCriterion("truck_weight in", values, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andTruckWeightNotIn(List<Float> values) {
            addCriterion("truck_weight not in", values, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andTruckWeightBetween(Float value1, Float value2) {
            addCriterion("truck_weight between", value1, value2, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andTruckWeightNotBetween(Float value1, Float value2) {
            addCriterion("truck_weight not between", value1, value2, "truckWeight");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityIsNull() {
            addCriterion("carrying_capacity is null");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityIsNotNull() {
            addCriterion("carrying_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityEqualTo(Float value) {
            addCriterion("carrying_capacity =", value, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityNotEqualTo(Float value) {
            addCriterion("carrying_capacity <>", value, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityGreaterThan(Float value) {
            addCriterion("carrying_capacity >", value, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityGreaterThanOrEqualTo(Float value) {
            addCriterion("carrying_capacity >=", value, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityLessThan(Float value) {
            addCriterion("carrying_capacity <", value, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityLessThanOrEqualTo(Float value) {
            addCriterion("carrying_capacity <=", value, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityIn(List<Float> values) {
            addCriterion("carrying_capacity in", values, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityNotIn(List<Float> values) {
            addCriterion("carrying_capacity not in", values, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityBetween(Float value1, Float value2) {
            addCriterion("carrying_capacity between", value1, value2, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andCarryingCapacityNotBetween(Float value1, Float value2) {
            addCriterion("carrying_capacity not between", value1, value2, "carryingCapacity");
            return (Criteria) this;
        }

        public Criteria andTruckHeightIsNull() {
            addCriterion("truck_height is null");
            return (Criteria) this;
        }

        public Criteria andTruckHeightIsNotNull() {
            addCriterion("truck_height is not null");
            return (Criteria) this;
        }

        public Criteria andTruckHeightEqualTo(Float value) {
            addCriterion("truck_height =", value, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckHeightNotEqualTo(Float value) {
            addCriterion("truck_height <>", value, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckHeightGreaterThan(Float value) {
            addCriterion("truck_height >", value, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckHeightGreaterThanOrEqualTo(Float value) {
            addCriterion("truck_height >=", value, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckHeightLessThan(Float value) {
            addCriterion("truck_height <", value, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckHeightLessThanOrEqualTo(Float value) {
            addCriterion("truck_height <=", value, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckHeightIn(List<Float> values) {
            addCriterion("truck_height in", values, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckHeightNotIn(List<Float> values) {
            addCriterion("truck_height not in", values, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckHeightBetween(Float value1, Float value2) {
            addCriterion("truck_height between", value1, value2, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckHeightNotBetween(Float value1, Float value2) {
            addCriterion("truck_height not between", value1, value2, "truckHeight");
            return (Criteria) this;
        }

        public Criteria andTruckWidthIsNull() {
            addCriterion("truck_width is null");
            return (Criteria) this;
        }

        public Criteria andTruckWidthIsNotNull() {
            addCriterion("truck_width is not null");
            return (Criteria) this;
        }

        public Criteria andTruckWidthEqualTo(Float value) {
            addCriterion("truck_width =", value, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckWidthNotEqualTo(Float value) {
            addCriterion("truck_width <>", value, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckWidthGreaterThan(Float value) {
            addCriterion("truck_width >", value, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckWidthGreaterThanOrEqualTo(Float value) {
            addCriterion("truck_width >=", value, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckWidthLessThan(Float value) {
            addCriterion("truck_width <", value, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckWidthLessThanOrEqualTo(Float value) {
            addCriterion("truck_width <=", value, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckWidthIn(List<Float> values) {
            addCriterion("truck_width in", values, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckWidthNotIn(List<Float> values) {
            addCriterion("truck_width not in", values, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckWidthBetween(Float value1, Float value2) {
            addCriterion("truck_width between", value1, value2, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckWidthNotBetween(Float value1, Float value2) {
            addCriterion("truck_width not between", value1, value2, "truckWidth");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisIsNull() {
            addCriterion("truck_controlled_axis is null");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisIsNotNull() {
            addCriterion("truck_controlled_axis is not null");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisEqualTo(Float value) {
            addCriterion("truck_controlled_axis =", value, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisNotEqualTo(Float value) {
            addCriterion("truck_controlled_axis <>", value, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisGreaterThan(Float value) {
            addCriterion("truck_controlled_axis >", value, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisGreaterThanOrEqualTo(Float value) {
            addCriterion("truck_controlled_axis >=", value, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisLessThan(Float value) {
            addCriterion("truck_controlled_axis <", value, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisLessThanOrEqualTo(Float value) {
            addCriterion("truck_controlled_axis <=", value, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisIn(List<Float> values) {
            addCriterion("truck_controlled_axis in", values, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisNotIn(List<Float> values) {
            addCriterion("truck_controlled_axis not in", values, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisBetween(Float value1, Float value2) {
            addCriterion("truck_controlled_axis between", value1, value2, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckControlledAxisNotBetween(Float value1, Float value2) {
            addCriterion("truck_controlled_axis not between", value1, value2, "truckControlledAxis");
            return (Criteria) this;
        }

        public Criteria andTruckLengthIsNull() {
            addCriterion("truck_length is null");
            return (Criteria) this;
        }

        public Criteria andTruckLengthIsNotNull() {
            addCriterion("truck_length is not null");
            return (Criteria) this;
        }

        public Criteria andTruckLengthEqualTo(Float value) {
            addCriterion("truck_length =", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthNotEqualTo(Float value) {
            addCriterion("truck_length <>", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthGreaterThan(Float value) {
            addCriterion("truck_length >", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthGreaterThanOrEqualTo(Float value) {
            addCriterion("truck_length >=", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthLessThan(Float value) {
            addCriterion("truck_length <", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthLessThanOrEqualTo(Float value) {
            addCriterion("truck_length <=", value, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthIn(List<Float> values) {
            addCriterion("truck_length in", values, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthNotIn(List<Float> values) {
            addCriterion("truck_length not in", values, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthBetween(Float value1, Float value2) {
            addCriterion("truck_length between", value1, value2, "truckLength");
            return (Criteria) this;
        }

        public Criteria andTruckLengthNotBetween(Float value1, Float value2) {
            addCriterion("truck_length not between", value1, value2, "truckLength");
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