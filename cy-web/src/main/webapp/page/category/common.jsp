<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-11 15:18:13
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">
            <label class="layui-form-label">主键ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="categoryId" maxlength="11"  value="${model.categoryId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品分类编码<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="code" maxlength="100"  value="${model.code}" lay-verify="required" placeholder="请输入商品分类编码"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品分类名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="name" maxlength="100"  value="${model.name}" lay-verify="required" placeholder="请输入商品分类名称"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品分类父类id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="parentId" maxlength="11"  value="${model.parentId}" lay-verify="required" placeholder="请输入商品分类父类id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品分类全名<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="fullName" maxlength="100"  value="${model.fullName}" lay-verify="required" placeholder="请输入商品分类全名"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      