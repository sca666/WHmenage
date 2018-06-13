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

import xin.cymall.entity.Category;
import xin.cymall.service.CategoryService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 商品分类
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:36:05
 */
@Controller
@RequestMapping("category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("category:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Category> categoryList = categoryService.getList(query);
		int total = categoryService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(categoryList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("category:save")
    public String add(){
        return "category/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("category:update")
    public String edit(Model model, @PathVariable("id") String id){
		Category category = categoryService.get(id);
        model.addAttribute("model",category);
        return "category/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{categoryId}")
    @RequiresPermissions("category:info")
    public R info(@PathVariable("categoryId") String categoryId){
        Category category = categoryService.get(categoryId);
        return R.ok().put("category", category);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存商品分类")
	@RequestMapping("/save")
	@RequiresPermissions("category:save")
	public R save(@RequestBody Category category){
		categoryService.save(category);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改商品分类")
	@RequestMapping("/update")
	@RequiresPermissions("category:update")
	public R update(@RequestBody Category category){
		categoryService.update(category);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用商品分类")
    @RequestMapping("/enable")
    @RequiresPermissions("category:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		categoryService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用商品分类")
    @RequestMapping("/limit")
    @RequiresPermissions("category:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		categoryService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除商品分类")
	@RequestMapping("/delete")
	@RequiresPermissions("category:delete")
	public R delete(@RequestBody String[] categoryIds){
		categoryService.deleteBatch(categoryIds);
		
		return R.ok();
	}
	
}
