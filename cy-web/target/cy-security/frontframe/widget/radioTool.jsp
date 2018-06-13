<%--
  Created by IntelliJ IDEA.
  User: 陈熠
  Date: 2017/7/10
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>单选控件</title>
    <%@ include file="/common/jsp/resource.jsp" %>
</head>
<body>
<div class="layui-input-inline">
    <button class="layui-btn" onclick="submitCode()">提交代码</button>
</div>
<div class="layui-tab">
    <ul class="layui-tab-title">
        <li class="layui-this">代码</li>
        <li id="showResult">效果</li>
        <li>参数详解</li>

    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
            <code style="margin-top: 4px; display: block;">单选控件使用示例</code>
            <textarea class="layui-textarea" rows="20" class="layui-code">
               <form class="layui-form " action="">


                   <!--通过枚举渲染数据-->
                    <div cyType="radioTool" cyProps="enumName:'SexEnum',disabled:'0',filter:'sex'" name="sex1"
                         value="1" class="layui-input-inline"></div><br><br>

                   <!--通过字典渲染数据-->
                    <div cyType="radioTool" cyProps="codeName:'sex',disabled:'1',filter:'sex'" name="sex2"
                         value="1" class="layui-input-inline"></div><br><br>


                   <!--通过url渲染数据-->
                    <div cyType="radioTool" cyProps="url:'/frontframe/json/sex.json',disabled:'1',filter:'sex'"
                         name="sex3" value="1" class="layui-input-inline"></div><br><br>

               </form>
           </textarea>
            <code style="margin-top: 4px; display: block;">单选框点击监听事件</code>
            <pre class="layui-code">
             <script>
                      layui.use(['form'], function () {
                      var form = layui.form();
                      //监听单选
                      form.on('radio(sex)', function (data) {
                      console.log(data.elem); //得到checkbox原始DOM对象
                      console.log(data.elem.checked); //是否被选中，true或者false
                      console.log(data.value); //单选框value值，也可以通过data.elem.value得到
                      console.log(data.othis); //得到美化后的DOM对象
                      });
                    });
            </script>
           </pre>
        </div>
        <div class="layui-tab-item" id="result">
            <form class="layui-form " action="">

                    <div cyType="radioTool" cyProps="enumName:'SexEnum',disabled:'0',filter:'sex'" name="sex1"
                         value="1" class="layui-input-inline"></div><br><br>



                    <div cyType="radioTool" cyProps="codeName:'sex',disabled:'1',filter:'sex'" name="sex2"
                         value="1" class="layui-input-inline"></div><br><br>



                    <div cyType="radioTool" cyProps="url:'/frontframe/json/sex.json',disabled:'1',filter:'sex'"
                         name="sex3" value="1" class="layui-input-inline"></div><br><br>


            </form>
        </div>
        <div class="layui-tab-item">
            <table class="layui-table">
                <thead>
                <tr>
                    <th>组件参数</th>
                    <th>描述</th>
                    <th>默认值</th>
                    <th>代码示例</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>cyType</td>
                    <td>控件类型</td>
                    <td><span style="color:red">必填</span></td>
                    <td>cyType="radioTool"</td>
                </tr>
                <tr>
                    <td>value</td>
                    <td>单选框选中的值</td>
                    <td>null</td>
                    <td>value="1" || value="\${model.code}"</td>
                </tr>
                <tr>
                    <td>name</td>
                    <td>对应的字段名，用于表单提交</td>
                    <td>null</td>
                    <td>cyProps="name:'sex"</td>
                </tr>
                <tr>
                    <td>cyProps:url</td>
                    <td>数据源(通过url)</td>
                    <td><span style="color:red">url||codeName||enumName  三选一</span></td>
                    <td>cyProps="url:'/page/demo/json/sex.json'" || cyProps="url:'demo.action'"</td>
                </tr>
                <tr>
                    <td>cyProps:codeName</td>
                    <td>数据源(通过codeName)</td>
                    <td><span style="color:red">url||codeName||enumName  三选一</span></td>
                    <td>cyProps="codeName:'sex'"</td>
                </tr>
                <tr>
                    <td>cyProps:enumName</td>
                    <td>数据源(通过enumName)</td>
                    <td><span style="color:red">url||codeName||enumName  三选一</span></td>
                    <td>cyProps="enumName:'sexEnum'"</td>
                </tr>
                <tr>
                    <td>cyProps:disabled</td>
                    <td>禁用的值(多个值用逗号隔开)</td>
                    <td>null</td>
                    <td>cyProps="disabled:'1,2'"</td>
                </tr>
                <tr>
                    <td>cyProps:filter</td>
                    <td>用于控件点击时的监听标识</td>
                    <td>null</td>
                    <td>cyProps="filter:'sex'"</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</div>
<script>
    layui.use('form', function () {
        var form = layui.form();
        form.render('radio');
        //监听单选
        form.on('radio(sex)', function (data) {
            if (data.value == 0) {
                Msg.info("code: "+data.value+"  value: "+data.elem.title)
                return false;
            }
            if (data.value == 1) {
                Msg.info("code: "+data.value+"  value: "+data.elem.title)
                return false;
            }
            if (data.value == 2) {
                Msg.info("code: "+data.value+"  value: "+data.elem.title)
                return false;
            }
        });


    });
    layui.use('element', function () {
    });
    function submitCode() {
        var code = $("textarea").val();
        $("#result").html(code);
        var radios = $("#result").find("[cyType='radioTool']");
        for (var i = 0; i < radios.length; i++) {
            $(radios[i]).radioTool();
        }
        layui.use('form', function () {
            var form = layui.form();
            form.render('radio');
        });
        Msg.success("代码提交成功,请查看效果!");
        Tips.info("点此查看效果",$("#showResult"));
    }

    layui.use('code', function(){ //加载code模块
        layui.code({encode: true}); //引用code方法
    });
</script>
</body>
</html>
