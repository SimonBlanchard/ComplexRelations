package graphs;

import modele.BinaryRelation;

/**
 * Représentation des relations binaires sous forme de graphe :
 * les entités constituent les noeuds et une arête indique l'existence d'une relation entre deux entités.
 * @author Simon
 *
 */
public interface RelationGraph {

	public void addRelation(BinaryRelation binaryRelation);
}
