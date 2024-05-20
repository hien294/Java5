package com.example.btvn10th5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }
    @PostMapping("/home")
    public String check(Model model,@RequestParam("username") String username , @RequestParam("password") String password) {
        if (username.trim().isEmpty()) {
            model.addAttribute("mess1", "Không được để trống username");
            model.addAttribute("mss", "Đăng nhập thất bại");
        }
        if (password.trim().isEmpty()) {
            model.addAttribute("mess2", "Không được để trống pass");
            model.addAttribute("mss", "Đăng nhập thất bại");
        }
        if ("HangNT169".equals(username) && "123456".equals(password)) {
            model.addAttribute("ms2", "Đăng nhập thành công");
            return "trangChu";
        }
        model.addAttribute("mss","Đăng nhập thất bại");
        return "login";
    }
}
