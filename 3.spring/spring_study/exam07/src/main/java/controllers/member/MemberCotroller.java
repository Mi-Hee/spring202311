package controllers.member;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.member.JoinService;
import models.member.LoginService;
import models.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/member") // /member/join
@RequiredArgsConstructor
public class MemberCotroller {

    private final JoinValidator joinValidator;
    private final JoinService joinService;
    private final LoginValidator loginValidator;
    private final LoginService loginService;

    @ModelAttribute("hobbies")
    public List<String> hobbies() {
        return Arrays.asList("자바", "오라클", "JSP", "스프링");
    }

    @GetMapping("/join")
    // @RequestMapping(method={RequestMethod.GET, RequestMethod.Post}, path="/member/join"
    public String join(@ModelAttribute RequestJoin form, Model model) {

//        String[] addCss = {"member/styles1", "member/style2"};
//        List<String> addScript = Arrays.asList("member/script1", "member/script2");
//
//        model.addAttribute("addCss", addCss);
//        model.addAttribute("addScript", addScript);

//        model.addAttribute("requestJoin", new RequestJoin());
        model.addAttribute("pageTitle", "회원가입");

        return "member/join";

    }

    @PostMapping("/join") // /member/join
    public String joinPs(@Valid RequestJoin form, Errors errors, Model model) {

        joinValidator.validate(form, errors);

        if (errors.hasErrors()) { // 검증 실패시

            return "member/join";
        }



        // 회원 가입 처리
        joinService.join(form);

        // System.out.println(form);
        // 커맨드객체 RequestJoin -> requestJoin 이름으로 속성이 추가됨 -> 템플릿 내에서 바로 접근 가능

        // model.addAttribute("requestJoin", form);
        // response.sendRedirect(request.getContextPath() + "/member/login")
        // Location : 주소
        return "redirect:/member/login";
        // return "forward:/member/login";
    }

    @GetMapping("/login") // /member/login
    public String login(@ModelAttribute RequestLogin form) {

        return "member/login";
    }

    @PostMapping("/login") // /member/login
    public String loginPS(@Valid RequestLogin form, Errors errors) {

        loginValidator.validate(form, errors);

        // System.out.println(form);
        if (errors.hasErrors()) {
            return "member/login";
        }

        // 로그인 처리
        loginService.login(form);

        return "redirect:/"; // 로그인 성공시 메인페이지로 이동
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 비우기
        
        return "redirect:/memebr/login"; // 로그인 페이지로 이동
    }

    @GetMapping("/list") // /member/list
    public String members(Model model) {

        List<Member> members = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Member member = Member.builder()
                    .userNo(Long.valueOf(i))
                    .userPw("123456")
                    .userId("user" + i)
                    .userNm("사용자" + i)
                    .email("user" + i + "@text.org")
                    .regDt(LocalDateTime.now())
                    .build();

            members.add(member);
        }

        model.addAttribute("members", members);

        return "member/list";

    }

    /*
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(joinValidator);
    }
    */

}





















