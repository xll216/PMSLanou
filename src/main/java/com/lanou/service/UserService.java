package com.lanou.service;

import com.lanou.domain.PMSBaseDepartment;
import com.lanou.domain.PMSBaseStaff;
import com.lanou.domain.RdmsProjBase;
import com.lanou.result.ProjectApplyBean;
import com.lanou.util.SearchBean;

import java.io.IOException;
import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface UserService {

    List<PMSBaseDepartment> selectAll();

    List<PMSBaseDepartment> getDepartmentByCondition(SearchBean searchBean);


    List<PMSBaseStaff> getStaffByCondition(SearchBean searchBean);

    PMSBaseDepartment selectDepartmentByDepId(Integer depid);

    PMSBaseStaff selectStaffByStaffID(Integer staffid);

    boolean projectApply(ProjectApplyBean applyBean, RdmsProjBase projBase) throws IOException;
}
