<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/6
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
    <script type="text/javascript">
        function init() {
        var map = new AMap.Map("container", {
            resizeEnable: true,
            // zoom: 14
        });
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
            autoFitView: true,
            panel: 'panel'
        });

        var path = [];
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
                            log.success('获取货车规划数据成功')
                        } else {
                            log.error('获取货车规划数据失败：' + result)
                        }
                    });
                },
                error: function () {
                    alert("错误");
                }
            });
        }

    </script>
</head>
<body onload="init()">
<div id="container"></div>
<a><button>开始导航</button></a>
<div id="panel"></div>
</body>
</html>
