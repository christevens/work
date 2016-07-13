/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackie.homecontroller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author christopherstevens
 */
@Controller
public class HomeController {


    @Inject
    public HomeController() {

    }

    @RequestMapping(value = "/food", method = RequestMethod.GET)
    public String food(Map model) {

       

        return "food";
    }
}

