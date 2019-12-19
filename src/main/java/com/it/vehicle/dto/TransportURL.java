package com.it.vehicle.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class TransportURL {

    private List<String> path;
    private List<Integer> truck_number_list;
    private List<List<Integer>> order_id_list;
    private List<Float> orders_weight;
}
