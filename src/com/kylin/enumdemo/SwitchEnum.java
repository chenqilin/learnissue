package com.kylin.enumdemo;

/**
 * enum switch สนำร
 * @author qilin
 *
 */
public class SwitchEnum {
//	Signal color = Signal.Green;
	
	public void change(Signal color){
		switch (color) {
		case Green:
			color = Signal.Red;
			break;
		case Red:
			color = Signal.Yellow;
			break;
		case Yellow:
			color = Signal.Green;
			break;
		}
	}
	
	public static void main(String[] args) {
		SwitchEnum switchEnum = new SwitchEnum();
		switchEnum.change(Signal.Yellow);
		Signal [] signals = Signal.values();
		for (Signal signal : signals) {
			System.out.println(signal.name());
		}
	}
}
