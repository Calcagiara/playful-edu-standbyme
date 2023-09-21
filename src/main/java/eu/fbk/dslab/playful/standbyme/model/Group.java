package eu.fbk.dslab.playful.standbyme.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private String domainId;
	private String extId;
	private String name;
	private List<String> learners = new ArrayList<>();
	
	public String getDomainId() {
		return domainId;
	}
	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}
	public String getExtId() {
		return extId;
	}
	public void setExtId(String extId) {
		this.extId = extId;
	}
	public List<String> getLearners() {
		return learners;
	}
	public void setLearners(List<String> learners) {
		this.learners = learners;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
