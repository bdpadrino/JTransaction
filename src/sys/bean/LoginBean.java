package sys.bean;

import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class LoginBean {
     
    private String password1;  
    private boolean value1;
 
    public String getPassword1() {
        return password1;
    }
 
    public void setPassword1(String password1) {
        this.password1 = password1;
    }

	public boolean isValue1() {
		return value1;
	}

	public void setValue1(boolean value1) {
		this.value1 = value1;
	}
    
    
 
    
}