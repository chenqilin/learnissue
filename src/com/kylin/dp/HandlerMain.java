package com.kylin.dp;

/**
 * ������
 * @author qilin
 *
 */
public class HandlerMain {
	public static void main(String[] args) {
		Handler generalMHandler = new GeneralManager();
		Handler projectManager = new ProjectManager();
		Handler departManager = new DepartManager();
		generalMHandler.setNextHandler(projectManager);
		projectManager.setNextHandler(departManager);
		
		System.out.println(generalMHandler.handleRequest("����", 10));
	}
}
