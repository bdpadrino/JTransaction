package sys.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Transaction {
	
	@Id
    @Column(name = "transaction_id")
    private Integer transaction_id;
	@Column(name = "transaction_type")
    private String  transaction_type;
	@Column(name = "model")
    private String  model;
	@Column(name = "serial")
    private String  serial;
	@Column(name = "iso")
    private String  iso ;
	@Column(name = "pan")
    private String  pan;
	@Column(name = "card_holder")
    private String  card_holder;                                             //NOMBRE TEJETAHABIENTE
	@Column(name = "issuer")
	private String  issuer;                                                 //EMISOR "VISA"
	@Column(name = "description")
	private String  description;                                            //DATOS PROPIOS DE LA Transaction
	@Column(name = "acquirer")
	private String  acquirer;                                               //ID_BANCO
	@Column(name = "merchant")
	private String  merchant;         										//NOMBRE DEL COMERCIO
	@Column(name = "merchant_id")
    private Integer merchant_id;                                            //ID DEL COMERCIO
    
    public Transaction(){

    }

    public Transaction(Integer transaction_id, String transaction_type, String model, String serial, String iso, String pan, String card_holder, String issuer, String description, String acquirer, String merchant, Integer merchant_id) {
        this.transaction_id = transaction_id;
        this.transaction_type = transaction_type;
        this.model = model;
        this.serial = serial;
        this.iso = iso;
        this.pan = pan;
        this.card_holder = card_holder;
        this.issuer = issuer;
        this.description = description;
        this.acquirer = acquirer;
        this.merchant = merchant;
        this.merchant_id = merchant_id;
    }

    public Integer getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Integer transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCard_holder() {
        return card_holder;
    }

    public void setCard_holder(String card_holder) {
        this.card_holder = card_holder;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAcquirer() {
        return acquirer;
    }

    public void setAcquirer(String acquirer) {
        this.acquirer = acquirer;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public Integer getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(Integer merchant_id) {
        this.merchant_id = merchant_id;
    }
	
	
	
}