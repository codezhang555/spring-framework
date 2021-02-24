package com.itz;

/**
 * @PackageName: com.itz
 * @ClassName: User
 * @Author: codeZhang
 * @DateTime: 2021/2/23 13:49
 * @Version 1.0
 */
public class User {
	private String id;
	private String userName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User() {
	}

	public User(String id, String userName) {
		this.id = id;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}
