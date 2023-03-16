package test3.com.yiibai;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "usersDto")
@SessionScoped
public class UsersDto {
	
	private List<UserBean> userlist = new ArrayList<UserBean>();
	
	public UsersDto() {
		super();
		UserBean obj1 = new UserBean();
		obj1.setRememberMe(true);
		
		UserBean obj2 = new UserBean();
		obj2.setRememberMe(false);
		
		UserBean obj3 = new UserBean();
		obj3.setRememberMe(true);
		
		UserBean obj4 = new UserBean();
		obj4.setRememberMe(false);
		
		this.userlist.add(obj1);
		this.userlist.add(obj2);
		this.userlist.add(obj3);
		this.userlist.add(obj4);
	}

	public List<UserBean> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<UserBean> userlist) {
		this.userlist = userlist;
	}
	
}
