package com.xxplay.dao.admin;

import java.util.List;
import java.util.Map;

import com.xxplay.model.dto.page.PageParams;
import com.xxplay.model.persistent.admin.Role;

public interface IRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

	List<Role> getRoleList(Map<String, Object> params);

	List<Role> getRoleListPage(PageParams params);
	
	Integer getRoleCountPage();
}