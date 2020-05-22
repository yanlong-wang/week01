package com.wangyanlong.beans;

public class Info {
    //晒被id
	private int i_id;
	//宿舍房间号
	private String i_name;
	private String i_uptime;
	private int i_status;
	
	private int t_id;	
	private String t_name;

	public int getI_id() {
		return i_id;
	}

	public void setI_id(int i_id) {
		this.i_id = i_id;
	}

	public String getI_name() {
		return i_name;
	}

	public void setI_name(String i_name) {
		this.i_name = i_name;
	}

	public String getI_uptime() {
		return i_uptime;
	}

	public void setI_uptime(String i_uptime) {
		this.i_uptime = i_uptime;
	}

	public int getI_status() {
		return i_status;
	}

	public void setI_status(int i_status) {
		this.i_status = i_status;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	@Override
	public String toString() {
		return "Info [i_id=" + i_id + ", i_name=" + i_name + ", i_uptime=" + i_uptime + ", i_status=" + i_status
				+ ", t_id=" + t_id + ", t_name=" + t_name + "]";
	}
	
	
}
