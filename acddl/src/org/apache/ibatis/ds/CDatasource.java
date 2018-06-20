package org.apache.ibatis.ds;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class CDatasource extends AbstractRoutingDataSource {
	protected Object determineCurrentLookupKey() {
		return CDatasourceHolder.instance().getRoutingIndex();
	}
}
