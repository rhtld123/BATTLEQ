package com.battleq.member.repository;

import com.battleq.member.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    public Optional<Member> findMemberByEmail(String email);
    public Optional<Member> findMemberByNickname(String nickName);
    public int countMemberByNickname(String nickName);
    public Optional<Member> findById(Long id);
}
