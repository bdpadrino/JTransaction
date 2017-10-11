package sys.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sys.dao.TransactionDao;
import sys.dao.imp.TransactionDaoImp;
import sys.model.Transaction;

import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class TransactionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	TransactionDao ct = new TransactionDaoImp();    
	
	private Transaction transaction;  
	private List<Transaction> listTransactions;
	
	
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public List<Transaction> getListTransactions() {
		listTransactions = ct.listTransactions();
		return listTransactions;
	}
	public void setListTransactions(List<Transaction> listTransactions) {
		this.listTransactions = listTransactions;
	} 
	
	
	
}