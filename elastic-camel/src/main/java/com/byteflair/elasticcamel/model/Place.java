package com.byteflair.elasticcamel.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Place implements Serializable {
	private static final long serialVersionUID = -4689239544560987974L;

	private Long id;
	private String name;
	private String type;
	private BigDecimal lat;
	private BigDecimal lng;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getLat() {
		return lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLng() {
		return lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}
}