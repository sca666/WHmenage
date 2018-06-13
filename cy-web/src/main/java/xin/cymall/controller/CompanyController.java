package xin.cymall.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xin.cymall.annotation.SysLog;
import xin.cymall.entity.Company;
import xin.cymall.enumresource.StateEnum;
import xin.cymall.service.CompanyService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;

import java.util.List;
import java.util.Map;


/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-11 15:18:13
 */
@Controller
@RequestMapping("company")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("company:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Company> companyList = companyService.getList(query);
		int total = companyService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(companyList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("company:save")
    public String add(){
        return "company/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("company:update")
    public String edit(Model model, @PathVariable("id") String id){
		Company company = companyService.get(id);
        model.addAttribute("model",company);
        return "company/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{companyId}")
    @RequiresPermissions("company:info")
    public R info(@PathVariable("companyId") String companyId){
        Company company = companyService.get(companyId);
        return R.ok().put("company", company);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存")
	@RequestMapping("/save")
	@RequiresPermissions("company:save")
	public R save(@RequestBody Company company){
		companyService.save(company);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改")
	@RequestMapping("/update")
	@RequiresPermissions("company:update")
	public R update(@RequestBody Company company){
		companyService.update(company);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用")
    @RequestMapping("/enable")
    @RequiresPermissions("company:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		companyService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用")
    @RequestMapping("/limit")
    @RequiresPermissions("company:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		companyService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除")
	@RequestMapping("/delete")
	@RequiresPermissions("company:delete")
	public R delete(@RequestBody String[] companyIds){
		companyService.deleteBatch(companyIds);
		
		return R.ok();
	}
	
}
