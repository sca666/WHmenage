<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-07 14:24:30
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">

            <label class="layui-form-label">Id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="id" maxlength="11"  value="${model.id}" lay-verify="required" placeholder="请输入"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">Id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="commodityid" maxlength="11"  value="${model.commodityid}" lay-verify="required" placeholder="请输入"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">型号名<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="commodityname" maxlength="20"  value="${model.commodityname}" lay-verify="required" placeholder="请输入"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">类型<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="commoditytype" maxlength="11"  value="${model.commoditytype}" lay-verify="required" placeholder="请输入"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">单位<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="uint" maxlength="5"  value="${model.uint}" lay-verify="required" placeholder="请输入"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="100"  value="${model.remark}" lay-verify="required" placeholder="请输入"  class="layui-input">
            </div>
        </div>
      