package com.it.vehicle.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AddressInfo {

    /**
     * status : 1
     * regeocode : {"formatted_address":"北京市朝阳区望京街道方恒国际中心B座方恒国际中心"}
     * info : OK
     * infocode : 10000
     */

    private String status;
    private RegeocodeBean regeocode;
    private String info;
    private String infocode;

    @NoArgsConstructor
    @Data
    public static class RegeocodeBean {
        /**
         * formatted_address : 北京市朝阳区望京街道方恒国际中心B座方恒国际中心
         */

        private String formatted_address;
    }
}
