package com.zero.es.strategy;

public class Field {
	
	public static final int TYPE_ORIGINAL = 1001;
	public static final int TYPE_DERIVE = 1002;
	
	private int type;
	
	private String indexName;
	private String typeName;
	
	private String name;
	private String value;
	
	public static final int USED_MATCHING = 2001;
	public static final int USED_FILTER = 2002;
	public static final int USED_SORT = 2003;
	public static final int USED_RATE = 2004;
	public static final int USED_CONDATION = 2005;
	
	private int used;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}
	
	
	
}
