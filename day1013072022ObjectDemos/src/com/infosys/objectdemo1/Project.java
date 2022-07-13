package com.infosys.objectdemo1;

public class Project {
private int projId;
private String name;
private String technology;


public Project() {
	projId=0;
	name="No Project";
	technology="Not Decided";
	
}
public Project(int projId, String name, String technology) {
	
	this.projId = projId;
	this.name = name;
	this.technology = technology;
}

@Override  // Annotations ( Annotations metadata )
// hashCode method here is an overridden method
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + projId;
	result = prime * result + ((technology == null) ? 0 : technology.hashCode());
	return result;
}
@Override
// equals is an overridden method
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (getClass() != obj.getClass()) {
		return false;
	}
	Project other = (Project) obj;
	if (name == null) {
		if (other.name != null) {
			return false;
		}
	} else if (!name.equals(other.name)) {
		return false;
	}
	if (projId != other.projId) {
		return false;
	}
	if (technology == null) {
		if (other.technology != null) {
			return false;
		}
	} else if (!technology.equals(other.technology)) {
		return false;
	}
	return true;
}
public int getProjId() {
	return projId;
}
public void setProjId(int projId) {
	this.projId = projId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}


}
