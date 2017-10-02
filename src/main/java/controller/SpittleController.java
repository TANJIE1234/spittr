package controller;

import data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zyzz on 17-9-25.
 */
@Controller
@RequestMapping("/")
public class SpittleController {
    private SpittleRepository spittleRepository;
    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }
    @RequestMapping(value = "spittles_20",method = RequestMethod.GET)
    public String spittles(Model model){
        model.addAttribute("spittleList",spittleRepository.findSpittles(Long.MAX_VALUE,20));
        return "spittles";
    }
    @RequestMapping(value = "spittles",method = RequestMethod.GET)
    public String spittles(@RequestParam("max") Long max,@RequestParam("count") int count,Model model){
        model.addAttribute("spittleList",spittleRepository.findSpittles(max,count));
        return "spittles";
    }
    @RequestMapping(value = "spittles/{id}",method = RequestMethod.GET)
    public String spittle(@PathVariable("id") int id,Model model){
        model.addAttribute("spittle",spittleRepository.findOne(id));
        return "spittle";
    }
}
