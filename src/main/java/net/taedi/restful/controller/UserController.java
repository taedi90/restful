package net.taedi.restful.controller;

import lombok.RequiredArgsConstructor;
import net.taedi.restful.dto.CommonResponse;
import net.taedi.restful.dto.UserDto;
import net.taedi.restful.service.CustomUserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor //생성자 주입
public class UserController {

    private final CustomUserDetailsService userService;

    @PostMapping("/signup")
    public CommonResponse signup(@RequestBody UserDto infoDto) { // 회원 추가
        CommonResponse commonResponse = new CommonResponse();

        try {
            userService.save(infoDto);
            commonResponse.setResponse("success");
            commonResponse.setMessage("회원가입을 성공적으로 완료했습니다.");
        } catch (Exception e) {
            commonResponse.setResponse("failed");
            commonResponse.setMessage("회원가입을 하는 도중 오류가 발생했습니다.");
            commonResponse.setData(e.toString());
        }
        return commonResponse;
    }

}
