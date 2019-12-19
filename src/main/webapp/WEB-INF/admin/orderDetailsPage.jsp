<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/17
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="Bookmark" href="${pageContext.request.contextPath}/static/favicon.ico">
    <link rel="Shortcut Icon" href="${pageContext.request.contextPath}/static/favicon.ico"/>
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
    <title>运输单详情页</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i>
    首页 <span class="c-gray en">&gt;
    </span> <span
            class="c-gray en">&gt;</span>运输单详情页
    <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="Hui-iconfont">&#xe68f;</i></a>
</nav>
<div class="page-container">
    <!-- <div class="text-c"> 日期范围：
        <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
        -
        <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
        <input type="text" class="input-text" style="width:250px" placeholder="输入管理员名称" id="" name="">
        <button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
    </div> -->
    <span class="r">订单状态：<c:if test="${transport.transportState==0}"><td class="td-status"><span class="label label-default radius">运输中</span></td></c:if>
                        <c:if test="${transport.transportState==1}">
                            <td class="td-status"><span class="label label-primary radius">签数</span></td>
                        </c:if>
                        <c:if test="${transport.transportState==2}">
                            <td class="td-status"><span class="label label-success radius">待运输</span></td>
                        </c:if>
                        <c:if test="${transport.transportState==3}">
                            <td class="td-status"><span class="label label-danger radius">异常</span></td>
                        </c:if>
    </span>
    <table class="table table-border table-bordered table-hover table-bg">
        <thead>
        <tr>
            <th scope="col" colspan="9">订单号${transport.transportNumber}</th>
        </tr>
        <tr class="text-c">
            <th width="80">发货时间时间</th>
            <th width="100">计划发货时间</th>
            <th width="80">总重量</th>
            <th width="90">订单数量</th>
        </tr>
        </thead>
        <tbody>
        <tr class="text-c">
            <td>${transport.createTime}</td>
            <td>${transport.transportDeliveryTime}</td>
            <td>${transport.transportWeight}</td>
            <td>${goodsOrderList.size()}</td>
        </tr>
        </tbody>
    </table>
    <table class="table table-border table-bordered table-hover table-bg">
        <thead>
        <tr>
            <th scope="col" colspan="9">车辆详情</th>
        </tr>
        <tr class="text-c">
            <th width="100">状态</th>
            <th width="80">车辆</th>
            <th width="100">核载（吨）</th>
            <th width="80">类型</th>
            <th width="90">司机</th>
        </tr>
        </thead>
        <tbody>
        <tr class="text-c">
            <c:if test="${truck.truckStatus==0}">
                <td class="td-status"><span class="label label-default radius">可用</span></td>
            </c:if>
            <c:if test="${truck.truckStatus==1}">
                <td class="td-status"><span class="label label-primary radius">维修</span></td>
            </c:if>
            <c:if test="${truck.truckStatus==2}">
                <td class="td-status"><span class="label label-success radius">运输</span></td>
            </c:if>
            <c:if test="${truck.truckStatus==3}">
                <td class="td-status"><span class="label label-danger radius">报废</span></td>
            </c:if>
            <c:if test="${truck.truckStatus==4}">
                <td class="td-status"><span class="label label-default radius">分配货物</span></td>
            </c:if>
            <td>${truck.truckNumber}</td>
            <td>${truck.carryingCapacity}</td>
            <td>${truck.truckType}</td>
            <c:if test="${truck.driver.driverRealName!=null}">
                <td>${truck.driver.driverRealName}</td>
            </c:if>
            <c:if test="${truck.driver.driverRealName==null}">
                <td>无</td>
            </c:if>
        </tr>
        </tbody>
    </table>

    <div class="cl pd-5 bg-1 bk-gray mt-20"><span class="l">
            <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">
                <i class="Hui-iconfont">&#xe6e2;</i> 批量删除
            </a>
    </span></div>
    <table class="table table-border table-bordered table-bg table-sort">
        <thead>
        <tr>
            <th scope="col" colspan="9">订单详情</th>
        </tr>
        <tr class="text-c">
            <th width="40">序号</th>
            <th width="25"><input type="checkbox" name="" value=""></th>
            <th width="50">状态</th>
            <th width="80">订单号</th>
            <th width="100">托运人</th>
            <th width="130">承运人</th>
            <th width="100">发货时间</th>
            <th width="60">发货人</th>
            <th width="150">发货地址</th>
            <th width="60">收货人</th>
            <th width="130">收货地址</th>
            <%--            <th width="100">操作</th>--%>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${goodsOrderList}" var="order" varStatus="i">
            <tr class="text-c">
                <td>${i.count}</td>
                <td><input type="checkbox" value="${order.orderId}" name=""></td>
                <c:if test="${order.orderStatus==0}">
                    <td class="td-status"><span class="label label-default radius">在库</span></td>
                </c:if>
                <c:if test="${order.orderStatus==1}">
                    <td class="td-status"><span class="label label-primary radius">运输中</span></td>
                </c:if>
                <c:if test="${order.orderStatus==2}">
                    <td class="td-status"><span class="label label-success radius">已签收</span></td>
                </c:if>
                <c:if test="${order.orderStatus==3}">
                    <td class="td-status"><span class="label label-danger radius">异常</span></td>
                </c:if>
                <c:if test="${order.orderStatus==4}">
                    <td class="td-status"><span class="label label-default radius">已分配</span></td>
                </c:if>
                <td>${order.orderNumber}</td>
                <th>${order.orderConsign}</th>
                <th>${order.orderCarrier}</th>
                <th>${order.deliveryTime}</th>
                <td>${order.senderName}</td>
                <td>${order.senderAddress}</td>
                <td>${order.receiveName}</td>
                <td>${order.receiveAddress}</td>
                    <%--                <td class="td-manage">--%>
                    <%--                    <a style="text-decoration:none" onClick="admin_stop(this,'10001')" href="javascript:;" title="手动完结">--%>
                    <%--                    <i class="Hui-iconfont">&#xe631;</i>--%>
                    <%--                    </a>--%>
                    <%--                    <a title="编辑" href="javascript:;" onclick="admin_edit('管理员编辑','admin-add.html','1','800','500')" class="ml-5" style="text-decoration:none">--%>
                    <%--                    <i class="Hui-iconfont">&#xe6df;</i>--%>
                    <%--                    </a>--%>
                    <%--                    <a title="删除" href="javascript:;" onclick="admin_del(this,'1')" class="ml-5" style="text-decoration:none">--%>
                    <%--                    <i class="Hui-iconfont">&#xe6e2;</i></a></td>--%>
            </tr>
        </c:forEach>
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
</div>
<!-- 运输路程  结束 -->
<button class="label-default">订单开始派送</button>


