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
public class China implements Computable {
    int number;
    @Override
    public int f(int x) {
        int sum=0;
        for (int i = 0; i <= x; i++) {
            sum+=i;
        }
        return sum;
    }
    
}
