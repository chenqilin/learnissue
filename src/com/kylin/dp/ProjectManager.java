package com.kylin.dp;

public class ProjectManager extends Handler{

	@Override
	public String handleRequest(String name, int salary) {

		String str = "";
		if(salary<1000){
			str= ProjectManager.class.getName()+ " "+name +" 成功受理审批！" + salary;
		}else{
			if(getNextHandler()!=null){
				str = getNextHandler().handleRequest(name, salary);
			}
		}
		
		return str;
	
	}

}
