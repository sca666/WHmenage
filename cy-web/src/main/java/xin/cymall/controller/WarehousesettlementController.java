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

import xin.cymall.entity.Warehousesettlement;
import xin.cymall.service.WarehousesettlementService;
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
@RequestMapping("warehousesettlement")
public class WarehousesettlementController {
	@Autowired
	private WarehousesettlementService warehousesettlementService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("warehousesettlement:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Warehousesettlement> warehousesettlementList = warehousesettlementService.getList(query);
		int total = warehousesettlementService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(warehousesettlementList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("warehousesettlement:save")
    public String add(){
        return "warehousesettlement/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("warehousesettlement:update")
    public String edit(Model model, @PathVariable("id") String id){
		Warehousesettlement warehousesettlement = warehousesettlementService.get(id);
        model.addAttribute("model",warehousesettlement);
        return "warehousesettlement/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{housesetId}")
    @RequiresPermissions("warehousesettlement:info")
    public R info(@PathVariable("housesetId") String housesetId){
        Warehousesettlement warehousesettlement = warehousesettlementService.get(housesetId);
        return R.ok().put("warehousesettlement", warehousesettlement);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存")
	@RequestMapping("/save")
	@RequiresPermissions("warehousesettlement:save")
	public R save(@RequestBody Warehousesettlement warehousesettlement){
		warehousesettlementService.save(warehousesettlement);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改")
	@RequestMapping("/update")
	@RequiresPermissions("warehousesettlement:update")
	public R update(@RequestBody Warehousesettlement warehousesettlement){
		warehousesettlementService.update(warehousesettlement);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用")
    @RequestMapping("/enable")
    @RequiresPermissions("warehousesettlement:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		warehousesettlementService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用")
    @RequestMapping("/limit")
    @RequiresPermissions("warehousesettlement:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		warehousesettlementService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除")
	@RequestMapping("/delete")
	@RequiresPermissions("warehousesettlement:delete")
	public R delete(@RequestBody String[] housesetIds){
		warehousesettlementService.deleteBatch(housesetIds);
		
		return R.ok();
	}
	
}
