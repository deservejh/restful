package kr.co.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.restful.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
