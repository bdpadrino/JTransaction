package sys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {
	 
		@Id
    	@Column(name = "id")
		private Integer id;
		@Column(name = "username")
		private String username;
		@Column(name = "password")
		private String password;  	    
		@Column(name = "status")
		private String status; 
		
		
		    	    
	    public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
	    
	    public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
	        return password;
	    }
	 
	    public void setPassword(String password) {
	        this.password = password;
	    }

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			
			return "User"+this.getUsername();
		}
		
		
		
}
