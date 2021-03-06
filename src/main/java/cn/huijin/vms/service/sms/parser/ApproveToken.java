package cn.huijin.vms.service.sms.parser;

public class ApproveToken implements Token {
	/**
	 * 外出申请ID
	 */
	private Long leaveId;

	/**
	 * 是否同意
	 */
	private Boolean agree;

	public ApproveToken() {

	}

	public ApproveToken(Long leaveId, Boolean agree) {
		super();
		this.leaveId = leaveId;
		this.agree = agree;
	}

	public Long getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Long leaveId) {
		this.leaveId = leaveId;
	}

	public Boolean getAgree() {
		return agree;
	}

	public void setAgree(Boolean agree) {
		this.agree = agree;
	}

}
