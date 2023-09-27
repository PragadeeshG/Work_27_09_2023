package com.test1;

public class AuthenticationMethodCertificate {
	private Integer authId;
	private String certFileName;
	private String certFileType;
	private String certPath;
	private String passCode;
	private String truststorePass;
	private String certKey;
	private String certKeyAlias;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AuthenticationMethodCertificate() {

	}

	public AuthenticationMethodCertificate(Integer authId, String certFileName, String certFileType, String certPath,
			String passCode, String truststorePass, String certKey, String certKeyAlias, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.authId = authId;
		this.certFileName = certFileName;
		this.certFileType = certFileType;
		this.certPath = certPath;
		this.passCode = passCode;
		this.truststorePass = truststorePass;
		this.certKey = certKey;
		this.certKeyAlias = certKeyAlias;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getAuthId() {
		return authId;
	}

	public void setAuthId(Integer authId) {
		this.authId = authId;
	}

	public String getCertFileName() {
		return certFileName;
	}

	public void setCertFileName(String certFileName) {
		this.certFileName = certFileName;
	}

	public String getCertFileType() {
		return certFileType;
	}

	public void setCertFileType(String certFileType) {
		this.certFileType = certFileType;
	}

	public String getCertPath() {
		return certPath;
	}

	public void setCertPath(String certPath) {
		this.certPath = certPath;
	}

	public String getPassCode() {
		return passCode;
	}

	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}

	public String getTruststorePass() {
		return truststorePass;
	}

	public void setTruststorePass(String truststorePass) {
		this.truststorePass = truststorePass;
	}

	public String getCertKey() {
		return certKey;
	}

	public void setCertKey(String certKey) {
		this.certKey = certKey;
	}

	public String getCertKeyAlias() {
		return certKeyAlias;
	}

	public void setCertKeyAlias(String certKeyAlias) {
		this.certKeyAlias = certKeyAlias;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
