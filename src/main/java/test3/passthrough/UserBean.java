package test3.passthrough;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.HashMap;
import java.util.Map;

@ManagedBean(name="passthrough")
@RequestScoped
public class UserBean {

    private String email1, email2, email3, email4;

    public Map<String, Object> getAttributes(){
        Map<String, Object> attributes = new HashMap<String, Object>();
        attributes.put("type", "email");
        attributes.put("placeholder", "Enter email");
        return attributes;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public String getEmail4() {
        return email4;
    }

    public void setEmail4(String email4) {
        this.email4 = email4;
    }
}