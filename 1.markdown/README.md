# Markdown Practice

## Markdown

문단 내부에 소스코드를 표현하고 싶다면 백틱을 써줍니다.
`System.out.println("Hello world");`
동일 가격 글자로, 색을 바꿔서 소스코드임을 markdown이 알려준다.

만약 여러줄의 코드를 표현하고 싶다면 세개를 쓴다.

```
public class Main {
  public static void main(){
    System.out.println("Hello world");
  }
}
```

Github 같은 경우 어떤 언어로 된 코드인지도 작성 가능합니다.

```java
public class Main {
  public static void main(){
    System.out.println("Hello world");
  }
}
```

# 링크

가장 간단한 링크 만들기 <https://www.naver.com>

문구에 링크 추가하기 [네이버(문구)](https://www.naver.com)

# 이미지

이미지는 다음과 같이 넣을 수 있습니다.

[컴퓨터 저장된 이미지(문구)](image.gif)
![컴퓨터 저장된 이미지(문구)](image.gif)

웹에서 가져온 이미지

[Java](https://altools.co.kr/_next/static/media/img_feature_alsee_1.da0eae6f.png)
![Java](https://altools.co.kr/_next/static/media/img_feature_alsee_1.da0eae6f.png)
![](https://altools.co.kr/_next/static/media/img_feature_alsee_1.da0eae6f.png)
