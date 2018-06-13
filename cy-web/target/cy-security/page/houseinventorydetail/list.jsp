<%--
  Created by chenyi
  email: 228112142@qq.com
  Date : 2018-06-12 16:50:11
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>仓库的库存明细表</title>
    <%@ include file="/common/jsp/resource.jsp" %>
    <script type="text/javascript" src="/page/houseinventorydetail/js/list.js"></script>
</head>
<body>
<form class="layui-form " action="">
    <div class="layui-form-item">
        <label class="layui-form-label">名称:</label>
        <div class="layui-input-inline">
            <input type="text" name=""  placeholder="请输入名称" class="layui-input">
        </div>

        <div class="layui-input-inline">
            <button class="layui-btn search-btn" table-id="houseinventorydetailTable" lay-submit="" lay-filter="search"><i class="fa fa-search">&nbsp;</i>查询
            </button>
            <button type="reset" class="layui-btn layui-btn-primary"><i class="fa fa-refresh">&nbsp;</i>重置</button>
        </div>
    </div>
</form>
<div class="layui-btn-group">
        <shiro:hasPermission name="houseinventorydetail:save">
        <button class="layui-btn" onclick="addPage('/houseinventorydetail/add')">
            <i class="fa fa-plus">&nbsp;</i>增加
        </button>
        </shiro:hasPermission>
        <shiro:hasPermission name="houseinventorydetail:update">
        <button class="layui-btn" onclick="editPage('commparaTable','/houseinventorydetail/edit')">
            <i class="fa fa-pencil-square-o">&nbsp;</i>修改
        </button>
         <button class="layui-btn layui-btn-green" onclick="updateState('批量启用','houseinventorydetailTable','/houseinventorydetail/enable')">
            <i class="fa fa-check-square-o">&nbsp;</i>启用
        </button>
        <button class="layui-btn  layui-btn-danger" onclick="updateState('批量禁用','houseinventorydetailTable','/houseinventorydetail/limit')">
            <i class="fa fa-expeditedssl">&nbsp;</i>禁用
        </button>
        </shiro:hasPermission>
        <shiro:hasPermission name="houseinventorydetail:delete">
         <button class="layui-btn layui-btn-delete" onclick="deleteBatch('批量删除','houseinventorydetailTable','/houseinventorydetail/delete');">
            <i class="fa fa-trash-o">&nbsp;</i>删除
        </button>
        </shiro:hasPermission>

</div>
<div class="layui-form ">
    <table class="layui-table" id="houseinventorydetailTable" cyType="pageGrid"
           cyProps="url:'/houseinventorydetail/list',checkbox:'true',pageColor:'#2991d9'">
        <thead>
        <tr>
            <!--复选框-->
            <th width="1%" param="{type:'checkbox'}">
                <input type="checkbox" lay-skin="primary" lay-filter="allChoose">
            </th>
            			            <!--isPrimary：是否是主键-->
            <th width="10%" param="{name:'houseinvendId',isPrimary:'true',hide:'true'}">主键ID</th>
            
		                			
		          <th width="10%" param="{name:'houseinvenmId'}">主表id</th>
			            			
		          <th width="10%" param="{name:'commodity'}">商品id</th>
			            			
		          <th width="10%" param="{name:'basicrentId'}">基本仓租类型</th>
			            			
		          <th width="10%" param="{name:'paymenttype'}">付款标记</th>
			            			
		          <th width="10%" param="{name:'warehouseId'}">仓库id</th>
			            			
		          <th width="10%" param="{name:'intputId'}">入库单id</th>
			            			
		          <th width="10%" param="{name:'outtputId'}">出库单id</th>
			            			
		          <th width="10%" param="{name:'inputnum'}">入库数量</th>
			            			
		          <th width="10%" param="{name:'outputnum'}">出库数量</th>
			            			
		          <th width="10%" param="{name:'balancenum'}">商品结余数量</th>
			            			
		          <th width="10%" param="{name:'inputDate'}">录入时间</th>
			            			
		          <th width="10%" param="{name:'userId'}">业务员id</th>
			            			
		          <th width="10%" param="{name:'remark'}">备注</th>
			                        <!--isPrimary：渲染列-->
            <th width="10%" param="{name:'state',enumName:'StateEnum',render:'Render.customState'}">状态</th>
            <th width="10%" param="{operate:'true',buttons:'Render.state,Render.edit,Render.delete'}">操作</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>