<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/17
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
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
    <title>运输订单</title>
    <!-- <link rel="stylesheet" href="../lib/zTree/v3/css/zTreeStyle/zTreeStyle.css" type="text/css"> -->
</head>
<!-- <body class="pos-r">
<div class="pos-a" style="width:200px;left:0;top:0; bottom:0; height:100%; border-right:1px solid #e5e5e5; background-color:#f5f5f5; overflow:auto;">
	<ul id="treeDemo" class="ztree"></ul>
</div> -->
<div>
    <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> <span
            class="c-gray en">&gt;</span> 订单派送 <a class="btn btn-success radius r"
                                                  style="line-height:1.6em;margin-top:3px"
                                                  href="javascript:location.replace(location.href);" title="刷新"><i
            class="Hui-iconfont">&#xe68f;</i></a></nav>
    <div class="page-container">
        <%--        <div class="text-c"> 日期范围：--%>
        <%--            <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}' })" id="logmin" class="input-text Wdate" style="width:120px;">--%>
        <%--            ---%>
        <%--            <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d' })" id="logmax" class="input-text Wdate" style="width:120px;">--%>
        <%--            <input type="text" name="" id="" placeholder=" 产品名称" style="width:250px" class="input-text">--%>
        <%--            <button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜产品</button>--%>
        <%--        </div>--%>
        <div class="cl pd-5 bg-1 bk-gray mt-20"><span class="l">
            <a href="javascript:;" onclick="datadel()"
               class="btn btn-danger radius">
                <i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
