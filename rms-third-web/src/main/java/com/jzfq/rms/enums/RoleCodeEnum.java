package com.jzfq.rms.enums;
/**
 * 角色代码枚举
 * @author 大连桔子分期科技有限公司
 * @date   10/13/16. 上午10:14:14
 */
public enum RoleCodeEnum {

	CSZY("初审专员",1),
	CSZG("初审主管",2),
	ZSZY("终审专员",3),
	ZSZG("终审主管",4),
	ADMIN("管理员",5),
	MULTIPLE_QUERY("综合查询",6);

	private String name;
	private Integer value;
	
	RoleCodeEnum(String name,Integer value){
		this.name = name;
		this.value = value;
	}
	
	public static String getName(String value) {
        for (RoleCodeEnum r : RoleCodeEnum.values()) {
            if (r.getValue().equals(value)) {
                return r.name;
            }
        }
        return null;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
}
