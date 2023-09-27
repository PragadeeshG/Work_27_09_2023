package com.test1;

public class AuthenticationMethod {
	private Integer authId;
	private String authMethod;
	private Boolean isJwMethod;
	private String jwtSubject;
	private String issuer;
	private String audience;
	private Long issuedAt;
	private String userId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AuthenticationMethod() {

	}

	public AuthenticationMethod(Integer authId, String authMethod, Boolean isJwMethod, String jwtSubject, String issuer,
			String audience, Long issuedAt, String userId, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.authId = authId;
		this.authMethod = authMethod;
		this.isJwMethod = isJwMethod;
		this.jwtSubject = jwtSubject;
		this.issuer = issuer;
		this.audience = audience;
		this.issuedAt = issuedAt;
		this.userId = userId;
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

	public String getAuthMethod() {
		return authMethod;
	}

	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
	}

	public Boolean getIsJwMethod() {
		return isJwMethod;
	}

	public void setIsJwMethod(Boolean isJwMethod) {
		this.isJwMethod = isJwMethod;
	}

	public String getJwtSubject() {
		return jwtSubject;
	}

	public void setJwtSubject(String jwtSubject) {
		this.jwtSubject = jwtSubject;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getAudience() {
		return audience;
	}

	public void setAudience(String audience) {
		this.audience = audience;
	}

	public Long getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(Long issuedAt) {
		this.issuedAt = issuedAt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
