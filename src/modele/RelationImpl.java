package modele;

import java.util.List;

public class RelationImpl implements Relation {

	private int arity;

	private List<Entity> entities;
	
	//
	// Getters and setters
	//
	
	public int getArity() {
		return arity;
	}

	public void setArity(int arity) {
		this.arity = arity;
	}

	public List<Entity> getEntities() {
		return entities;
	}

	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}
}
