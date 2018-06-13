<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 16:50:10
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">
            <label class="layui-form-label">主键ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="id" maxlength="255"  value="${model.id}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">分类编码<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="code" maxlength="255"  value="${model.code}" lay-verify="required" placeholder="请输入分类编码"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">分类名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="name" maxlength="255"  value="${model.name}" lay-verify="required" placeholder="请输入分类名称"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">上级ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="parentId" maxlength="255"  value="${model.parentId}" lay-verify="required" placeholder="请输入上级ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">公司Id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="companyId" maxlength="255"  value="${model.companyId}" lay-verify="required" placeholder="请输入公司Id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">价格体系<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="psId" maxlength="255"  value="${model.psId}" lay-verify="required" placeholder="请输入价格体系"  class="layui-input">
            </div>
        </div>
      