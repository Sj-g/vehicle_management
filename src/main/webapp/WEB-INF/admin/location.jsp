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
    <title>浏览器精确定位</title>
    <link rel="stylesheet" href="https://a.amap.com/jsapi_demos/static/demo-center/css/demo-center.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/admin/css/location.css" />
<body>
<div id='container'></div>
<div class="info">
    <h4 id='status'></h4>
    <hr>
    <p id='result'></p>
    <hr>
</div>
<script type="text/javascript" src="https://webapi.amap.com/maps?v=1.4.15&key=e9c487995fed9106a3c71d79172646f2"></script>
<script src="https://a.amap.com/jsapi_demos/static/demo-center/js/demoutils.js"></script>
<script type="text/javascript">
    var map = new AMap.Map('container', {
        resizeEnable: true
    });
    AMap.plugin('AMap.Geolocation', function() {
        var geolocation = new AMap.Geolocation({
            enableHighAccuracy: true, //是否使用高精度定位，默认:true
            timeout: 10000, //超过10秒后停止定位，默认：5s
            buttonPosition: 'RB', //定位按钮的停靠位置
            buttonOffset: new AMap.Pixel(10, 20), //定位按钮与设置的停靠位置的偏移量，默认：Pixel(10, 20)
            zoomToAccuracy: true, //定位成功后是否自动调整地图视野到定位点

        });
        map.addControl(geolocation);
        geolocation.getCurrentPosition(function(status, result) {
            if (status === 'complete') {
                log.success('获取货车定位成功');
                onComplete(result)
            } else {
                log.success('获取货车规划数据失败：'+result);
                onError(result)
            }
        });
    });
    //解析定位结果
    function onComplete(data) {
        document.getElementById('status').innerHTML = '定位成功';
        var str = [];
        str.push('定位结果：' + data.position);
        str.push('定位类别：' + data.location_type);
        if (data.accuracy) {
            str.push('精度：' + data.accuracy + ' 米');
        } //如为IP精确定位结果则没有精度信息
        str.push('是否经过偏移：' + (data.isConverted ? '是' : '否'));
        document.getElementById('result').innerHTML = str.join('<br>');
    }
    //解析定位错误信息
    function onError(data) {
        document.getElementById('status').innerHTML = '定位失败';
        document.getElementById('result').innerHTML = '失败原因排查信息:' + data.message;
    }
</script>
</body>
</html>

