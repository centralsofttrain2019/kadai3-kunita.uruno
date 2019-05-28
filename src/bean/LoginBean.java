package bean;

import java.io.Serializable;
import java.time.LocalDateTime;

public class LoginBean implements Serializable
{
	private static final long serialVersionUID = 1L;

	private 	String	employeeName	;//	VARCHAR(100),
	private String userId;
	private LocalDateTime loginDateTime;
	private int errorC;
	private int count;

	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getErrorC() {
		return errorC;
	}


	public void setErrorC(int errorC) {
		this.errorC = errorC;
	}


	public String getLoginInfo()
	{
		return "userName:" + this.getEmployeeName()
				+ " login at:" + this.getLoginDateTime().toString();
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public LocalDateTime getLoginDateTime() {
		return loginDateTime;
	}
	public void setLoginDateTime(LocalDateTime loginDateTime) {
		this.loginDateTime = loginDateTime;
	}
}
