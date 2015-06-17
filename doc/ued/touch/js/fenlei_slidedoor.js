// JavaScript Document
/*滑动门1js开始*/
function g(o){return document.getElementById(o);}
function HoverLi(n){
//如果有N个标签,就将i<=N;
var aa=$('.main-left ul li').length;
for(var i=1;i<=aa;i++){
	g('tb_'+i).className='normaltab';
	g('tbc_0'+i).className='undis';
	}
	g('tbc_0'+n).className='dis';
	g('tb_'+n).className='hovertab';
		
}
//如果要做成点击后再转到请将<li>中的onmouseover 改成 onclick;

/*滑动门1js结束*/

