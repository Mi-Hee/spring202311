package controllers.member;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberCotroller {

    @GetMapping("/member/join")
    public String join() {

        return "member/join";
    }

    @PostMapping("/member/join")
    public String joinPs(RequestJoin form) {
        System.out.println(form);

        return "member/join";
    }

    @GetMapping("/member/login")
    public String login() {

        return "member/login";
    }

    @PostMapping("/member/login")
    public String loginPS(RequestJoin form) {
        System.out.println(form);

        return "member/login";
    }


}





















