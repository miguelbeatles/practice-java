/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author miguel
 */
public class Volume {

    int height;
    int width;
    int deep;

    public Volume() {

    }

    public Volume(int height, int width, int deep) {
        this.height = height;
        this.width = width;
        this.deep = deep;
    }

    public int calculateVolume() {
        return this.height * this.width * this.deep;

    }

}
