package DivisionGame.DivisionEasy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.snake.game.SnakeGame;

import AdditionGame.Easy.AdditionGameEasy;
import sprites.Bodypart;

public class DivisionScreenEasy implements Screen {
    private OrthographicCamera camera = new OrthographicCamera(SnakeGame.WIDTH, SnakeGame.HEIGHT);
    private Viewport viewport;
    private SnakeGame snakeGame;
    private DivisionGameEasy gameState ;
    public static Texture background;
    private SpriteBatch sb;
    private Bodypart bodypart;


    public DivisionScreenEasy(SnakeGame snakeGame) {
        this.snakeGame = snakeGame;
        gameState = new DivisionGameEasy(snakeGame);
        camera.setToOrtho(false, SnakeGame.WIDTH, SnakeGame.HEIGHT);
        viewport = new FitViewport(SnakeGame.WIDTH, SnakeGame.HEIGHT, camera);
        viewport.apply();
        loadTextures();
    }
    private void loadTextures() {
        background = new Texture("background.png");}

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        gameState.update(delta, viewport);
        camera.update ();
        viewport.apply ();
        Gdx.gl.glClear (GL20.GL_COLOR_BUFFER_BIT);
        gameState.draw(SnakeGame.WIDTH, SnakeGame.HEIGHT, camera);

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
