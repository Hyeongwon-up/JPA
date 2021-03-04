# JPA ( Java Persistent API)
****





<details>
    <summary>STUDY MEMO</summary>
        <div markdown="1">
        
        <details>
            <summary>## ORM (Object-Relational Mapping)</summary>
                <div markdown="1">
        
    

                </div>
            </details>


## mappedBy

## 객체와 테이블의 연관관계 차이
+ 객체 연관관계 = 2개
+ 테이블 연관관계 = 1개


## 양방향 매핑 규칙

+ 객체의 두 관계중 하나를 연관관계의 주인으로 지정
+ 연관관계의 주인만이 외래키를 관리
+ 주인이 아닌쪽은 **읽기**만 가능
+ 주인은 mappedBY 속성 **사용x**
+ 주인이 아니면 mappedBy 속성으로 주인 지정

+ 외래 키가 잇는 곳을 주인으로 정하자!

        </div>
</details>
