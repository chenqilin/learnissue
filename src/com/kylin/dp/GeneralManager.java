package com.kylin.dp;

public class GeneralManager extends Handler{

	@Override
	public String handleRequest(String name, int salary) {

		String str = "";
		if(salary<100){
			str= GeneralManager.class.getName()+ " "+name +" �ɹ�����������" + salary;
		}else{
			if(getNextHandler()!=null){
				str = getNextHandler().handleRequest(name, salary);
			}
		}
		
		return str;
	
	}

}
