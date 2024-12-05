# 디테일이 들어간 다중 게시판 프로젝트

### 아래 내용을 학습하기 위한 토이 프로젝트
1. 보안 취약점을 해결한 토큰 전략 적용(Sliding Session, RTR)
2. Redis 사용
3. 각 레이어별 테스트 코드 작성(Jacoco를 이용한 Test Coverage 측정)
4. Rest Docs를 이용한 Api Documentation
5. Docker Compose를 이용한 로컬 환경 구축 
6. Clean Code

### 요구사항
- 카카오 로그인을 통해 전달된 회원 정보로 회원가입 진행
- 카카오 로그인 구현
    - AccessToken, RefreshToken 발급
      Sliding Session과 Refresh Token Rotation(RTR) 적용
      Refresh Token은 Redis를 통해 관리
- N개의 게시판을 보여주며, 게시판의 갯수는 유동적으로 변경되도록 설계
- 댓글, 대댓글 구현
- 게시글 조회수 처리
    - 중복 count 방지
    - 조회수 증가 기능 성능 최적화
        - JMeter를 이용한 부하테스트로 성능 비교해보기
- Controller, Service Layer에 대한 테스트 코드 작성
- Rest Docs를 이용한 API Documentation
- Docker, Docker-Compose를 이용한 로컬 환경 구축
