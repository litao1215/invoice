<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>发票管理系统</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="assets/css/admin.css">
    <link rel="stylesheet" href="assets/css/app.css">
</head>
<body data-type="generalComponents">
<header class="am-topbar am-topbar-inverse admin-header">
    <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list tpl-header-list">
            <li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
                <a class="am-dropdown-toggle tpl-header-list-link" href="javascript:;">
                    <span class="tpl-header-list-user-nick" name="name"></span><span class="tpl-header-list-user-ico"> <img
                        src="assets/img/user01.png"></span>
                </a>
                <ul class="am-dropdown-content">
                    <li><a href="login.jsp"><span class="am-icon-power-off"></span> 退出</a></li>
                </ul>
            </li>
        </ul>
    </div>
</header>
<div class="tpl-page-container tpl-page-header-fixed">
    <div class="tpl-left-nav tpl-left-nav-hover">
        <div class="tpl-left-nav-list">
            <ul class="tpl-left-nav-menu">
                <li class="tpl-left-nav-item">
                    <a href="javascript:;" class="nav-link tpl-left-nav-link-list active">
                        <i class="am-icon-table"></i>
                        <span>发票管理</span>
                        <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
                    </a>
                    <ul class="tpl-left-nav-sub-menu" style="display:block">
                        <li>
                            <a href="invoice-list.jsp" class="active">
                                <i class="am-icon-angle-right"></i>
                                <span>发票总览管理</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <div class="tpl-content-wrapper">
        <div class="tpl-content-page-title" style="margin-bottom: 4px;">
            发票详情
        </div>
        <!-- 开票相关订单信息 -->
        <div class="tpl-portlet-components">
            <div class="portlet-title">
                <div class="caption font-green bold">
                    开票相关订单信息
                </div>
                <div class="tpl-portlet-input tpl-fz-ml">
                    <div class="portlet-input input-small input-inline">
                        <div class="input-icon right">
                        </div>
                    </div>
                </div>
            </div>
            <div class="tpl-block ">
                <div class="am-g">
                    <div class="am-u-sm-12">
                        <div><span style="font-size: 16px;margin-left: 7px;">合计开票金额：</span> <span
                                style="color: red;font-size: 22px;font-weight: bold;">10,000,000.00元</span></div>
                        <form class="am-form">
                            <table class="am-table am-table-striped am-table-hover table-main">
                                <thead>
                                <tr>
                                    <th class="table-title">订单编号</th>
                                    <th class="table-author am-hide-sm-only">相关企业</th>
                                    <th class="table-author am-hide-sm-only">订单金额（元）</th>
                                    <th class="table-date am-hide-sm-only">生成时间</th>
                                </tr>
                                </thead>
                                <tbody id="doc-modal-list">
                                <tr data-id="2">
                                    <td class="am-hide-sm-only">D20220328000001</td>
                                    <td class="am-hide-sm-only">百度科技有限公司</td>
                                    <td class="am-hide-sm-only">1,000,000.00</td>
                                    <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                                </tr>
                                <tr data-id="2">
                                    <td class="am-hide-sm-only">D20220328000002</td>
                                    <td class="am-hide-sm-only">百度科技有限公司</td>
                                    <td class="am-hide-sm-only">1,000,000.00</td>
                                    <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                                </tr>
                                <tr data-id="2">
                                    <td class="am-hide-sm-only">D20220328000003</td>
                                    <td class="am-hide-sm-only">百度科技有限公司</td>
                                    <td class="am-hide-sm-only">1,000,000.00</td>
                                    <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                                </tr>
                                <tr data-id="2">
                                    <td class="am-hide-sm-only">D20220328000004</td>
                                    <td class="am-hide-sm-only">百度科技有限公司</td>
                                    <td class="am-hide-sm-only">1,000,000.00</td>
                                    <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                                </tr>
                                <tr data-id="2">
                                    <td class="am-hide-sm-only">D20220328000005</td>
                                    <td class="am-hide-sm-only">百度科技有限公司</td>
                                    <td class="am-hide-sm-only">1,000,000.00</td>
                                    <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                                </tr>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--抬头信息 -->
        <div class="tpl-portlet-components">
            <div class="portlet-title">
                <div class="caption font-green bold">
                    抬头信息
                </div>
                <div class="tpl-portlet-input tpl-fz-ml">
                    <div class="portlet-input input-small input-inline">
                        <div class="input-icon right">
                        </div>
                    </div>
                </div>
            </div>
            <div class="tpl-block ">
                <div class="am-g tpl-amazeui-form" style="padding:0">
                    <div class="am-u-sm-12 am-u-md-6">
                        <form class="am-form am-form-horizontal">
                            <div class="am-form-group">
                                <%--@declare id="user-name"--%><label for="user-name" class="am-u-sm-3 am-form-label">发票种类</label>
                                <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                    普通增值税发票
                                </div>
                            </div>
                        </form>
                        <hr>
                    </div>
                    <div class="am-u-sm-12 am-u-md-6" style="padding:0">
                        <form class="am-form am-form-horizontal">
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">发票类型</label>
                                <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                    电子发票
                                </div>
                            </div>
                        </form>
                        <hr>
                    </div>
                    <div class="am-u-sm-12 am-u-md-6" style="padding:0">
                        <form class="am-form am-form-horizontal">
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">抬头</label>
                                <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                    百度科技有限公司
                                </div>
                            </div>
                        </form>
                        <hr>
                    </div>
                    <div class="am-u-sm-12 am-u-md-6" style="padding:0">
                        <form class="am-form am-form-horizontal">
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">税号</label>
                                <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                    91110000802100XXXX
                                </div>
                            </div>
                        </form>
                        <hr>
                    </div>
                    <div class="am-u-sm-12 am-u-md-6">
                        <form class="am-form am-form-horizontal">
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">邮箱</label>
                                <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                    123456789@qq.com
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="am-u-sm-12 am-u-md-6">
                    </div>
                </div>
                <div style="text-align: center;margin-top:40px">
                    <a class="am-btn am-btn-default" href="invoice-list.jsp">返 回</a>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/app.js"></script>
<script>
    //用户名
    var name = "${u.name}";
    $("[name=name]").text(name);
</script>
</body>

</html>