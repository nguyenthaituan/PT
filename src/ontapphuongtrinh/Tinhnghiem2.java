/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontapphuongtrinh;

/**
 *
 * @author Admin
 */
public class Tinhnghiem2 implements ITinh{

    @Override
    public float Tinh(float a, float b, float c) {
        float delta = b*b - 4*a*c;
        return (float) ((-b + Math.sqrt(delta))/(2*a));
    }
    
}
