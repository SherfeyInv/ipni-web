package org.ipni.search;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.ipni.constants.FieldMapping;

public class SortQuery extends QueryOption {

	@Override
	public void addQueryOption(String key, String value, SolrQuery query) {
		switch(value){
		case "name_asc":
			query.setSort("sortable", ORDER.asc);
			break;
		case "name_desc":
			query.setSort("sortable", ORDER.desc);
			break;
		case "published_asc":
			query.setSort(FieldMapping.yearPublished.solrField(), ORDER.asc);
			break;
		case "published_desc":
			query.setSort(FieldMapping.yearPublished.solrField(), ORDER.desc);
			break;
		}
	}
}
