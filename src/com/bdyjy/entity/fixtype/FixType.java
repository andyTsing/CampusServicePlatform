/**
 * FixType.java[v 1.0.0]
 * class:com.bdyjy.entity.fixtype,FixType
 * 周航 create at 2016-4-21 下午3:54:19
 */
package com.bdyjy.entity.fixtype;

import java.util.List;

/**
 * com.bdyjy.entity.fixtype.FixType
 * 
 * @author 周航<br/>
 *         create at 2016-4-21 下午3:54:19
 */
public class FixType
{
	public String getSystem_result_key()
	{
		return system_result_key;
	}

	public void setSystem_result_key(String system_result_key)
	{
		this.system_result_key = system_result_key;
	}

	public String getApp_result_key()
	{
		return app_result_key;
	}

	public void setApp_result_key(String app_result_key)
	{
		this.app_result_key = app_result_key;
	}

	public String getCurrent_session_user_resource_ids_index()
	{
		return current_session_user_resource_ids_index;
	}

	public void setCurrent_session_user_resource_ids_index(
			String current_session_user_resource_ids_index)
	{
		this.current_session_user_resource_ids_index = current_session_user_resource_ids_index;
	}

	public List<Type> getTypeData()
	{
		return typeData;
	}

	public void setTypeData(List<Type> typeData)
	{
		this.typeData = typeData;
	}

	String system_result_key;
	String app_result_key;
	String current_session_user_resource_ids_index;
	List<Type> typeData;
}
