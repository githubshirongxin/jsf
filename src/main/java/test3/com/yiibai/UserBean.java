package test3.com.yiibai;

import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped
public class UserBean {

	private int data = 2;
	
	public void changeData() {
		this.data+=2;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String[] favNumber1;

	public String[] getFavNumber1() {
		return favNumber1;
	}

	public void setFavNumber1(String[] favNumber1) {
		this.favNumber1 = favNumber1;
	}

	public String getFavNumber1InString() {
		return Arrays.toString(favNumber1);
	}

	public boolean rememberMe = true;

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

}