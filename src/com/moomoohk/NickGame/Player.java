package com.moomoohk.NickGame;

import java.awt.Color;

import com.moomoohk.Grame.Essentials.GrameManager;
import com.moomoohk.Grame.Interfaces.GrameObject;

public class Player extends GrameObject
{
	public Player(String name, int speed, Color color, boolean paused)
	{
		super(name, speed, color, paused);
	}

	@Override
	public boolean isCollidable()
	{
		return true;
	}

	@Override
	public void tick(int bID)
	{
		if (GrameManager.dir1 != null && GrameManager.findBase(bID).isInBase(getPos(bID).addDir(GrameManager.dir1)))
			setPos(bID, getPos(bID).addDir(GrameManager.dir1));
	}

	@Override
	public void consume(GrameObject go)
	{

	}
}
