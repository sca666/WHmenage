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
                <input type="text"  name="comsetdetailId" maxlength="20"  value="${model.comsetdetailId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">公司id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="companyId" maxlength="11"  value="${model.companyId}" lay-verify="required" placeholder="请输入公司id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="commodityId" maxlength="11"  value="${model.commodityId}" lay-verify="required" placeholder="请输入商品id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputnum" maxlength="10,3"  value="${model.outputnum}" lay-verify="required" placeholder="请输入出库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">未出库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="balancenum" maxlength="10,3"  value="${model.balancenum}" lay-verify="required" placeholder="请输入未出库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">入库申请单id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputapplyId" maxlength="20"  value="${model.inputapplyId}" lay-verify="required" placeholder="请输入入库申请单id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库申请单id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputapplyId" maxlength="20"  value="${model.outputapplyId}" lay-verify="required" placeholder="请输入出库申请单id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">入库时间<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="intputDate" maxlength="20"  value="${model.intputDate}" lay-verify="required" placeholder="请输入入库时间"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库时间<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputDate" maxlength="20"  value="${model.outputDate}" lay-verify="required" placeholder="请输入出库时间"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">存放天数<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="depositDays" maxlength="11"  value="${model.depositDays}" lay-verify="required" placeholder="请输入存放天数"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">基本仓租类型<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="basicrentId" maxlength="11"  value="${model.basicrentId}" lay-verify="required" placeholder="请输入基本仓租类型"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">加租仓租类型<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="raiserentId" maxlength="11"  value="${model.raiserentId}" lay-verify="required" placeholder="请输入加租仓租类型"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">付款标记<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="paymenttype" maxlength="11"  value="${model.paymenttype}" lay-verify="required" placeholder="请输入付款标记"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">结算状态<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="settlementStatus" maxlength="11"  value="${model.settlementStatus}" lay-verify="required" placeholder="请输入结算状态"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">单价<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="price" maxlength="20"  value="${model.price}" lay-verify="required" placeholder="请输入单价"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">应付金额<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="totalMoney" maxlength="10,3"  value="${model.totalMoney}" lay-verify="required" placeholder="请输入应付金额"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">装车费<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="loadingcost" maxlength="10,3"  value="${model.loadingcost}" lay-verify="required" placeholder="请输入装车费"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      