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

import xin.cymall.entity.Companysettlement;
import xin.cymall.service.CompanysettlementService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 16:50:10
 */
@Controller
@RequestMapping("companysettlement")
public class CompanysettlementController {
	@Autowired
	private CompanysettlementService companysettlementService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("companysettlement:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Companysettlement> companysettlementList = companysettlementService.getList(query);
		int total = companysettlementService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(companysettlementList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("companysettlement:save")
    public String add(){
        return "companysettlement/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("companysettlement:update")
    public String edit(Model model, @PathVariable("id") String id){
		Companysettlement companysettlement = companysettlementService.get(id);
        model.addAttribute("model",companysettlement);
        return "companysettlement/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{comsetId}")
    @RequiresPermissions("companysettlement:info")
    public R info(@PathVariable("comsetId") String comsetId){
        Companysettlement companysettlement = companysettlementService.get(comsetId);
        return R.ok().put("companysettlement", companysettlement);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存")
	@RequestMapping("/save")
	@RequiresPermissions("companysettlement:save")
	public R save(@RequestBody Companysettlement companysettlement){
		companysettlementService.save(companysettlement);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改")
	@RequestMapping("/update")
	@RequiresPermissions("companysettlement:update")
	public R update(@RequestBody Companysettlement companysettlement){
		companysettlementService.update(companysettlement);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用")
    @RequestMapping("/enable")
    @RequiresPermissions("companysettlement:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		companysettlementService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用")
    @RequestMapping("/limit")
    @RequiresPermissions("companysettlement:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		companysettlementService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除")
	@RequestMapping("/delete")
	@RequiresPermissions("companysettlement:delete")
	public R delete(@RequestBody String[] comsetIds){
		companysettlementService.deleteBatch(comsetIds);
		
		return R.ok();
	}
	
}
