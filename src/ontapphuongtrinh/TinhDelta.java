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
public class TinhDelta implements ITinh{

    public TinhDelta() {
    }
    

    @Override
    public float Tinh(float a, float b, float c) {
        return b*b - 4*a*c;
    }
    
}
