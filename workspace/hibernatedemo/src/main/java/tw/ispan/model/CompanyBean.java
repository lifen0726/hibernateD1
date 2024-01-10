package tw.ispan.model;

public class CompanyBean {

	
	private Integer companyId;
	
	private String companyName;
	
	public CompanyBean() {
		
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public CompanyBean(Integer companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}

	

}
