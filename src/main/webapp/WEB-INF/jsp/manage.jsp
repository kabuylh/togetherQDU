<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/css/bootstrap_4.0.0.min.css">
<script src="/js/jquery_1.8.2.min.js"></script>
<div class="container-fluid">
    <div class="alert alert-dark text-center" role="alert">
        <h1>后台管理</h1>
    </div>
    <div class="row">
        <div class="col-12">
            <h2 class="text-center">插入部分</h2>
            <hr>
        </div>
        <div class="col-md-4">
            <form id="insertUser">
                <h3 class="text-center">insertUser</h3>
                <div class="row">
                    <span class="col-5">昵称 (name)</span>
                    <input name="name" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">头像 (picture)</span>
                    <input name="picture" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">签名 (sign)</span>
                    <input name="sign" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">性别 (sex)</span>
                    <select name="sex" class="col form-control">
                        <option value="0" selected>请选择...</option>
                        <option value="1">男</option>
                        <option value="2">女</option>
                    </select>
                </div>
                <div class="row">
                    <span class="col-5">地区 (region)</span>
                    <input name="region" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">电话 (phone)</span>
                    <input name="phone"class="col form-control" type="number">
                </div>
                <div class="row">
                    <span class="col-5">微信 (wechat)</span>
                    <input name="wechat" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">QQ (qq)</span>
                    <input name="qq"class="col form-control" type="number" >
                </div>
                <div class="row">
                    <span class="col-5">所加入群组 (group_list)</span>
                    <input class="col form-control" value="系统自动生成 (空)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">状态 (isdeleted)</span>
                    <input class="col form-control" value="系统自动生成 (0)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">创建日期 (createon)</span>
                    <input class="col form-control" value="系统自动生成" readonly>
                </div>
                <div class="row">
                    <span class="col-5">说明 (remark)</span>
                    <input name="remark" class="col form-control">
                </div>
            </form>
            <button onclick="insertUser()" class="btn btn-primary" style="float: right">插入</button>
        </div>
        <div class="col-md-4">
            <form id="insertGroup">
                <h3 class="text-center">insertGroup</h3>
                <div class="row">
                    <span class="col-5">群名称 (name)</span>
                    <input name="name" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">群头像 (picture)</span>
                    <input name="picture" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">群签名 (sign)</span>
                    <input name="sign" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">周积分 (score_week)</span>
                    <input class="col form-control" value="系统自动生成 (0)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">月积分 (score_month)</span>
                    <input class="col form-control" value="系统自动生成 (0)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">总积分 (score_total)</span>
                    <input class="col form-control" value="系统自动生成 (0)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">群人数 (size)</span>
                    <input class="col form-control" value="系统自动生成 (0)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">成员列表 (member_list)</span>
                    <input class="col form-control" value="系统自动生成 (空)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">状态 (isdeleted)</span>
                    <input class="col form-control" value="系统自动生成 (0)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">创建日期 (createon)</span>
                    <input class="col form-control" value="系统自动生成" readonly>
                </div>
                <div class="row">
                    <span class="col-5">说明 (remark)</span>
                    <input name="remark" class="col form-control">
                </div>
            </form>
            <button onclick="insertGroup()" class="btn btn-primary" style="float: right">插入</button>
        </div>
        <div class="col-md-4">
            <form id="insertCheckin">
                <h3 class="text-center">insertCheckin</h3>
                <div class="row">
                    <span class="col-5">归属群组 (belong)</span>
                    <input name="belong" class="col form-control" type="number">
                </div>
                <div class="row">
                    <span class="col-5">点赞数 (star)</span>
                    <input class="col form-control" value="系统自动生成 (0)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">位置 (location)</span>
                    <input name="location" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">内容 (content)</span>
                    <input name="content" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">照片列表 (picture_list)</span>
                    <input name="picture_list" class="col form-control">
                </div>
                <div class="row">
                    <span class="col-5">评论列表 (comment_list)</span>
                    <input class="col form-control" value="系统自动生成 (空)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">状态 (isdeleted)</span>
                    <input class="col form-control" value="系统自动生成 (0)" readonly>
                </div>
                <div class="row">
                    <span class="col-5">创建日期 (createon)</span>
                    <input class="col form-control" value="系统自动生成" readonly>
                </div>
                <div class="row">
                    <span class="col-5">说明 (remark)</span>
                    <input class="col form-control" value="系统自动生成 (空)" readonly>
                </div>
            </form>
            <button onclick="insertCheckin()" class="btn btn-primary" style="float: right">插入</button>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-12">
            <h2 class="text-center">删除部分</h2>
            <hr>
        </div>
        <div class="col-md-4">
            <form id="deleteUser">
                <h3 class="text-center">deleteUser</h3>
                <div class="row">
                    <span class="col-5">用户编号 (uid)</span>
                    <input name="uid" class="col form-control" type="number">
                </div>
            </form>
            <button onclick="deleteUser()" class="btn btn-primary" style="float: right">删除</button>
        </div>
        <div class="col-md-4">
            <form id="deleteGroup">
                <h3 class="text-center">deleteGroup</h3>
                <div class="row">
                    <span class="col-5">群组编号 (gid)</span>
                    <input name="gid" class="col form-control" type="number">
                </div>
            </form>
            <button onclick="deleteGroup()" class="btn btn-primary" style="float: right">删除</button>
        </div>
        <div class="col-md-4">
            <form id="deleteCheckin">
                <h3 class="text-center">deleteCheckin</h3>
                <div class="row">
                    <span class="col-5">打卡编号 (cid)</span>
                    <input name="cid" class="col form-control" type="number">
                </div>
            </form>
            <button onclick="deleteCheckin()" class="btn btn-primary" style="float: right">删除</button>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-12">
            <h2 class="text-center">修改部分</h2>
            <hr>
        </div>
        <div class="col-md-4">
        </div>
        <div class="col-md-4">
        </div>
        <div class="col-md-4">
        </div>
    </div>
</div>
<script>
    // insert
    function insertUser() {
        $.ajax({
            url: "./manage/insertUser",
            type: "GET",
            data: $('#insertUser').serialize(),
            success: function(message) {
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
    function insertGroup() {
        $.ajax({
            url: "./manage/insertGroup",
            type: "GET",
            data: $('#insertGroup').serialize(),
            success: function(message) {
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
    function insertCheckin() {
        $.ajax({
            url: "./manage/insertCheckin",
            type: "GET",
            data: $('#insertCheckin').serialize(),
            success: function(message) {
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }

    // delete
    function deleteUser() {
        $.ajax({
            url: "./manage/deleteUser",
            type: "GET",
            data: $('#deleteUser').serialize(),
            success: function(message) {
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
    function deleteGroup() {
        $.ajax({
            url: "./manage/deleteGroup",
            type: "GET",
            data: $('#deleteGroup').serialize(),
            success: function(message) {
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
    function deleteCheckin() {
        $.ajax({
            url: "./manage/deleteCheckin",
            type: "GET",
            data: $('#deleteCheckin').serialize(),
            success: function(message) {
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }

    // update
    function updateUser() {
        $.ajax({
            url: "./manage/updateUser",
            type: "GET",
            data: $('#updateUser').serialize(),
            success: function(message) {
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
    function updateGroup() {
        $.ajax({
            url: "./manage/updateGroup",
            type: "GET",
            data: $('#updateGroup').serialize(),
            success: function(message) {
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
    function updateCheckin() {
        $.ajax({
            url: "./manage/updateCheckin",
            type: "GET",
            data: $('#updateCheckin').serialize(),
            success: function(message) {
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
</script>
