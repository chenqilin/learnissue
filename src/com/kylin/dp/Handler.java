package com.kylin.dp;

public abstract class Handler {
	/**
	 * ������ζ���
	 */
	protected Handler nextHandler;
	
	public abstract String handleRequest(String name,int salary);

	/**
	 * ��ȡ��̶���
	 * @return
	 */
	public Handler getNextHandler() {
		return nextHandler;
	}

	/**
	 * ����̶���ֵ
	 * @param nextHandler
	 */
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
}
