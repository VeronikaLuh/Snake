package sprites.Addition;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.snake.game.SnakeGame;

import sprites.Exmaple;

import static game.EasyLevel.GameState.scaleSnake;


public class EasyNumbersAddition {
    private int x;
    private int y;

    private Texture texture;
    private Texture texture1;
    private Texture texture2;
    private Texture texture3;
    private Texture texture4;
    private Texture texture5;
    private Texture texture6;
    private Texture texture7;
    private Texture texture8;
    private Texture texture9;
    private Texture texture10;
    private Texture texture11;
    private Texture texture12;
    private Texture texture13;
    private Texture texture14;
    private Texture texture15;
    private Texture texture16;
    private SpriteBatch batch;
    private OrthographicCamera camera = new OrthographicCamera(SnakeGame.WIDTH, SnakeGame.HEIGHT);
    int NumberQuestion = 0;

    private TextureRegion[] regions = new TextureRegion[40];
    private TextureRegion[] wrongs = new TextureRegion[28];
    private TextureRegion region ;
    public EasyNumbersAddition(int boardSize, int NumberQuestion){
        x = MathUtils.random(boardSize-16);
        y = MathUtils.random(boardSize-16);
        camera.setToOrtho(false, SnakeGame.WIDTH, SnakeGame.HEIGHT);
        texture = new Texture(Gdx.files.internal("foods-sheeps.png"));
        texture2 = new Texture(Gdx.files.internal("nine_twelve.png"));
        texture3 = new Texture(Gdx.files.internal("fifteen_twenty.png"));
        texture1 = new Texture(Gdx.files.internal("five_eight.png"));
        texture4 = new Texture(Gdx.files.internal("twentyone_twentyseven.png"));
        texture5 = new Texture(Gdx.files.internal("twentyeight_thirtyfour.png"));
        texture6 = new Texture(Gdx.files.internal("thirtyfive_fourtytwo.png"));
        texture7 = new Texture(Gdx.files.internal("fourtyfive_fifty.png"));
        texture8 = new Texture(Gdx.files.internal("fiftyfour_sixtyfour.png"));
        texture9 = new Texture(Gdx.files.internal("seventy_eightyone.png"));

        batch = new SpriteBatch();
        regions[0] = new TextureRegion(texture, 0, 0, 64, 64);		// #3
        regions[1] = new TextureRegion(texture, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[2] = new TextureRegion(texture, 0, 63, 64, 64);		// #5
        regions[3] = new TextureRegion(texture, 0.5f, 0.5f, 1f, 1f);
        regions[4] = new TextureRegion(texture1, 0, 0, 64, 64);		// #3
        regions[5] = new TextureRegion(texture1, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[6] = new TextureRegion(texture1, 0, 62, 64, 64);		// #5
        regions[7] = new TextureRegion(texture1, 0.5f, 0.5f, 1f, 1f);
        regions[8] = new TextureRegion(texture2, 0, 0, 64, 64);		// #3
        regions[9] = new TextureRegion(texture2, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[10] = new TextureRegion(texture2, 0, 63, 64, 64);		// #5
        regions[11] = new TextureRegion(texture2, 0.5f, 0.5f, 1f, 1f);
        regions[12] = new TextureRegion(texture3, 0, 0, 64, 64);		// #3
        regions[13] = new TextureRegion(texture3, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[14] = new TextureRegion(texture3, 0, 63, 64, 64);		// #5
        regions[15] = new TextureRegion(texture3, 0.5f, 0.5f, 1f, 1f);
        regions[16] = new TextureRegion(texture4, 0, 0, 64, 64);		// #3
        regions[17] = new TextureRegion(texture4, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[18] = new TextureRegion(texture4, 0, 63, 64, 64);		// #5
        regions[19] = new TextureRegion(texture4, 0.5f, 0.5f, 1f, 1f);
        regions[20] = new TextureRegion(texture5, 0, 0, 64, 64);		// #3
        regions[21] = new TextureRegion(texture5, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[22] = new TextureRegion(texture5, 0, 63, 64, 64);		// #5
        regions[23] = new TextureRegion(texture5, 0.5f, 0.5f, 1f, 1f);
        regions[24] = new TextureRegion(texture6, 0, 0, 64, 64);		// #3
        regions[25] = new TextureRegion(texture6, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[26] = new TextureRegion(texture6, 0, 63, 64, 64);		// #5
        regions[27] = new TextureRegion(texture6, 0.5f, 0.5f, 1f, 1f);
        regions[28] = new TextureRegion(texture7, 0, 0, 64, 64);		// #3
        regions[29] = new TextureRegion(texture7, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[30] = new TextureRegion(texture7, 0, 63, 64, 64);		// #5
        regions[31] = new TextureRegion(texture7, 0.5f, 0.5f, 1f, 1f);
        regions[32] = new TextureRegion(texture8, 0, 0, 64, 64);		// #3
        regions[33] = new TextureRegion(texture8, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[34] = new TextureRegion(texture8, 0, 63, 64, 64);		// #5
        regions[35] = new TextureRegion(texture8, 0.5f, 0.5f, 1f, 1f);
        regions[36] = new TextureRegion(texture9, 0, 0, 64, 64);		// #3
        regions[37] = new TextureRegion(texture9, 0.5f, 0f, 1f, 0.5f);	// #4
        regions[38] = new TextureRegion(texture9, 0, 63, 64, 64);		// #5
        regions[39] = new TextureRegion(texture9, 0.5f, 0.5f, 1f, 1f);
        texture10 = new Texture(Gdx.files.internal("thirteen_twentnine.png"));
        texture11 = new Texture(Gdx.files.internal("seventeen_thirtythree.png"));
        texture12 = new Texture(Gdx.files.internal("thirtyfive_fourtytwo.png"));
        texture13 = new Texture(Gdx.files.internal("fortythree_fiftythree.png"));
        texture14 = new Texture(Gdx.files.internal("fiftyfive_sixtytwo.png"));
        texture15 = new Texture(Gdx.files.internal("sixtyfive_sevenfive.png"));
        texture16 = new Texture(Gdx.files.internal("seventynine_hundred.png"));
        wrongs[0] = new TextureRegion(texture10, 0, 0, 64, 64);		// #3
        wrongs[1] = new TextureRegion(texture10, 0.5f, 0f, 1f, 0.5f);	// #4
        wrongs[2] = new TextureRegion(texture10, 0, 63, 64, 64);		// #5
        wrongs[3] = new TextureRegion(texture10, 0.5f, 0.5f, 1f, 1f);
        wrongs[4] = new TextureRegion(texture11, 0, 0, 64, 64);		// #3
        wrongs[5] = new TextureRegion(texture11, 0.5f, 0f, 1f, 0.5f);	// #4
        wrongs[6] = new TextureRegion(texture11, 0, 63, 64, 64);		// #5
        wrongs[7] = new TextureRegion(texture11, 0.5f, 0.5f, 1f, 1f);
        wrongs[8] = new TextureRegion(texture12, 0, 0, 64, 64);		// #3
        wrongs[9] = new TextureRegion(texture12, 0.5f, 0f, 1f, 0.5f);	// #4
        wrongs[10] = new TextureRegion(texture12, 0, 63, 64, 64);		// #5
        wrongs[11] = new TextureRegion(texture12, 0.5f, 0.5f, 1f, 1f);
        wrongs[12] = new TextureRegion(texture13, 0, 0, 64, 64);		// #3
        wrongs[13] = new TextureRegion(texture13, 0.5f, 0f, 1f, 0.5f);	// #4
        wrongs[14] = new TextureRegion(texture13, 0, 63, 64, 64);		// #5
        wrongs[15] = new TextureRegion(texture13, 0.5f, 0.5f, 1f, 1f);
        wrongs[16] = new TextureRegion(texture14, 0, 0, 64, 64);		// #3
        wrongs[17] = new TextureRegion(texture14, 0.5f, 0f, 1f, 0.5f);	// #4
        wrongs[18] = new TextureRegion(texture14, 0, 63, 64, 64);		// #5
        wrongs[19] = new TextureRegion(texture14, 0.5f, 0.5f, 1f, 1f);
        wrongs[20] = new TextureRegion(texture15, 0, 0, 64, 64);		// #3
        wrongs[21] = new TextureRegion(texture15, 0.5f, 0f, 1f, 0.5f);	// #4
        wrongs[22] = new TextureRegion(texture15, 0, 63, 64, 64);		// #5
        wrongs[23] = new TextureRegion(texture15, 0.5f, 0.5f, 1f, 1f);
        wrongs[24] = new TextureRegion(texture16, 0, 0, 64, 64);		// #3
        wrongs[25] = new TextureRegion(texture16, 0.5f, 0f, 1f, 0.5f);	// #4
        wrongs[26] = new TextureRegion(texture16, 0, 63, 64, 64);		// #5
        wrongs[27] = new TextureRegion(texture16, 0.5f, 0.5f, 1f, 1f);


        if(NumberQuestion == 0){

        region = (wrongs[(int) MathUtils.random(2, wrongs.length-1)]);}
        if(NumberQuestion == 1){
            region = regions[1];
            Exmaple.example[0].setText("1+1");
        }
          if(NumberQuestion == 2){
            region = regions[8];
              Exmaple.example[0].setText("5+4");
          }
        if(NumberQuestion == 3){
            region = regions[4];
            Exmaple.example[0].setText("3+2");
        }
        if(NumberQuestion == 4){
            region = regions[12];
            Exmaple.example[0].setText("6+9");
        }
        if(NumberQuestion == 5){
            region = regions[7];
            Exmaple.example[0].setText("4+4");
        }
        if(NumberQuestion == 6){
            region = regions[9];
            Exmaple.example[0].setText("3+7");
        }
        if(NumberQuestion == 7){
            region = regions[10];
            Exmaple.example[0].setText("8+4");
        }
        if(NumberQuestion == 8){
            region = regions[5];
            Exmaple.example[0].setText("1+5");
        }
        if(NumberQuestion == 9){
            region = regions[7];
            Exmaple.example[0].setText("7+1");
        }
        if(NumberQuestion == 10){
            region = regions[3];
            Exmaple.example[0].setText("2+2");
        }
        if(NumberQuestion == 11){
            region = regions[6];
            Exmaple.example[0].setText("5+2");
        }
        if(NumberQuestion == 12){
            region = regions[9];
            Exmaple.example[0].setText("9+1");
        }
        if(NumberQuestion == 13){
            region = regions[7];
            Exmaple.example[0].setText("5+3");
        }
        if(NumberQuestion == 14){
            region = regions[9];
            Exmaple.example[0].setText("6+4");
        }
        if(NumberQuestion == 15){
            region = regions[10];
            Exmaple.example[0].setText("3+9");
        }
        if(NumberQuestion == 16){
            region = regions[8];
            Exmaple.example[0].setText("6+3");
        }
        if(NumberQuestion == 17){
            region = regions[5];
            Exmaple.example[0].setText("2+4");
        }
        if(NumberQuestion == 18){
            region = regions[2];
            Exmaple.example[0].setText("2+1");
        }
        if(NumberQuestion == 19){
            region = regions[6];
            Exmaple.example[0].setText("4+3");
        }
        if(NumberQuestion == 20){
            region = regions[9];
            Exmaple.example[0].setText("5+5");
        }
        if(NumberQuestion == 21){
            region = regions[12];
            Exmaple.example[0].setText("7+8");
        }
        if(NumberQuestion == 22){
            region = regions[10];
            Exmaple.example[0].setText("3+9");
        }
        if(NumberQuestion == 23){
            region = regions[8];
            Exmaple.example[0].setText("7+2");
        }
        if(NumberQuestion == 24){
            region = regions[4];
            Exmaple.example[0].setText("4+1");
        }
        if(NumberQuestion == 25){
            region = regions[11];
            Exmaple.example[0].setText("7+7");
        }
        if(NumberQuestion == 26){
            region = regions[10];
            Exmaple.example[0].setText("7+5");
        }
        if(NumberQuestion == 27){
            region = regions[0];
            Exmaple.example[0].setText("0+1");
        }
        if(NumberQuestion == 28){
            region = regions[11];
            Exmaple.example[0].setText("8+6");
        }
        if(NumberQuestion == 29){
            region = regions[5];
            Exmaple.example[0].setText("3+3");
        }
        if(NumberQuestion == 30){
            region = regions[13];
            Exmaple.example[0].setText("7+9");
        }



        }


    public Texture getTexture() {
        return texture;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void render (){
        batch.setProjectionMatrix(camera.combined);
    batch.begin();

        batch.draw(region,getX()*scaleSnake, getY()*scaleSnake);

    batch.end();

}



    public void dispose(){
        batch.dispose();
        texture.dispose();

    }
}