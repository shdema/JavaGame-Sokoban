package commands;

import levels.MovableItem;
import levels.Position;

/**
 * General Policy Interface.
 * @author shdema
 *
 */
public interface Policy {
	public boolean canMove(MovableItem mi, Position p);
}
