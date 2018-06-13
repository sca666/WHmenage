<!--
* 详情页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 16:50:11
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="/common/jsp/resource.jsp" %>
</head>
<body>
<div class="layui-field-box">
    <form class="layui-form" action="">
             <div class="layui-form-item">
            <label class="layui-label-left">主键ID<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.basicrentId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">基本仓租类型<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.basicrentname}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">仓租单价<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.basicrentprice}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">备注<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.remark}</label>
        </div>
          </form>
</div>
<script>
    $(document).ready(function () {
       var labels=$(".layui-label-right");
       for(var i=0;i<labels.length;i++){
           if($(labels[i]).html()==""){
               $(labels[i]).html("-");
           }
       }
    });
</script>
</body>
</html>
