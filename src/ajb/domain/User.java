package ajb.domain;

public class User {
	private Integer id;
	private String carnumber;
	private String upassword;
	private Integer uquestionId;
	private String uanswer;
	private Float umoney;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public Integer getUquestionId() {
		return uquestionId;
	}
	public void setUquestionId(Integer uquestionId) {
		this.uquestionId = uquestionId;
	}
	public String getUanswer() {
		return uanswer;
	}
	public void setUanswer(String uanswer) {
		this.uanswer = uanswer;
	}
	public Float getUmoney() {
		return umoney;
	}
	public void setUmoney(Float umoney) {
		this.umoney = umoney;
	}
	
}
