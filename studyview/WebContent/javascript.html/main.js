/**
 * 여러줄 주석
 */

// 한 줄 주석

// 자바 스크립트 문법
//window.onload = function() {
//	// html, css 로딩 끝나면 ~ 스크립트 실행
//	alert("test")
//}

/*	1. 자바스크립트 자료형(p.462)
	숫자형, 문자형, NULL, function, object, symbol, class
	- 자동 캐스팅 ☞ 자바 큰 차이!
	
	2. 변수 선언 초기화(p.463)
	var			:	es5		↔	javascript, jquery
		~ 과도기 : 
	const, let	:	es6		↔	javascript, react/vue/angular(framework)
	(immutable)					+ node.js > npm 프로젝트 | babel, webpack
	
	var var1 = 5;
	var str1 = aaa;
	var class1 = {classNO: '101', className: 'HTML,CSS & Javascript'};
*/

var var1 = 5;
var str1 = "aaaaaa";
var str2 = new String("bbb");
var class1 = {classNO: '101', className: 'HTML,CSS & Jacascript'};

/*$(document).ready(function(){
	//일반형
	//html, css 모두 로드된 후 스크립트 실행해!
});
*/

/*$(function(){
	//축양형 : 추천하는 방법!
});
*/

// p.468 제이쿼리를 이용한 태그 제어
	//alert();
	//console.log();
	//document.write();
$(function(){
	$(".btn1").click(function(){
		//	.html() : set
		$("#displayArea").html("<img src='https://picsum.photos/200' alt=\"설명\">");

		//	.html() : get
		consol.log($("#displayArea").html());
	})
	/*제이쿼리 기본 사용법*/
	$(".btn2").click(function(){
		$("#displayArea").hide(400,function(){
			alert("애니메이션 끝!!");
		});//	엘린먼트(?)를 숨김!
	});		
	
	$(".btn3").click(function(){
		$("#displayArea").show("slow");	//	엘린먼트(?)를 보여줘!
	});
	
})







