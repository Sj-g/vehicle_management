<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/7
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/admin/css/map.css" />
    <title>位置经纬度 + 获取货车规划数据</title>
    <link rel="stylesheet" href="https://a.amap.com/jsapi_demos/static/demo-center/css/demo-center.css" />
    <script src="https://webapi.amap.com/maps?v=1.4.15&key=e9c487995fed9106a3c71d79172646f2&plugin=AMap.TruckDriving"></script>
    <script src="https://a.amap.com/jsapi_demos/static/demo-center/js/demoutils.js"></script>
    <script src="${pageContext.request.contextPath}/static/jquery/jquery-3.4.1.min.js"></script>
    <style type="text/css">
        body {
            margin: 0;
            height: 100%;
            width: 100%;
            position: absolute;
        }

        #mapContainer {
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
        }

        #tip {
            min-height: 65px;
            background-color: #fff;
            padding-left: 10px;
            padding-right: 10px;
            position: absolute;
            font-size: 12px;
            right: 10px;
            bottom: 20px;
            border-radius: 3px;
            line-height: 18px;
            border: 1px solid #ccc;
        }

        #tip input[type='button'] {
            margin-left: 10px;
            margin-right: 10px;
            margin-top: 10px;
            background-color: #0D9BF2;
            height: 30px;
            text-align: center;
            line-height: 30px;
            color: #fff;
            font-size: 12px;
            border-radius: 3px;
            outline: none;
            border: 0;
            float: right;
        }

        #panel {
            position: fixed;
            background-color: white;
            max-height: 90%;
            overflow-y: auto;
            top: 10px;
            right: 10px;
            width: 280px;
        }

        #panel .amap-lib-driving {
            border-radius: 4px;
            overflow: hidden;
        }
    </style>
    <script type="text/javascript">
        var map;
        function init() {
            map = new AMap.Map("container", {
                resizeEnable: true,
            });
            map.plugin('AMap.Geolocation', function() {
                geolocation = new AMap.Geolocation({
                    enableHighAccuracy: true,
                    //是否使用高精度定位，默认:true
                    timeout: 10000,
                    //超过10秒后停止定位，默认：无穷大
                    maximumAge: 0,
                    showButton: true,
                    //显示定位按钮，默认：true
                    buttonPosition: 'LB',
                    // showMarker:false,
                    panToLocation: false,
                    //定位按钮停靠位置，默认：'LB'，左下角
                    // zoomToAccuracy: true,
                    //定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
                });
            });
            map.addControl(geolocation);
            geolocation.getCurrentPosition(); //获取当前位置信息
            AMap.event.addListener(geolocation, 'complete', onComplete); //返回定位信息
            AMap.event.addListener(geolocation, 'error', onError); //返回定位出错信息
            //解析定位结果
            function onComplete(data) {
                lng = data.position.getLng();
                lat = data.position.getLat();
                var location={"longitude":lng,"latitude":lat};
                $.ajax({
                    url: "${pageContext.request.contextPath}/getLocation",
                    dateType: "json",
                    contentType: "application/json",
                    data: JSON.stringify(location ),
                    type: "POST",
                    success: function (result) {
                        alert("ajax成功");
                    },
                    error: function () {
                        alert("ajax错误");
                    }
                });
                route(lng,lat);
            }

            //解析定位错误信息
            function onError(data) {
                switch (data.info) {
                    case 'PERMISSION_DENIED':
                        log.error('浏览器阻止了定位操作');
                        break;
                    case 'POSITION_UNAVAILBLE':
                        log.error('无法获得当前位置');
                        break;
                    case 'TIMEOUT':
                        log.error('定位超时');
                        break;
                    default:
                        log.error(data.message);
                        break;
                }
            }
            function route(lng,lat) {
                var truckDriving = new AMap.TruckDriving({
                    map: map,
                    policy: 0, // 规划策略
                    size: 1, // 车型大小
                    width: 2.5, // 宽度
                    height: 2, // 高度
                    load: 1, // 载重
                    weight: 12, // 自重
                    axlesNum: 2, // 轴数
                    province: '京', // 车辆牌照省份
                    isOutline: true,
                    outlineColor: '#ffeeee',
                    showTraffic: true, //实况路段
                    // autoFitView: true
                    // panel: 'panel'
                });
                var path = [];
                path.push({
                    lnglat: [lng,lat]
                });
                $.ajax({
                    url: "${pageContext.request.contextPath}/getRoute",
                    dateType: "json",
                    // contentType: "application/json",
                    // data: s,
                    type: "GET",
                    success: function (result) {
                        alert("成功");
                        console.log(result);
                        for (var i in result){
                            path.push({
                                lnglat: [result[i].longitude,result[i].latitude]
                            });
                        }
                        console.log(path);
                        truckDriving.search(path, function(status, result) {
                            // searchResult即是对应的驾车导航信息，相关数据结构文档请参考  https://lbs.amap.com/api/javascript-api/reference/route-search#m_DrivingResult
                            if (status === 'complete') {
                                log.success('获取货车规划数据成功');
                                truckDriving.search(path, function(status, result) {
                                    if (status === 'complete') {
                                        // alert();
                                        log.success('获取货车规划数据成功');
                                    } else {
                                        log.error('获取货车规划数据失败：' + result)
                                    }
                                });
                            } else {
                                log.error('获取货车规划数据失败：' + result)
                            }
                        });
                    },
                    error: function () {
                        alert("获取规划信息错误");
                    }
                });

            }
        }

        function init2() {
            //设置中心和层级
            // document.querySelector("#random-zoomcenter-btn").onclick = function() {
            // 	map.setZoomAndCenter(16, [lng, lat]); //同时设置地图层级与中心点
            // }
            var lng = null,
                lat = null;
            map.plugin('AMap.Geolocation', function() {
                geolocation = new AMap.Geolocation({
                    enableHighAccuracy: true,
                    //是否使用高精度定位，默认:true
                    timeout: 10000,
                    //超过10秒后停止定位，默认：无穷大
                    maximumAge: 0,
                    showButton: true,
                    //显示定位按钮，默认：true
                    buttonPosition: 'LB',
                    // showMarker:false,
                    panToLocation: false,
                    //定位按钮停靠位置，默认：'LB'，左下角
                    // zoomToAccuracy: true,
                    //定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
                });

            });
            map.addControl(geolocation);
            geolocation.getCurrentPosition(); //获取当前位置信息
            AMap.event.addListener(geolocation, 'complete', onComplete); //返回定位信息
            AMap.event.addListener(geolocation, 'error', onError); //返回定位出错信息
            geolocation.watchPosition();
            setTimeout("getCurrentPosition()", 7000); //设置定时器实现自动定位,回调函数

            //解析定位结果
            function onComplete(data) {
                lng = data.position.getLng();
                lat = data.position.getLat();
                map.setZoomAndCenter(16, [lng, lat]); //同时设置地图层级与中心点
            }
            //解析定位错误信息
            function onError(data) {
                switch (data.info) {
                    case 'PERMISSION_DENIED':
                        log.error('浏览器阻止了定位操作');
                        break;
                    case 'POSITION_UNAVAILBLE':
                        log.error('无法获得当前位置');
                        break;
                    case 'TIMEOUT':
                        log.error('定位超时');
                        break;
                    default:
                        log.error(data.message);
                        break;
                }
            }
        }
    </script>

</head>
<body onload="init()">
<div id="container"></div>
<div id="tip">
    <div class="input-card" style="width:24rem">
        <div class="input-item">
            <button onclick="init2()" class="btn">开始导航</button>
        </div>
    </div>
</div>
</body>
</html>

