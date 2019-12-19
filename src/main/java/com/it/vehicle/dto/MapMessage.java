package com.it.vehicle.dto;


import java.util.List;


public class MapMessage {

    /**
     * count : 1
     * infocode : 10000
     * geocodes : [{"country":"中国","formatted_address":"河南省商丘市","city":"商丘市","adcode":"411400","level":"市","building":{"name":[],"type":[]},"number":[],"province":"河南省","citycode":"0370","street":[],"district":[],"location":"115.656370,34.414172","neighborhood":{"name":[],"type":[]},"township":[]}]
     * status : 1
     * info : OK
     */

    private String count;
    private String infoCode;
    private String status;
    private String info;
    private List<GeocodesBean> geocodes;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<GeocodesBean> getGeocodes() {
        return geocodes;
    }

    public void setGeocodes(List<GeocodesBean> geocodes) {
        this.geocodes = geocodes;
    }

    public static class GeocodesBean {
        /**
         * country : 中国
         * formatted_address : 河南省商丘市
         * city : 商丘市
         * adcode : 411400
         * level : 市
         * building : {"name":[],"type":[]}
         * number : []
         * province : 河南省
         * citycode : 0370
         * street : []
         * district : []
         * location : 115.656370,34.414172
         * neighborhood : {"name":[],"type":[]}
         * township : []
         */

        private String country;
        private String formatted_address;
        private String city;
        private String adcode;
        private String level;
        private BuildingBean building;
        private String province;
        private String citycode;
        private String location;
        private NeighborhoodBean neighborhood;
        private List<?> number;
        private List<?> street;
        private List<?> district;
        private List<?> township;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAdcode() {
            return adcode;
        }

        public void setAdcode(String adcode) {
            this.adcode = adcode;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public BuildingBean getBuilding() {
            return building;
        }

        public void setBuilding(BuildingBean building) {
            this.building = building;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCitycode() {
            return citycode;
        }

        public void setCitycode(String citycode) {
            this.citycode = citycode;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public NeighborhoodBean getNeighborhood() {
            return neighborhood;
        }

        public void setNeighborhood(NeighborhoodBean neighborhood) {
            this.neighborhood = neighborhood;
        }

        public List<?> getNumber() {
            return number;
        }

        public void setNumber(List<?> number) {
            this.number = number;
        }

        public List<?> getStreet() {
            return street;
        }

        public void setStreet(List<?> street) {
            this.street = street;
        }

        public List<?> getDistrict() {
            return district;
        }

        public void setDistrict(List<?> district) {
            this.district = district;
        }

        public List<?> getTownship() {
            return township;
        }

        public void setTownship(List<?> township) {
            this.township = township;
        }

        public static class BuildingBean {
            private List<?> name;
            private List<?> type;

            public List<?> getName() {
                return name;
            }

            public void setName(List<?> name) {
                this.name = name;
            }

            public List<?> getType() {
                return type;
            }

            public void setType(List<?> type) {
                this.type = type;
            }
        }

        public static class NeighborhoodBean {
            private List<?> name;
            private List<?> type;

            public List<?> getName() {
                return name;
            }

            public void setName(List<?> name) {
                this.name = name;
            }

            public List<?> getType() {
                return type;
            }

            public void setType(List<?> type) {
                this.type = type;
            }
        }
    }
}
