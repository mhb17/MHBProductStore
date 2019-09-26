package controller;

import model.Product;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repository.Myrepo;
import repository.Repo;
import service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class MHBController {
    @Autowired
    User user;
    @Autowired
    Repo repo = new Repo();
    @Autowired
    Myrepo myrepo;

    Product product;
    ProductService productService = new ProductService();
    @GetMapping({"/","/mhb"})
    public String welcome (Model model)
    {

        return "welcome";
    }
    @GetMapping({"/register"})
    public String register(Model model){
         model.addAttribute(user);
         return "register";
    }
    @PostMapping({"/register"})
    public String register2(Model model,@RequestParam(name = "email")String emial,@RequestParam(name = "password")String password,@RequestParam(name = "userName")String username,@RequestParam(name = "name")String name){
      //  user = new User(password,username,name,emial);
        System.out.println(user.getPassword());
       // repo.save(user);
        model.addAttribute(user);
        return "register";
    }
    @PostMapping({"/submitform"})
    public String submit(Model model){
        model.addAttribute(user);
        return "submit";
    }
    @GetMapping({"/buy"})
    public String buy(Model model){
        product = new Product();
        model.addAttribute(product);
        return "buy";
    }
    @PostMapping({"/confirmbuy"})
    public String confirmbuy(Model model,@RequestParam String name ,@RequestParam String desc){
        product = new Product(name,desc);
        repo.save(product);
        model.addAttribute(product);
        return "ConfirmBuy";
    }
    @GetMapping({"/showProduct"})
    public String show(Model model){
        ArrayList map = repo.show();

        ArrayList<Product> products = repo.generateProduct(map);

        model.addAttribute(products);
        return "showProduct";
    }
    @GetMapping({"/save"})
    public String save(Model model){
        product = new Product();
        model.addAttribute(product);
        return "buy2";
    }
    @PostMapping({"/savepro"})
    public String confirmbuy2(Model model,@RequestParam String name ,@RequestParam String desc){
        product = new Product(name,desc);
        myrepo.save(product);
        model.addAttribute(product);
        return "ConfirmBuy";
    }
    @GetMapping({"/show"})
    public String show2 (Model model)
    {
        Iterable<Product> products = myrepo.findAll();
        model.addAttribute(products);
        return "show";
    }
}
