<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 16:50:11
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">
            <label class="layui-form-label">主键ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="carId" maxlength="11"  value="${model.carId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">车牌号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="carnum" maxlength="100"  value="${model.carnum}" lay-verify="required" placeholder="请输入车牌号"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">所属单位<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="unit" maxlength="100"  value="${model.unit}" lay-verify="required" placeholder="请输入所属单位"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      