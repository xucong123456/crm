package com.zr.model;

public class User {
		private int uid;
		private String  uname;
		private int uage;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		
		public int getUage() {
			return uage;
		}
		public void setUage(int uage) {
			this.uage = uage;
		}
		
		public User(int uid, String uname, int uage) {
			super();
			this.uid = uid;
			this.uname = uname;
			this.uage = uage;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
