package Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PojoPractice {
	
	@SerializedName("employee_name")
	@Expose
	private String employeeName;
	@SerializedName("employee_salary")
	@Expose
	private String employeeSalary;
	@SerializedName("employee_age")
	@Expose
	private String employeeAge;
	@SerializedName("profile_image")
	@Expose
	private String profileImage;
	
	private String status;
	
	private String message;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEmployeeName() {
	return employeeName;
	}
	public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
	}
	public String getEmployeeSalary() {
	return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
	this.employeeSalary = employeeSalary;
	}
	public String getEmployeeAge() {
	return employeeAge;
	}
	public void setEmployeeAge(String employeeAge) {
	this.employeeAge = employeeAge;
	}
	public String getProfileImage() {
	return profileImage;
	}
	public void setProfileImage(String profileImage) {
	this.profileImage = profileImage;
	}
	public PojoPractice(String employeeName, String employeeSalary, String employeeAge, String profileImage) {
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAge = employeeAge;
		this.profileImage = profileImage;
	}
	public PojoPractice() {

	}
	@Override
	public String toString() {
		return "PojoPractice [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + ", employeeAge="
				+ employeeAge + ", profileImage=" + profileImage + "]";
	}

}