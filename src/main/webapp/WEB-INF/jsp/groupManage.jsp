<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/js/jquery-3.4.1.js"></script>
<h1 style="text-align:center">群组管理</h1>
<a href="/manage">返回</a>
<hr />
<form id="insert">
    <h3>新增用户</h3>
    <input value="系统自动生成" readonly>：群组编号（gid）<br />
    <input name="name">：群名称（name）<br />
    <input name="sign">：群签名（sign）<br />
    <input value="系统自动生成：0" readonly>：群积分（score）<br />
</form>
<button id="insertBtn" onclick="insert()">新增</button>
<hr />
<form id="delete">
    <h3>删除群组</h3>
    <input name="gid">：群组编号（gid）<br />
</form>
<button id="deleteBtn" onclick="deleteItem()">删除</button>
<hr />
<form id="update">
    <h3>修改群组</h3>
    <input id="gid" onblur="query()">：群组编号（gid）- 填写以填充下列信息<br />
    <input id="name" name="name">：群名称（name）<br />
    <input id="sign" name="sign">：群签名（sign）<br />
    <input id="score" name="score">：群积分（score）<br />
</form>
<button id="updateBtn" onclick="update()">修改</button>
<script>
    function insert() {
        $.ajax({
            url: "/manage/group/insert",
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
            url: "/manage/group/delete",
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
            url: "/manage/group/update",
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
        $.get("/manage/group/query", {
            "gid" : $("#gid").val()
        }, function(response) {
            $("#name").val(response["name"]);
            $("#sign").val(response["sign"]);
            $("#score").val(response["score"]);
        })
    }
</script>