<%--            <a class="btn btn-primary radius" onclick="product_add('添加产品','product-add.html')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加产品</a></span>--%>
<%--            <span class="r">共有数据：<strong>54</strong> 条</span>--%>
        </div>
        <div class="mt-20">
            <table class="table table-border table-bordered table-bg table-hover table-sort">
                <thead>
                <tr class="text-c">
                    <th width="40">序号</th>
                    <th width="40"><input name="" type="checkbox" value=""></th>
                    <th width="60">发布状态</th>
                    <th width="60">运输单号</th>
                    <th width="80">发货时间</th>
                    <th width="100">起点</th>
                    <th width="100">终点</th>
                    <th width="100">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${transports}" var="transport" varStatus="i">
                    <tr class="text-c va-m">
                        <td>${i.count}</td>
                        <td><input name="" type="checkbox" value="${transport.transportId}"></td>
                        <c:if test="${transport.transportState==0}">
                            <td class="td-status"><span class="label label-default radius">运输中</span></td>
                        </c:if>
                        <c:if test="${transport.transportState==1}">
                            <td class="td-status"><span class="label label-primary radius">签数</span></td>
                        </c:if>
                        <c:if test="${transport.transportState==2}">
                            <td class="td-status"><span class="label label-success radius">待运输</span></td>
                        </c:if>
                        <c:if test="${transport.transportState==3}">
                            <td class="td-status"><span class="label label-danger radius">异常</span></td>
                        </c:if>
                        <td>${transport.transportNumber}</td>
                        <th>${transport.transportDeliveryTime}</th>
                        <td>${transport.transportOrigin}</td>
                        <td>${transport.transportEnd}</td>
                        <td class="td-manage">
                            <a style="text-decoration:none" class="ml-5" href="${pageContext.request.contextPath}/getTransportDetailsPage/${transport.transportId}" title="编辑">
                                <i class="Hui-iconfont">&#xe6df;</i>
                            </a>
                            <a href="${pageContext.request.contextPath}/getInRoadTracking/${transport.transportId}" title="在途跟踪">
                                <i class="Hui-iconfont">&#xe6c9;</i>
                            </a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </div>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/static/h-ui.admin/js/H-ui.admin.js"></script>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    // var setting = {
    //     view: {
    //         dblClickExpand: false,
    //         showLine: false,
    //         selectedMulti: false
    //     },
    //     data: {
    //         simpleData: {
    //             enable: true,
    //             idKey: "id",
    //             pIdKey: "pId",
    //             rootPId: ""
    //         }
    //     },
    //     callback: {
    //         beforeClick: function (treeId, treeNode) {
    //             var zTree = $.fn.zTree.getZTreeObj("tree");
    //             if (treeNode.isParent) {
    //                 zTree.expandNode(treeNode);
    //                 return false;
    //             } else {
    //                 //demoIframe.attr("src",treeNode.file + ".html");
    //                 return true;
    //             }
    //         }
    //     }
    // };
    //
    // var zNodes = [
    //     {id: 1, pId: 0, name: "一级分类", open: true},
    //     {id: 11, pId: 1, name: "二级分类"},
    //     {id: 111, pId: 11, name: "三级分类"},
    //     {id: 112, pId: 11, name: "三级分类"},
    //     {id: 113, pId: 11, name: "三级分类"},
    //     {id: 114, pId: 11, name: "三级分类"},
    //     {id: 115, pId: 11, name: "三级分类"},
    //     {id: 12, pId: 1, name: "二级分类 1-2"},
    //     {id: 121, pId: 12, name: "三级分类 1-2-1"},
    //     {id: 122, pId: 12, name: "三级分类 1-2-2"},
    // ];
    //
    //
    // $(document).ready(function () {
    //     var t = $("#treeDemo");
    //     t = $.fn.zTree.init(t, setting, zNodes);
    //     //demoIframe = $("#testIframe");
    //     //demoIframe.on("load", loadReady);
    //     var zTree = $.fn.zTree.getZTreeObj("tree");
    //     //zTree.selectNode(zTree.getNodeByParam("id",'11'));
    // });

    $('.table-sort').dataTable({
        "aaSorting": [[1, "desc"]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            {"orderable": false, "aTargets": [0, 7]}// 制定列不参与排序
        ],
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

    /*产品-添加*/
    // function product_add(title, url) {
    //     var index = layer.open({
    //         type: 2,
    //         title: title,
    //         content: url
    //     });
    //     layer.full(index);
    // }

    /*产品-查看*/
    // function product_show(title, url, id) {
    //     var index = layer.open({
    //         type: 2,
    //         title: title,
    //         content: url
    //     });
    //     layer.full(index);
    // }

    /*产品-审核*/
    // function product_shenhe(obj, id) {
    //     layer.confirm('审核文章？', {
    //             btn: ['通过', '不通过'],
    //             shade: false
    //         },
    //         function () {
    //             $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="product_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
    //             $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
    //             $(obj).remove();
    //             layer.msg('已发布', {icon: 6, time: 1000});
    //         },
    //         function () {
    //             $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="product_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
    //             $(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
    //             $(obj).remove();
    //             layer.msg('未通过', {icon: 5, time: 1000});
    //         });
    // }
    //
    // /*产品-下架*/
    // function product_stop(obj, id) {
    //     layer.confirm('确认要下架吗？', function (index) {
    //         $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
    //         $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
    //         $(obj).remove();
    //         layer.msg('已下架!', {icon: 5, time: 1000});
    //     });
    // }
    //
    // /*产品-发布*/
    // function product_start(obj, id) {
    //     layer.confirm('确认要发布吗？', function (index) {
    //         $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
    //         $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
    //         $(obj).remove();
    //         layer.msg('已发布!', {icon: 6, time: 1000});
    //     });
    // }
    //
    // /*产品-申请上线*/
    // function product_shenqing(obj, id) {
    //     $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
    //     $(obj).parents("tr").find(".td-manage").html("");
    //     layer.msg('已提交申请，耐心等待审核!', {icon: 1, time: 2000});
    // }
    //
    // /*产品-编辑*/
    // function product_edit(title, url, id) {
    //     var index = layer.open({
    //         type: 2,
    //         title: title,
    //         content: url
    //     });
    //     layer.full(index);
    // }
    //
    // /*产品-删除*/
    // function product_del(obj, id) {
    //     layer.confirm('确认要删除吗？', function (index) {
    //         $.ajax({
    //             type: 'POST',
    //             url: '',
    //             dataType: 'json',
    //             success: function (data) {
    //                 $(obj).parents("tr").remove();
    //                 layer.msg('已删除!', {icon: 1, time: 1000});
    //             },
    //             error: function (data) {
    //                 console.log(data.msg);
    //             },
    //         });
    //     });
    // }
</script>
</body>
</html>