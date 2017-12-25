package com.lanou.service.impl;

import com.lanou.domain.PMSBaseDepartment;
import com.lanou.mapper.PMSBaseDepartmentMapper;
import com.lanou.service.UserService;
import com.lanou.util.SearchBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private PMSBaseDepartmentMapper pmsBaseDepartmentMapper;

    /**
     * 查询所有部门列表
     **/
    @Override
    public List<PMSBaseDepartment> selectAll() {
        return pmsBaseDepartmentMapper.selectAll();
    }

    /**
     * 根据条件查询部门列表
     *
     * @param searchBean 查询条件
     **/
    @Override
    public List<PMSBaseDepartment> selectBySelecttive(SearchBean searchBean) {
        return pmsBaseDepartmentMapper.selectBySelecttive(searchBean);
    }
}
