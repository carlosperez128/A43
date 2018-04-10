/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecBin;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "DecimalBinario")
public class DecimalBinario {

    /**
     * This is a sample web service operation
     * @param num
     * @return 
     */
    @WebMethod(operationName = "DecBin")
    public String DecBin(int num) {     
        String base2="";
        while(num>0) {
            base2=(num%2)+base2;
            num/=2;  
        }
        return base2;    
    }
}
