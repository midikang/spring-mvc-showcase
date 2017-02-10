package org.springframework.samples.mvc.midi;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Zone {

	private String name = "A";
	private String description="Regular zone";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Zone {name=[" + name + "], description=[" + description + "]}";
	}
}
