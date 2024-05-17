package com.ohigraffers.securitytest.dto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class LoginDto {
    private final Long memberCode;
    private final String memberId;
    private final String memberPassword;
//    private final MemberRole memberRole;

//    public static LoginDto from(Member member) {
//        return new LoginDto(
//                member.getMemberCode(),
//                member.getMemberId(),
//                member.getMemberPassword(),
//                member.getMemberRole());
//    }

}
