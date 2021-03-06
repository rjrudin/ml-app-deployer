package com.marklogic.mgmt.api.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class GeospatialPathIndex extends GeospatialIndex {

	@XmlElement(name = "path-expression")
	private String pathExpression;

	@XmlElement(name = "point-format")
	private String pointFormat;

	public String getPathExpression() {
		return pathExpression;
	}

	public void setPathExpression(String pathExpression) {
		this.pathExpression = pathExpression;
	}

	public String getPointFormat() {
		return pointFormat;
	}

	public void setPointFormat(String pointFormat) {
		this.pointFormat = pointFormat;
	}
}
