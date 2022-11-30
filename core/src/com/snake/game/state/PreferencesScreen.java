package com.snake.game.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Event;

import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.snake.game.SnakeGame;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.Preferences;


import java.awt.Checkbox;

public class PreferencesScreen implements Screen, InputProcessor {

    private SnakeGame snakeGame;
    private Stage stage;
    private OrthographicCamera camera = new OrthographicCamera(SnakeGame.WIDTH, SnakeGame.HEIGHT);
    private Texture background;
    private Label titleLabel, volumeMusicLabel, volumeSoundLabel, musicOnOffLabel, soundOnOffLabel;
    private Slider soundMusicSlider, volumeMusicSlider;
    private Checkbox soundEffectsCheckbox;
    private Button backButton;
    private Preferences prefs;
    private SpriteBatch batch;
    private Sprite backButtonSprite;
    private Texture back;
    private Sound buttonSound;


    public PreferencesScreen(SnakeGame snakeGame) {
        this.snakeGame = snakeGame;

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);

        Preferences prefs = Gdx.app.getPreferences("settings.prefs");
        camera.setToOrtho(false, SnakeGame.WIDTH, SnakeGame.HEIGHT);
        buttonSound = Gdx.audio.newSound(Gdx.files.internal("buttonSound.mp3"));
    }

    @Override
    public void show() {

        batch = new SpriteBatch();
        background = new Texture("SettingsBG.JPEG");

        back = new Texture("return.PNG");
        backButtonSprite = new Sprite(back);
        backButtonSprite.setSize(60, 60);
        backButtonSprite.setPosition(70, 700);

        Table table = new Table();
        table.setFillParent(true);
        table.setDebug(true);
        stage.addActor(table);
        Skin skin = new Skin(Gdx.files.internal("skin/uiskin.json"));

        final Slider volumeMusicSlider = new Slider(0f, 1f, 0.1f, false, skin);
        volumeMusicSlider.setValue(this.snakeGame.getPreferences().getMusicVolume());
        volumeMusicSlider.addListener(new EventListener() {
            @Override
            public boolean handle(Event event) {
                return false;
            }
        });
        final CheckBox musicCheckbox = new CheckBox(null, skin);
        musicCheckbox.setChecked(this.snakeGame.getPreferences().isMusicEnabled());
        musicCheckbox.addListener(new EventListener() {
            @Override
            public boolean handle(Event event) {
                boolean enabled = musicCheckbox.isChecked();
                PreferencesScreen.this.snakeGame.getPreferences().setMusicEnabled(enabled);
                return false;
            }
        });
        final Slider soundMusicSlider = new Slider(0f, 1f, 0.1f, false, skin);
        soundMusicSlider.setValue(this.snakeGame.getPreferences().getSoundVolume());
        soundMusicSlider.addListener(new EventListener() {
            @Override
            public boolean handle(Event event) {
                return false;
            }
        });
        final CheckBox soundEffectsCheckbox = new CheckBox(null, skin);
        soundEffectsCheckbox.setChecked(this.snakeGame.getPreferences().isSoundEffectsEnabled());
        soundEffectsCheckbox.addListener(new EventListener() {
            @Override
            public boolean handle(Event event) {
                return false;
            }
        });

        volumeMusicLabel = new Label(null, skin);
        volumeSoundLabel = new Label(null, skin);
        musicOnOffLabel = new Label(null, skin);
        soundOnOffLabel = new Label(null, skin);

        table.add(musicOnOffLabel);
        table.add(musicCheckbox).padTop(100).padLeft(150).width(40).height(40);
        table.row();

        table.add(volumeMusicLabel);
        table.add(volumeMusicSlider).padTop(30).width(230);
        table.row();

        table.add(soundOnOffLabel);
        table.add(soundEffectsCheckbox).padTop(60).padLeft(150).width(40).height(40);
        table.row();


        table.add(volumeSoundLabel);
        table.add(soundMusicSlider).padTop(30).width(230);
        table.row();


        table.add(backButton);
        //  stage.clear();

        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render(float delta) {
        //   batch.setProjectionMatrix(camera.combined);
        // clear the screen ready for next set of images to be drawn
        Gdx.gl.glClearColor(0f, 0f, 0f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(background, 0, 0, SnakeGame.WIDTH, SnakeGame.HEIGHT);
        backButtonSprite.draw(batch);
        batch.end();

        // tell our stage to do actions and draw itself
        stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
        stage.draw();
    }

    private void sound() { buttonSound.play(0.3f); }

    @Override
    public void resize(int width, int height) {
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
        background.dispose();
        back.dispose();
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        float pointerX = getCursorToModelX(Gdx.graphics.getWidth(), screenX);
        float pointerY = getCursorToModelY(Gdx.graphics.getHeight(), screenY);
        if (backButtonSprite.getBoundingRectangle().contains(pointerX, pointerY)) {
            sound();
            snakeGame.setScreen(new ActionScreen(snakeGame));
        }
        return true;
    }

    @Override
    public boolean touchDragged ( int screenX, int screenY, int pointer){
        return false;
    }

    @Override
    public boolean mouseMoved ( int screenX, int screenY){
        return false;
    }

    @Override
    public boolean scrolled ( int amount){
        return false;
    }
    private float getCursorToModelX ( int screenX, int cursorX)
    {
        return (((float) cursorX) * SnakeGame.WIDTH) / ((float) screenX);
    }

    private float getCursorToModelY ( int screenY, int cursorY)
    {
        return ((float) (screenY - cursorY)) * SnakeGame.HEIGHT / ((float) screenY);
    }
}

