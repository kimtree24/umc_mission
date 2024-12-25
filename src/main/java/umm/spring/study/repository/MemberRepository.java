package umm.spring.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umm.spring.study.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}