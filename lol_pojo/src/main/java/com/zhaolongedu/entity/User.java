package com.zhaolongedu.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
		private long userId;
		private String userName;
		private String gender;
		private String cellphone;
		public User() {}
		public User(String userName,String gender, String cellphone) {
			this.userName =userName;
			this.gender =gender;
			this.cellphone =cellphone;
			
		}
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getCellphone() {
			return cellphone;
		}
		public void setCellphone(String cellphone) {
			this.cellphone = cellphone;
		}
		
}
