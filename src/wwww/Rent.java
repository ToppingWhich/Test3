package wwww;

import javax.swing.*;
import java.awt.event.MouseEvent;

/**
 * @Author liwenyan
 * @Date 2023/5/24 19:08
 * @PackageName:wwww
 * @ClassName: Rent
 * @Description: TODO
 * @Version 1.0
 */
public class Rent extends Card{
    GameScreen gameScreen;
    public  static String cardType;
    //The name of the card
    String name;

    String color;
    //Does the card say heads or tails
    boolean up;
    //If it can be clicked
    boolean canClick;

    //Current status, whether it has been clicked
    boolean clicked;

    public Rent(GameScreen gameScreen, String name, boolean up,String color) {

        super(gameScreen, name, up);
        this.color = color;
    }

    public Rent() {
        super();
    }

    @Override
    void used(GameScreen gameScreen) {
        super.used(gameScreen);
    }

    public Rent(GameScreen gameScreen, String name, boolean canClick, boolean clicked) {
        super(gameScreen, name, canClick, clicked);
    }

    @Override
    public void turnFront() {
        System.out.println("Front");
        if(this.color == "Purple-Orange Rent"){
            System.out.println("RentRent");
            this.setIcon(new ImageIcon("src/images/purpleorangerent.png"));
        }else if(this.color == "Railroad-Utility Rent"){
            this.setIcon(new ImageIcon("src/images/railroadutilityrent.png"));
        }else if(this.color == "Green-Blue Rent"){
            this.setIcon(new ImageIcon("src/images/bluegreenrent.png"));
        }else if(this.color == "Brown-LightBlue Rent"){
            this.setIcon(new ImageIcon("src/images/brownlightbluerent.png"));
        }else if(this.color == "Red-Yellow Rent"){
            this.setIcon(new ImageIcon("src/images/redyellowrent.png"));
        }else if(this.color == "Multi-color Rent"){
            this.setIcon(new ImageIcon("src/images/allcolorrent.png"));
        }
    }

    @Override
    public void turnRear() {
        super.turnRear();
    }

    @Override
    public void small() {
        super.small();
    }

    @Override
    public void showDiChan() {
        super.showDiChan();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
    }

    @Override
    public GameScreen getGameScreen() {
        return super.getGameScreen();
    }

    @Override
    public void setGameScreen(GameScreen gameScreen) {
        super.setGameScreen(gameScreen);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public boolean isUp() {
        return super.isUp();
    }

    @Override
    public void setUp(boolean up) {
        super.setUp(up);
    }

    @Override
    public boolean isCanClick() {
        return super.isCanClick();
    }

    @Override
    public void setCanClick(boolean canClick) {
        super.setCanClick(canClick);
    }

    @Override
    public boolean isClicked() {
        return super.isClicked();
    }

    @Override
    public void setClicked(boolean clicked) {
        super.setClicked(clicked);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
