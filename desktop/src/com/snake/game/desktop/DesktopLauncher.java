package com.snake.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.snake.game.SnakeGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = SnakeGame.WIDTH;
		config.height = SnakeGame.HEIGHT;
		config.title = SnakeGame.TITLE;
		config.addIcon("SnakeTag.png", Files.FileType.Internal);
        config.addIcon("SnakeTag1.png", Files.FileType.Internal);
        config.addIcon("SnakeTag2.png", Files.FileType.Internal);
        config.addIcon("SnakeTag3.png", Files.FileType.Internal);
        config.addIcon("SnakeTag4.png", Files.FileType.Internal);
		new LwjglApplication( new SnakeGame(), config);

	}
}
