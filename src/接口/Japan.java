/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 接口;

/**
 *
 * @author 13340
 */
public class Japan implements Computable {

    int number;
    @Override
    public int f(int x) {
        return MAX+x; // 直接使用接口中的final static int MAX;
    }
    
}
