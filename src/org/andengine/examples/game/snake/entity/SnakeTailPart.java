package org.andengine.examples.game.snake.entity;

import org.andengine.opengl.texture.region.ITextureRegion;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 17:44:59 - 09.07.2010
 */
public class SnakeTailPart extends CellEntity {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public SnakeTailPart(final SnakeHead pSnakeHead, final ITextureRegion pTextureRegion) {
		this(pSnakeHead.mCellX, pSnakeHead.mCellY, pTextureRegion);
	}

	public SnakeTailPart(final int pCellX, final int pCellY, final ITextureRegion pTextureRegion) {
		super(pCellX, pCellY, CELL_WIDTH, CELL_HEIGHT, pTextureRegion);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	protected SnakeTailPart deepCopy() {
		return new SnakeTailPart(this.mCellX, this.mCellY, this.getTextureRegion());
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
