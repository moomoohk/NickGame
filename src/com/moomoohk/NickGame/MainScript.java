package com.moomoohk.NickGame;

import java.awt.Color;

import com.moomoohk.Grame.Essentials.Base;
import com.moomoohk.Grame.Essentials.Coordinates;
import com.moomoohk.Grame.Essentials.GrameUtils;
import com.moomoohk.Grame.Graphics.RenderManager;

public class MainScript
{
	public static void main(String[] args)
	{
		GrameUtils.loadBasicCommands();
		Base b = new Base(20, 20);
		RenderManager.render(b.ID);
		RenderManager.setVisible(true);

		Player p = new Player("player", 5, Color.green, false);
		b.addGrameObject(p, new Coordinates(10, 10));
	}
}
