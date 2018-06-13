<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-11 15:18:13
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">
            <label class="layui-form-label"><span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="companyId" maxlength="11"  value="${model.companyId}" lay-verify="required" placeholder="请输入"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">公司编码<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="companyCode" maxlength="100"  value="${model.companyCode}" lay-verify="required" placeholder="请输入公司编码"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">公司名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="companyName" maxlength="100"  value="${model.companyName}" lay-verify="required" placeholder="请输入公司名称"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">公司联系人<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="contacts" maxlength="100"  value="${model.contacts}" lay-verify="required" placeholder="请输入公司联系人"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">联系电话<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="telephone" maxlength="20"  value="${model.telephone}" lay-verify="required" placeholder="请输入联系电话"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">角色id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="roleId" maxlength="11"  value="${model.roleId}" lay-verify="required" placeholder="请输入角色id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      