package org.fastcampus.proejct.auth.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fastcampus.proejct.auth.converter.dto.UserInfoDto;
import org.fastcampus.proejct.auth.converter.dto.UserPrincipal;
import org.fastcampus.proejct.global.converter.BaseResponse;
import org.fastcampus.proejct.user.service.UserInfoService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/admin")
@Controller
public class AuthController {
    private final UserInfoService service;

    @GetMapping
    public String getAdmin(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return "index";
    }
}
