package com.kylin.dp;

public class DepartManager extends Handler{

	@Override
	public String handleRequest(String name, int salary) {
		String str = "";
		if(salary<10000){
			str= DepartManager.class.getName()+ " "+name +" �ɹ�����������" + salary;
		}else{
			if(getNextHandler()!=null){
				str = getNextHandler().handleRequest(name, salary);
			}
		}
		 
		return str;
	}

}
