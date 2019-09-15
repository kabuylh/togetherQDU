<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/js/jquery-3.4.1.js"></script>
<h1 style="text-align:center">用户管理</h1>
<a href="/manage">返回</a>
<hr />
<form id="insert">
    <h3>新增用户</h3>
    <input value="系统自动生成" readonly>：用户编号（uid）<br />
    <input name="name">：昵称（name）<br />
    <input name="sign">：个签（sign）<br />
    <select name="sex">
        <option value="" selected></option>
        <option value="1">男</option>
        <option value="0">女</option>
    </select>：性别（sex）<br />
    <input name="region">：地区（region）<br />
    <input name="phone">：手机（phone）<br />
    <input name="wechat">：微信（wechat）<br />
    <input name="qq">：QQ（qq）<br />
</form>
<button id="insertBtn" onclick="insert()">新增</button>
<hr />
<form id="delete">
    <h3>删除用户</h3>
    <input name="uid">：用户编号（uid）<br />
</form>
<button id="deleteBtn" onclick="deleteItem()">删除</button>
<hr />
<form id="update">
    <h3>修改用户</h3>
    <input id="uid" onblur="query()">：用户编号（uid）- 填写以填充下列信息<br />
    <input id="name" name="name">：昵称（name）<br />
    <input id="sign" name="sign">：个签（sign）<br />
    <select id="sex" name="sex">
        <option value="" selected></option>
        <option value="1">男</option>
        <option value="0">女</option>
    </select>：性别（sex）<br />
    <input id="region" name="region">：地区（region）<br />
    <input id="phone" name="phone">：手机（phone）<br />
    <input id="wechat" name="wechat">：微信（wechat）<br />
    <input id="qq" name="qq">：QQ（qq）<br />
</form>
<button id="updateBtn" onclick="update()">修改</button>
<script>
    function insert() {
        $.ajax({
            url: "/manage/user/insert",
            data: $("#insert").serialize(),
            success: function(message) {
                if (message == "保存成功") {
                    $("#insertBtn").attr("disabled", true);
                }
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
    function deleteItem() {
        $.ajax({
            url: "/manage/user/delete",
            data: $("#delete").serialize(),
            success: function(message) {
                if (message == "保存成功") {
                    $("#deleteBtn").attr("disabled", true);
                }
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
    function update() {
        $.ajax({
            url: "/manage/user/update",
            data: $("#update").serialize(),
            success: function(message) {
                if (message == "保存成功") {
                    $("#updateBtn").attr("disabled", true);
                }
                alert(message);
            },
            error: function() {
                alert("error");
            }
        });
    }
    function query() {
        $.get("/manage/user/query", {
                "uid" : $("#uid").val()
            }, function(response) {
                $("#name").val(response["name"]);
                $("#sign").val(response["sign"]);
                $("#sex").val(response["sex"]);
                $("#region").val(response["region"]);
                $("#phone").val(response["phone"]);
                $("#wechat").val(response["wechat"]);
                $("#qq").val(response["qq"]);
        })
    }
</script>
