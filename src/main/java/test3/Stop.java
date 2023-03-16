package test3;

public class Stop {
	
	
	public Stop(boolean inputValue) {
		this.stopFlag = inputValue;
	}
	boolean stopFlag = false;

	public boolean isStopFlag() {
		return stopFlag;
	}

	public void setStopFlag(boolean stopFlag) {
		this.stopFlag = stopFlag;
	}
	
}
