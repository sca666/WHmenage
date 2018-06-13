package xin.cymall.controller;

import java.util.List;
import java.util.Map;
import xin.cymall.enumresource.StateEnum;
import xin.cymall.annotation.SysLog;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;

import xin.cymall.entity.Commodityinfo;
import xin.cymall.service.CommodityinfoService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-07 14:24:30
 */
@Controller
@RequestMapping("commodityinfo")
public class CommodityinfoController {
	@Autowired
	private CommodityinfoService commodityinfoService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("commodityinfo:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Commodityinfo> commodityinfoList = commodityinfoService.getList(query);
		int total = commodityinfoService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(commodityinfoList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("commodityinfo:save")
    public String add(){
        return "commodityinfo/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("commodityinfo:update")
    public String edit(Model model, @PathVariable("id") String id){
		Commodityinfo commodityinfo = commodityinfoService.get(id);
        model.addAttribute("model",commodityinfo);
        return "commodityinfo/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{id}")
    @RequiresPermissions("commodityinfo:info")
    public R info(@PathVariable("id") String id){
        Commodityinfo commodityinfo = commodityinfoService.get(id);
        return R.ok().put("commodityinfo", commodityinfo);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存")
	@RequestMapping("/save")
	@RequiresPermissions("commodityinfo:save")
	public R save(@RequestBody Commodityinfo commodityinfo){
		commodityinfoService.save(commodityinfo);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改")
	@RequestMapping("/update")
	@RequiresPermissions("commodityinfo:update")
	public R update(@RequestBody Commodityinfo commodityinfo){
		commodityinfoService.update(commodityinfo);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用")
    @RequestMapping("/enable")
    @RequiresPermissions("commodityinfo:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		commodityinfoService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用")
    @RequestMapping("/limit")
    @RequiresPermissions("commodityinfo:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		commodityinfoService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除")
	@RequestMapping("/delete")
	@RequiresPermissions("commodityinfo:delete")
	public R delete(@RequestBody String[] ids){
		commodityinfoService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