<!--_footer 作为公共模版分离出去-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/static/h-ui.admin/js/H-ui.admin.js"></script>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    /*
        参数解释：
        title	标题
        url		请求的url
        id		需要操作的数据id
        w		弹出层宽度（缺省调默认值）
        h		弹出层高度（缺省调默认值）
    */
    $('.table-sort').dataTable({
        "ordering": false,
        "autoWidth": true,
        "aaSorting": [[0, "asc"]],//默认第几个排序
        // "bStateSave": true,//状态保存
        // "aoColumnDefs": [
        // 	//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
        // 	{"orderable":false,"aTargets":[0,6]}// 制定列不参与排序
        // ]
        language: {
            "sProcessing": "处理中...",
            "sLengthMenu": "显示 _MENU_ 项结果",
            "sZeroRecords": "没有匹配结果",
            "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
            "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
            "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
            "sInfoPostFix": "",
            "sSearch": "搜索:",
            "sUrl": "",
            "sEmptyTable": "表中数据为空",
            "sLoadingRecords": "载入中...",
            "sInfoThousands": ",",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "上页",
                "sNext": "下页",
                "sLast": "末页"
            },
            "oAria": {
                "sSortAscending": ": 以升序排列此列",
                "sSortDescending": ": 以降序排列此列"
            }
        }
    });
    /*管理员-增加*/
    // function admin_add(title,url,w,h){
    //     layer_show(title,url,w,h);
    // }
    /*管理员-删除*/
    // function admin_del(obj,id){
    //     layer.confirm('确认要删除吗？',function(index){
    //         $.ajax({
    //             type: 'POST',
    //             url: '',
    //             dataType: 'json',
    //             success: function(data){
    //                 $(obj).parents("tr").remove();
    //                 layer.msg('已删除!',{icon:1,time:1000});
    //             },
    //             error:function(data) {
    //                 console.log(data.msg);
    //             },
    //         });
    //     });
    // }
    //
    // /*管理员-编辑*/
    // function admin_edit(title,url,id,w,h){
    //     layer_show(title,url,w,h);
    // }
    // /*管理员-停用*/
    // function admin_stop(obj,id){
    //     layer.confirm('确认要停用吗？',function(index){
    //         //此处请求后台程序，下方是成功后的前台处理……
    //
    //         $(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_start(this,id)" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont">&#xe615;</i></a>');
    //         $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">停用</span>');
    //         $(obj).remove();
    //         layer.msg('已停用!',{icon: 5,time:1000});
    //     });
    // }

    /*管理员-启用*/
    // function admin_start(obj,id){
    //     layer.confirm('确认要启用吗？',function(index){
    //         //此处请求后台程序，下方是成功后的前台处理……
    //         $(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,id)" href="javascript:;" title="停用" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
    //         $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
    //         $(obj).remove();
    //         layer.msg('已启用!', {icon: 6,time:1000});
    //     });
    // }
</script>
</body>
</html>