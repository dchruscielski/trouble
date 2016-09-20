/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trouble2;

import javax.swing.ImageIcon;

/**
 *
 * @author danielchruscielski
 */
public class Piece extends Sprite{
    private int[] space;

    public Piece(){
        space = new int[4];
    }
    public Piece(ImageIcon i)
    {
        space = new int[4];
        img = i.getImage();
    }
    
    public int getSpace(int num) {
        return space[num];
    }

    public void setSpace(int num,int spot) {
        space[num]= spot;
    }
    
    
    
    
}
