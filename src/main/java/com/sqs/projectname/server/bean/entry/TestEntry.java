package com.sqs.projectname.server.bean.entry;

/**
 * 
 * TestEntry
 * 
 * @author songqingshan
 * @date 2016年7月1日 下午3:41:15
 *
 */
public class TestEntry {

	private String id;

	private String text;

	private String name;

	private String createTime;

	private String updateTime;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
