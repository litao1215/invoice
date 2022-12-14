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
    <style>
        .star::before {
            content: '*';
            color: #F56C6C;
            margin-right: 0.020833rem;
        }

        .am-form-horizontal .am-radio {
            padding-top: 3px;
        }

        .am-ucheck-icons {
            line-height: 28px;
        }
    </style>
</head>
<body data-type="generalComponents">
<header class="am-topbar am-topbar-inverse admin-header">
    <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list tpl-header-list">
            <li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
                <a class="am-dropdown-toggle tpl-header-list-link" href="javascript:;">
                    <span class="tpl-header-list-user-nick" name="name"></span>
                    <span class="tpl-header-list-user-ico">
              <img src="assets/img/user01.png">
            </span>
                </a>
                <ul class="am-dropdown-content">
                    <li>
                        <a href="login.jsp">
                            <span class="am-icon-power-off"></span> 退出</a>
                    </li>
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
                            <a href="invoice-list.jsp">
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
            发票开具
        </div>
        <div class="tpl-portlet-components" id="baseinfoDiv">
            <div class="portlet-title">
                <div class="caption font-green bold">
                    选择开票相关订单
                </div>
                <div class="tpl-portlet-input tpl-fz-ml">
                    <div class="portlet-input input-small input-inline">
                        <div class="input-icon right">
                        </div>
                    </div>
                </div>
            </div>
            <div class="tpl-block">
                <div class="am-g">
                    <div class="am-u-sm-6 am-u-md-3">
                        <div class="am-input-group am-input-group-sm">
                <span class="am-input-group-btn">
                  <span style="font-size: 14px;margin-right: 8px;margin-left: 8px">订单编号</span>
                </span>
                            <input type="text" class="am-form-field" placeholder="&nbsp;&nbsp;请输入订单编号"
                                   style="border: 1px solid #c2cad8;width: 68%;border-radius: 3px;">
                        </div>
                    </div>
                    <div class="am-u-sm-6 am-u-md-3">
                        <div class="am-input-group am-input-group-sm">
                <span class="am-input-group-btn">
                  <span style="font-size: 14px;margin-right: 8px;margin-left: 8px;">生成日期</span>
                </span>
                            <input type="text" class="am-form-field" data-am-datepicker placeholder="&nbsp;&nbsp;请选择日期"
                                   style="border: 1px solid #c2cad8;width: 68%;border-radius: 3px;">
                        </div>
                    </div>
                    <div class="am-u-sm-6 am-u-md-3">
                        <div class="am-input-group am-input-group-sm">
                <span class="am-input-group-btn">
                  <span style="font-size: 14px;margin-right: 8px;margin-left: 8px">凭证金额</span>
                </span>
                            <input type="text" class="am-form-field" placeholder="&nbsp;&nbsp;最低金额(万)"
                                   style="border: 1px solid #c2cad8;width: 32%;border-radius: 3px;">
                            <div class="am-form-field"
                                 style="width: 0%; border-radius: 3px;border: none;margin-left: 10px;">~
                            </div>
                            <input type="text" class="am-form-field" placeholder="&nbsp;&nbsp;最高金额(万)"
                                   style="border: 1px solid #c2cad8;width: 32%;border-radius: 3px;margin-left: 20px;">
                        </div>
                    </div>
                    <div class="am-u-sm-6 am-u-md-3">
                    </div>
                </div>
            </div>
            <div class="am-g">
                <div class="am-u-sm-12">
                    <form class="am-form">
                        <table class="am-table am-table-striped am-table-hover table-main">
                            <thead>
                            <tr>
                                </th>
                                <th class="table-check">
                                    <input type="checkbox" class="tpl-table-fz-check">
                                </th>
                                <th class="table-title">订单编号</th>

                                <th class="table-author am-hide-sm-only">订单金额（元）</th>
                                <th class="table-date am-hide-sm-only">生成时间</th>
                            </tr>
                            </thead>
                            <tbody id="doc-modal-list1">
                            <tr data-id="2">
                                <td>
                                    <input type="checkbox">
                                </td>
                                <td class="am-hide-sm-only">D20220328000001</td>
                                <td class="am-hide-sm-only">1,000,000.00</td>
                                <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                            </tr>
                            <tr data-id="2">
                                <td>
                                    <input type="checkbox">
                                </td>
                                <td class="am-hide-sm-only">D20220328000002</td>
                                <td class="am-hide-sm-only">1,000,000.00</td>
                                <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                            </tr>
                            <tr data-id="2">
                                <td>
                                    <input type="checkbox">
                                </td>
                                <td class="am-hide-sm-only">D20220328000003</td>
                                <td class="am-hide-sm-only">1,000,000.00</td>
                                <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                            </tr>
                            <tr data-id="2">
                                <td>
                                    <input type="checkbox">
                                </td>
                                <td class="am-hide-sm-only">D20220328000004</td>
                                <td class="am-hide-sm-only">1,000,000.00</td>
                                <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                            </tr>
                            <tr data-id="2">
                                <td>
                                    <input type="checkbox">
                                </td>
                                <td class="am-hide-sm-only">D20220328000005</td>
                                <td class="am-hide-sm-only">1,000,000.00</td>
                                <td class="am-hide-sm-only">2021-12-31 12：12：12</td>
                            </tr>
                            </tbody>
                        </table>
                        <div class="am-cf">
                            <div class="am-fr">
                                <ul class="am-pagination tpl-pagination">
                                    <li class="am-disabled">
                                        <a href="#">«</a>
                                    </li>
                                    <li class="am-active">
                                        <a href="#">1</a>
                                    </li>
                                    <li>
                                        <a href="#">2</a>
                                    </li>
                                    <li>
                                        <a href="#">3</a>
                                    </li>
                                    <li>
                                        <a href="#">4</a>
                                    </li>
                                    <li>
                                        <a href="#">5</a>
                                    </li>
                                    <li>
                                        <a href="#">»</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <hr>
                    </form>
                </div>
            </div>
        </div>
        <div class="tpl-portlet-components" id="showDiv">
            <!-- 表单填写页面 -->
            <div class="tpl-block">
                <div class="">
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
                        <div class="am-g tpl-amazeui-form">
                            <div class="am-u-sm-12 am-u-md-6">
                                <form class="am-form am-form-horizontal">
                                    <div class="am-form-group">
                                        <%--@declare id="user-name"--%><label for="user-name" class="am-u-sm-3 am-form-label star"> 发票种类</label>
                                        <div class="am-u-sm-3" style="margin-top: 4px;font-size: 16px;"
                                             onclick="selectCategory('ordinary')">
                                            <label class="am-radio">
                                                <input type="radio" name="radio1" value="" data-am-ucheck checked>
                                                普通增值税发票
                                            </label>
                                        </div>
                                        <div class="am-u-sm-6" style="margin-top: 4px;font-size: 16px;"
                                             onclick="selectCategory('appropriative')">
                                            <label class="am-radio">
                                                <input type="radio" name="radio1" value="" data-am-ucheck> 增值税专用发票
                                            </label>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="am-u-sm-12 am-u-md-6">
                                <form class="am-form am-form-horizontal">
                                    <div class="am-form-group">
                                        <label for="user-name" class="am-u-sm-3 am-form-label star"> 发票类型</label>
                                        <div class="am-u-sm-3" style="margin-top: 4px;font-size: 16px;"
                                             onclick="selectType('ele')">
                                            <label class="am-radio">
                                                <input type="radio" name="radio1" value="" data-am-ucheck checked> 电子发票
                                            </label>
                                        </div>
                                        <div class="am-u-sm-6" style="margin-top: 4px;font-size: 16px;"
                                             onclick="selectType('paper')">
                                            <label class="am-radio">
                                                <input type="radio" name="radio1" value="" data-am-ucheck> 纸质发票
                                            </label>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <hr>
                        <div>
                            <div id='invoice_ordinary_title' class="am-g tpl-amazeui-form">
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label star"> 抬头</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                百度科技有限公司
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label">税号</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                91110000802100XXXX
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div id='invoice_appropriative_title' class="am-g tpl-amazeui-form" hidden>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label star"> 抬头</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                百度科技有限公司
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label">税号</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                91110000802100XXXX
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label star"> 开户银行</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                中国工商银行
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label">开户账号</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                2134566876756453
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label star"> 注册固定电话</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                13888888888
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label">注册场所地址</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                南京市建邺区
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <hr>
                            <div id='invoice_ele_addr' class="am-g tpl-amazeui-form">
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label star"> 邮箱</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                123456789@qq.com
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label"></label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                <span id="selectEmail" style="color: #23abf0;cursor: pointer;">选择</span>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div id='invoice_paper_addr'  class="am-g tpl-amazeui-form" hidden>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label star"> 邮寄地址</label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                江苏省南京市建邺区庐山路88号金融城2期
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="am-u-sm-12 am-u-md-6">
                                    <form class="am-form am-form-horizontal">
                                        <div class="am-form-group">
                                            <label for="user-name" class="am-u-sm-3 am-form-label"></label>
                                            <div class="am-u-sm-9" style="margin-top: 4px;font-size: 16px;">
                                                <span id="selectAddress"
                                                      style="color: #23abf0;cursor: pointer;">选择</span>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div style="text-align: center;margin-top:40px">
                <a class="am-btn am-btn-default" href="invoice-list.jsp">取&nbsp;&nbsp;&nbsp;&nbsp; 消
                </a>
                <a id="submitBtn" class="am-btn am-btn-primary" style="margin-left:20px">提&nbsp;&nbsp;&nbsp;&nbsp; 交
                </a>
            </div>
        </div>
        <div class="tpl-portlet-components" id="resultDiv">
            <!-- 提交成功页面 -->
            <div class="tpl-block ">
                <div class="am-g tpl-amazeui-form">

                    <div class="am-u-sm-12 am-u-md-12">
                        <form class="am-form am-form-horizontal">
                            <div class="am-form-group">
                                <div class="am-u-sm-12" style="margin-top: 4px;text-align: center;margin-bottom: 20px;">
                                    <img src="assets/img/u105.png" alt="" style="width: 120px;">
                                </div>
                                <div class="am-u-sm-12"
                                     style="margin-top: 4px;font-size: 20px;text-align: center;font-weight: bold;margin-bottom: 20px;">
                                    提交申请成功
                                </div>
                                <div class="am-u-sm-12" style="color: #999;font-size:14px;text-align: center;">
                                    已通知审核人员尽快审核，最终结果将以站内信的方式告知您。
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div style="text-align: center;margin-top:40px">
                    <a class="am-btn am-btn-primary" href="invoice-list.jsp">返回列表</a>
                </div>
            </div>
        </div>
        <!-- 选择邮箱弹出框 -->
        <div class="am-modal am-modal-prompt" tabindex="-1" id="my-email">
            <div class="am-modal-dialog">
                <form class="am-form">
                    <legend style="font-size: 18px;padding: 12px 0;">选择邮箱</legend>
                    <table class="am-table am-table-striped am-table-hover table-main">
                        <thead>
                        <tr>
                            <th class="table-check"></th>
                            <th class="table-title" style="text-align: center;">邮箱</th>
                        </tr>
                        </thead>
                        <tbody id="doc-modal-list2">
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">3456789876@qq.com</td>
                        </tr>
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">3456789876@qq.com</td>
                        </tr>
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">3456789876@qq.com</td>
                        </tr>
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck checked>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">3456789876@qq.com</td>
                        </tr>
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">3456789876@qq.com</td>
                        </tr>
                        </tbody>
                    </table>
                </form>
                <div class="am-modal-footer" style="border-top: 1px solid #dedede;">
                    <span class="am-modal-btn" data-am-modal-cancel>取消</span>
                    <span class="am-modal-btn" data-am-modal-confirm>确定</span>
                </div>
            </div>
        </div>
        <!-- 邮寄地址弹出框 -->
        <div class="am-modal am-modal-prompt" tabindex="-1" id="my-address">
            <div class="am-modal-dialog">
                <form class="am-form">
                    <legend style="font-size: 18px;padding: 12px 0;">选择邮寄地址</legend>
                    <table class="am-table am-table-striped am-table-hover table-main">
                        <thead>
                        <tr>
                            <th class="table-check"></th>
                            <th class="table-title" style="text-align: center;">地址信息</th>
                        </tr>
                        </thead>
                        <tbody id="doc-modal-list3">
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck checked>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">南京市建邺区河西大街99号</td>
                        </tr>
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">南京市建邺区河西大街99号</td>
                        </tr>
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">南京市建邺区河西大街99号</td>
                        </tr>
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">南京市建邺区河西大街99号</td>
                        </tr>
                        <tr data-id="2">
                            <td>
                                <label class="am-radio">
                                    <input type="radio" name="radio1" value="" data-am-ucheck>
                                </label>
                            </td>
                            <td class="am-hide-sm-only">南京市建邺区河西大街99号</td>
                        </tr>
                        </tbody>
                    </table>
                </form>
                <div class="am-modal-footer" style="border-top: 1px solid #dedede;">
                    <span class="am-modal-btn" data-am-modal-cancel>取消</span>
                    <span class="am-modal-btn" data-am-modal-confirm>确定</span>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="assets/js/jquery.min.js">
