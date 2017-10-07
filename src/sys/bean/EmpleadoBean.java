package sys.bean;

import java.io.Serializable;
import java.util.List;

import sys.dao.EmpleadoDao;
import sys.dao.imp.EmpleadoDaoImp;
import sys.model.Empleado;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="empleadoBean")
@SessionScoped
public class EmpleadoBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1234519223105193290L;
	
	EmpleadoDao ce = new EmpleadoDaoImp();      
	
	private List<Empleado> listarEmpleados;
    private Empleado empleado;  
   
    public EmpleadoBean() {
	     
    }
   
    public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
     
    public void guardarEmpleado() {
    	System.out.println("entrando a guardar");
    	System.out.println("ee" +empleado.getCedula());
    	
    	/*e.setNombre(nombre);
    	e.setCedula(cedula);
    	e.setApellido(apellido);*/
    	
    	ce.agregarEmpleado(empleado);
    	
    	
    	//return "welcome";
    }
    
   
    
    public void prepararNuevoEmpleado() {
    	System.out.println("instanciando");
    	//empleado = new Empleado();
    }

	public List<Empleado> getListarEmpleados() {
		listarEmpleados = ce.listarEmpleados();    	

		return listarEmpleados;
	}

	public void setListarEmpleados(List<Empleado> listarEmpleados) {
		this.listarEmpleados = listarEmpleados;
	}
    
    

	

	
    
	
}