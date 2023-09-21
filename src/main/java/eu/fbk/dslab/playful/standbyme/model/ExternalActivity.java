package eu.fbk.dslab.playful.standbyme.model;

import java.util.ArrayList;
import java.util.List;

public class ExternalActivity {
	public static enum Type {
		individual, group 
	};
	
	public static enum Tool {
		computer 
	};
	
	public static enum Difficulty {
		low, moderate, high 
	};
	
	private String domainId;	
	private String title;
	private String desc;
	private String language;
	private String extId;
	private String extGroupId;
	private String extUrl;
	private Type type;
	private Tool tool;
	private Difficulty difficulty;
	private String groupCorrelator;
	private List<String> preconditions = new ArrayList<>();
	private List<String> effects = new ArrayList<>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getExtUrl() {
		return extUrl;
	}

	public void setExtUrl(String extUrl) {
		this.extUrl = extUrl;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public List<String> getPreconditions() {
		return preconditions;
	}

	public void setPreconditions(List<String> preconditions) {
		this.preconditions = preconditions;
	}

	public List<String> getEffects() {
		return effects;
	}

	public void setEffects(List<String> effects) {
		this.effects = effects;
	}

	public String getExtId() {
		return extId;
	}

	public void setExtId(String extId) {
		this.extId = extId;
	}

	public String getExtGroupId() {
		return extGroupId;
	}

	public void setExtGroupId(String extGroupId) {
		this.extGroupId = extGroupId;
	}

	public String getGroupCorrelator() {
		return groupCorrelator;
	}

	public void setGroupCorrelator(String groupCorrelator) {
		this.groupCorrelator = groupCorrelator;
	}



}
