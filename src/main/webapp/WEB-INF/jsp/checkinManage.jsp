<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/js/jquery-3.4.1.js"></script>
<h1 style="text-align:center">打卡管理</h1>
<a href="/manage">返回</a>
<hr />
<form id="insert">
    <h3>新增打卡</h3>
    <input value="系统自动生成" readonly>：打卡编号（cid）<br />
    <textarea name="content" rows="4"></textarea>：内容（content）<br />
    <input name="location">：位置（location）<br />
    <input value="系统自动生成：0" readonly>：点赞数（star）<br />
    <input value="系统自动生成" readonly>：发布时间（time）<br />
</form>
<button id="insertBtn" onclick="insert()">新增</button>
<hr />
<form id="delete">
    <h3>删除打卡</h3>
    <input name="cid">：打卡编号（cid）<br />
</form>
<button id="deleteBtn" onclick="deleteItem()">删除</button>
<hr />
<form id="update">
    <h3>修改打卡</h3>
    <input id="cid" onblur="query()">：打卡编号（cid）- 填写以填充下列信息<br />
    <textarea id="content" name="content" rows="4"></textarea>：内容（content）<br />
    <input id="location" name="location">：位置（location）<br />
    <input id="star" name="star">：点赞数（star）<br />
    <input id="time" readonly>：发布时间（time）<br />
</form>
<button id="updateBtn" onclick="update()">修改</button>
<script>
    function insert() {
        $.ajax({
            url: "/manage/checkin/insert",
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
            url: "/manage/checkin/delete",
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
            url: "/manage/checkin/update",
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
        $.get("/manage/checkin/query", {
            "cid" : $("#cid").val()
        }, function(response) {
            $("#content").val(response["content"]);
            $("#location").val(response["location"]);
            $("#star").val(response["star"]);
            $("#time").val(response["time"]);
        })
    }
</script>
