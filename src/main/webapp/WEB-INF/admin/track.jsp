<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/17
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <%--    <meta http-equiv="Cache-Control" content="no-siteapp" />--%>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/html5shiv.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/static/h-ui/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/static/h-ui.admin/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/lib/Hui-iconfont/1.0.8/iconfont.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/static/h-ui.admin/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/static/h-ui.admin/css/style.css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <%--地图资源--%>
    <link rel="stylesheet" href="https://a.amap.com/jsapi_demos/static/demo-center/css/demo-center.css"/>
    <title>在途跟踪</title>
    <style>
        .rount .rount-con ul li {
            float: left;
            text-align: center;
            line-height: 50px;
        }

        .rount .rount-con .city {
            width: 50px;
            height: 50px;
            border-radius: 50%;
            background-color: skyblue;
            float: left;
        }

        #container {
            width: 100%;
            height: 100%;
        }

        .amap-icon img,
        .amap-marker-content img {
            width: 25px;
            height: 34px;
        }

        .marker {
            position: absolute;
            top: -20px;
            right: -118px;
            color: #fff;
            padding: 4px 10px;
            box-shadow: 1px 1px 1px rgba(10, 10, 10, .2);
            white-space: nowrap;
            font-size: 12px;
            font-family: "";
            background-color: #25A5F7;
            border-radius: 3px;
        }

    </style>
</head>
<body onload="addMarker()">

<div class="page-container">
    <!-- <div class="text-c"> 日期范围：
        <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
        -
        <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
        <input type="text" class="input-text" style="width:250px" placeholder="输入关键词" id="" name="">
        <button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜意见</button>
    </div> -->
    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l"><i class="Hui-iconfont">&#xe6c9;</i></span>
        <span class="r"> 订单号：${transport.transportNumber}</span>
    </div>

    <!-- 内容  开始 -->
    <div class="mt-20">
        <table class="  table table-border table-bordered table-hover table-bg table-sort" style="margin-bottom: 20px;">
            <thead>
            <tr class="text-c">
                <th width="100">发货时间</th>
                <th width="60">状态</th>
                <th width="60">始发地</th>
            </tr>
            </thead>
            <tbody>
            <tr class="text-c">
                <td>${transport.transportDeliveryTime}</td>
                <c:if test="${transport.transportState==0}">
                    <td>运输</td>
                </c:if>
                <c:if test="${transport.transportState==1}">
                    <td>已签收</td>
                </c:if>
                <c:if test="${transport.transportState==2}">
                    <td>待运输</td>
                </c:if>
                <c:if test="${transport.transportState==3}">
                    <td>异常</td>
                </c:if>

                <td>${transport.transportOrigin}</td>
            </tr>
            </tbody>
        </table>
        <table class="  table table-border table-bordered table-hover table-bg table-sort"
               style="margin-bottom: 20px; ">
            <thead>
            <tr class="text-c">
                <th width="25">司机</th>
                <th width="60">载具</th>
                <th width="60">车牌</th>
                <th width="100">状态</th>
            </tr>

            </thead>
            <tbody>
            <tr class="text-c">
                <td>${driver.driverRealName}</td>
                <td>${truck.truckType}</td>
                <td>${truck.truckNumber}</td>
                <c:if test="${truck.truckStatus==0}">
                    <td>可用</td>
                </c:if>
                <c:if test="${truck.truckStatus==1}">
                    <td>维修</td>
                </c:if>
                <c:if test="${truck.truckStatus==2}">
                    <td>运输</td>
                </c:if>
                <c:if test="${truck.truckStatus==3}">
                    <td>报废</td>
                </c:if>
                <c:if test="${truck.truckStatus==4}">
                    <td>已分配货物</td>
                </c:if>
            </tr>
            </tbody>
        </table>
        <!-- 运输路程  开始 -->
        <div class="rount">
            <span>运输路程：</span>
            <div class="rount-con" style="width: 800px;height: 50px;">
                <ul>
                    <c:forEach items="${transport.transportRoute}" var="address" varStatus="i">
                        <c:if test="${i.last}">
                            <li>
                                <div class="city">${address}</div>
                            </li>
                        </c:if>
                        <c:if test="${!i.last}">
                            <li>
                                <div class="city">${address}</div>
                                -----------
                            </li>
                        </c:if>
                    </c:forEach>

                </ul>
            </div>
        </div>
        <!-- 运输路程  结束 -->

        <!-- 导航部分  开始-->
        <div class=" mt-20 map" style="height: 700px;">
            <!-- 左半部分  开始 -->
            <div class=" col-3 map-left" style="height: 700px; background-color: #f1f0f0cc; float: left;">
                <span>定位信息</span>
                ${truckLocation.address}
            </div>
            <!-- 左半部分   结束 -->

            <!-- 右半部分  开始 -->
            <div class=" col-9 map-right" style="height: 700px;float: right ;">
                <div id="container"></div>
            </div>
            <!-- 右半部分  结束 -->
        </div>
        <!-- 导航部分  结束 -->
    </div>
</div>


<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/static/h-ui.admin/js/H-ui.admin.js"></script>
<!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/laypage/1.2/laypage.js"></script>
<script src="https://a.amap.com/jsapi_demos/static/demo-center/js/demoutils.js"></script>
<script src="https://webapi.amap.com/maps?v=1.4.15&key=e9c487995fed9106a3c71d79172646f2"></script>
<script type="text/javascript">
    var map = new AMap.Map("container", {
        resizeEnable: true,
        zoom:11, //初始化地图层级
        center: [${truckLocation.longitude},${truckLocation.latitude}] //初始化地图中心点
    });
    function addMarker(){
        marker = new AMap.Marker({
            icon: "//a.amap.com/jsapi_demos/static/demo-center/icons/poi-marker-default.png",
            position: [${truckLocation.longitude},${truckLocation.latitude}],
            offset: new AMap.Pixel(-13, -30)
        });
        marker.setMap(map);
    }


    // $(function(){
    // 	$('.table-sort').dataTable({
    // 		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
    // 		"bStateSave": true,//状态保存
    // 		"aoColumnDefs": [
    // 		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
    // 		  {"orderable":false,"aTargets":[0,2,4]}// 制定列不参与排序
    // 		]
    // 	});

    // });

    /*用户-添加*/
    function member_add(title, url, w, h) {
        layer_show(title, url, w, h);
    }

    /*用户-查看*/
    function member_show(title, url, id, w, h) {
        layer_show(title, url, w, h);
    }

    /*用户-停用*/
    function member_stop(obj, id) {
        layer.confirm('确认要停用吗？', function (index) {
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
            $(obj).remove();
            layer.msg('已停用!', {icon: 5, time: 1000});
        });
    }

    /*用户-启用*/
    function member_start(obj, id) {
        layer.confirm('确认要启用吗？', function (index) {
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
            $(obj).remove();
            layer.msg('已启用!', {icon: 6, time: 1000});
        });
    }

    /*用户-编辑*/
    function member_edit(title, url, id, w, h) {
        layer_show(title, url, w, h);
    }

    /*密码-修改*/
    function change_password(title, url, id, w, h) {
        layer_show(title, url, w, h);
    }

    /*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            $.ajax({
                type: 'POST',
                url: '',
                dataType: 'json',
                success: function (data) {
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!', {icon: 1, time: 1000});
                },
                error: function (data) {
                    console.log(data.msg);
                },
            });
        });
    }
</script>
</body>
</html>