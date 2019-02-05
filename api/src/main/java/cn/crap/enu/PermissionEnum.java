package cn.crap.enu;

import cn.crap.utils.IConst;
import cn.crap.utils.MyString;

public enum PermissionEnum {

	 MY_DATE("myData", IConst.NULL),
	 READ("read", IConst.NULL),
	 MOD_INTER("modInter","修改接口", true, "接口权限"),
	 ADD_INTER("addInter","添加接口"),
	 DEL_INTER("delInter","删除接口"),

	 MOD_MODULE("modModule","修改模块", true, "模块权限"),
	 ADD_MODULE("addModule","添加模块"),
	 DEL_MODULE("delMODULE","删除模块"),

	 MOD_ARTICLE("modArticle","修改文档", true, "文档权限"),
	 ADD_ARTICLE("addArticle","添加文档"),
	 DEL_ARTICLE("delArticle","删除文档"),

	 MOD_DICT("modDict","修改数据库表", true, "数据库表权限"),
	 ADD_DICT("addDict","添加数据库表"),
	 DEL_DICT("delDict","删除数据库表"),

	 MOD_SOURCE("modSource","修改文件", true, "文件权限"),
	 ADD_SOURCE("addSource","添加文件"),
	 DEL_SOURCE("delSource","删除文件"),

	 MOD_ERROR("modError","修改状态码", true, "状态码权限"),
	 ADD_ERROR("addError","添加状态码"),
	 DEL_ERROR("delError","删除状态码");

	private final String value;
	private final String desc;
	private final boolean separator;
	private final String separatorTitle;


	PermissionEnum(String value, String desc, boolean separator, String separatorTitle){
		this.value = value;
		this.desc = desc;
		this.separator = separator;
		this.separatorTitle = separatorTitle;
	}

	PermissionEnum(String value, String desc){
		this(value, desc, false, "");
	}

	public static PermissionEnum getByValue(String value){
		if (MyString.isEmpty(value)){
			return null;
		}
		for( PermissionEnum permissionEnum : PermissionEnum.values()){
			if(permissionEnum.getValue().equals(value)){
				return permissionEnum;
			}
		}
		return null;
	}

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

	public boolean isSeparator() {
		return separator;
	}

	public String getSeparatorTitle() {
		return separatorTitle;
	}
}
