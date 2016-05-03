package com.kylin.dp;

public abstract class Handler {
	/**
	 * 后继责任对象
	 */
	protected Handler nextHandler;
	
	public abstract String handleRequest(String name,int salary);

	/**
	 * 获取后继对象
	 * @return
	 */
	public Handler getNextHandler() {
		return nextHandler;
	}

	/**
	 * 给后继对象赋值
	 * @param nextHandler
	 */
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
}
