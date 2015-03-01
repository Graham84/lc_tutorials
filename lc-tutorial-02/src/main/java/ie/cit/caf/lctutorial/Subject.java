package ie.cit.caf.lctutorial;

import java.util.List;

public class Subject {
private int id;
	
	private String name;
	
	private List<Subject> children;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subject> getChildren() {
		return children;
	}

	public void setChildren(List<Subject> children) {
		this.children = children;
	}

	public boolean isNamedIndividuals() {
		return this.name.equals("named individuals") ? true : false;
	}

}
