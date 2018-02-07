# kotlin-android-example

## 4.1.1. 코틀린 인터페이스
- field X, method O
- override  변경자 필수
- default method : 본문 구현

## 4.1.2 접근 변경자(access modifier) : open, final(기본), abstract
- open: 상속을 허용, override 허용하고 싶은 method와 property
- override한 method : 기본적으로 open, 하위 클래스에서 override 하지 못하게 금지하려면 final override 명시

## 4.1.3 가시성 변경자(visibility modifier) : public(기본), protected, private, internal

## 4.1.4 inner class, nested class
- 중첩 클래스 : 기본은 자바 static 중첩 클래스와 같음.
- 내부 클래스 : inner 변경자

## 4.3.1 Any, Unit
- Any : The root of the Kotlin class hierarchy. Every Kotlin class has Any as a superclass. 모든 클래스의 최상위 class
- Unit : The type with only one value: the Unit object. This type corresponds to the void type in Java.

## 4.3.2 data class
- getter, setter 구현 필요 X
- 불변성 : 모든 property 읽기 전용으로 만들어서 데이터 클래스를 immutable class로 만들기를 .

## 4.3.3 클래스 위임
- by 키워드 : 클래스 위임. 상속을 허용하지 않는 클래스에 새로운 동작을 추가할 때 유용
- delegation : 클래스(메서드) 위임, 프로퍼티 위임

# 4.4 object : 객체 생성
## 4.4.1 객체 선언 (object declaration) : 싱글턴 정의
- 싱글턴 기본 지원
- 생성자 사용 불가, 생성자 호출 없이 즉시 객체 생성
- 클래스나 인스턴스 상속 가능

## 4.4.2 동반 객체 (companion object) : 클래스와 관련있는 메서드 및 팩토리 메서드를 담을 때 사용
- 자신을 둘러싼 클래스의 모든 private 멤버에 접근 가능
- 동반 객체가 private 생성자를 호출하기 좋은 위치. (Page186 참고)

## 4.4.3 동반 객체를 일반 객체처럼 사용
- 이름을 붙이거나 인터페이스를 상속
- 확장 함수와 프로퍼티 정의

## 4.4.4 객체 식: 무명 내부 클래스
- 예시 : SignInActivity 에서 TextWatcher 위임할 때
- 객체 선언과 달리 무명 객체는 싱글턴이 아니다. 객체 식이 쓰일 때마다 새로운 인스턴스 생성됨.


