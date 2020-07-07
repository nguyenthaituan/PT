/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontapphuongtrinh;

import java.util.ArrayList;

public class GiaiPhuongTrinh {
    PhuongTrinh phuongTrinh;

    public GiaiPhuongTrinh(PhuongTrinh phuongTrinh) {
        this.phuongTrinh = phuongTrinh;
    }
    
    public void giaiphuongtrinh()
    {
        ITinh tinh = new TinhDelta();
        float delta = (float) tinh.Tinh(phuongTrinh.getA(), phuongTrinh.getB(), phuongTrinh.getC());
        if(delta < 0)
        {
            System.out.println("Phương trình vô nghiệm! ");
        }
        else
        {
            if(delta == 0)
            {
                tinh = new TinhNghiem1();
                float nghiem = (float) tinh.Tinh(phuongTrinh.getA(), phuongTrinh.getB(), phuongTrinh.getC());
                System.out.println("Phương trình có 1 nghiệm duy nhất: " + nghiem);
            }
            else
            {
                tinh = new TinhNghiem1();
                float nghiem1 = (float) tinh.Tinh(phuongTrinh.getA(), phuongTrinh.getB(), phuongTrinh.getC());
                tinh = new Tinhnghiem2();
                float nghiem2 = (float) tinh.Tinh(phuongTrinh.getA(), phuongTrinh.getB(), phuongTrinh.getC());
                System.out.println("Phương trình có 2 nghiệm: " + nghiem1 + ", " + nghiem2);
            }
        }
    }
    
}
