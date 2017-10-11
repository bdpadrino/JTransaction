package sys.bean;

import javax.faces.bean.ManagedBean;

import sys.model.Login;
 
@ManagedBean(name="LoginBean")
public class LoginBean {
     
	private Login login;
	
		
	public LoginBean() {
		this.login = new Login();
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
    
	public String iniciarSesion(){
		System.out.println("entro a iniciar Sesion");
		if (login.getUser().equals("admin") && login.getPassword().equals("admin")){
			System.out.println("clave correcta");
			System.out.println("user" +login.getUser() + "password" + login.getPassword());
			return "HistorialTransacciones.xhtml";
		}
		else {
			System.out.println("clave incorrecta");
			System.out.println("user" +login.getUser() + "password" + login.getPassword());
			return "";
		}
		
	}


 
    
}