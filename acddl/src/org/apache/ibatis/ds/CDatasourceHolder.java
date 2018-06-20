package org.apache.ibatis.ds;

public class CDatasourceHolder {
	private static final ThreadLocal<Integer> holder = new ThreadLocal<Integer>();
	private static final CDatasourceHolder _this = new CDatasourceHolder();

	public static CDatasourceHolder instance() {
		return _this;
	}

	public void setRoutingIndex(int index) {
		holder.set(Integer.valueOf(index));
	}

	public Integer getRoutingIndex() {
		return (Integer) holder.get();
	}
}