</script>
<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/app.js"></script>
<script>
    var baseinfoDiv = document.getElementById('baseinfoDiv')
    var showDiv = document.getElementById('showDiv')
    var resultDiv = document.getElementById('resultDiv')
    resultDiv.style.display = 'none';

    //用户名
    var name = "${u.name}";
    $("[name=name]").text(name);

    // 提交按钮
    $(function () {
        $('#submitBtn').on('click', function () {
            baseinfoDiv.style.display = 'none';
            showDiv.style.display = 'none';
            resultDiv.style.display = 'block';
        });
    });
    // 邮寄地址选择按钮
    $(function () {
        $('#selectAddress').on('click', function () {
            $('#my-address').modal(
                {
                    relatedTarget: this,
                    onCancel: function (e) {
                    }
                });
        });
    });
    // 邮箱选择按钮
    $(function () {
        $('#selectEmail').on('click', function () {
            $('#my-email').modal(
                {
                    relatedTarget: this,
                    onCancel: function (e) {
                    }
                });
        });
    });

    // 发票类型切换
    function selectType(val) {
        if (val === 'ele') {
            $('#invoice_ele_addr').show();
            $('#invoice_paper_addr').hide();
        }else if (val === 'paper') {
            $('#invoice_ele_addr').hide();
            $('#invoice_paper_addr').show();
        }
    }
    function selectCategory(val) {
        if (val === 'ordinary') {
            $('#invoice_ordinary_title').show();
            $('#invoice_appropriative_title').hide();
        }else if (val === 'appropriative') {
            $('#invoice_ordinary_title').hide();
            $('#invoice_appropriative_title').show();
        }
    }
</script>
</body>

</html>