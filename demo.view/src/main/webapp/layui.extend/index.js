layui.define(['layer', 'sliderVerify', 'form'], function(exports){   //'modules/sliderVerify/sliderVerify',
  
	var sliderVerify = layui.sliderVerify;
	
	var slider = sliderVerify.render({
	
		elem: '#slider',
		
		onOk: function(){//当验证通过回调
			
			layer.msg("滑块验证通过");
		}
	})
  
	var form = layui.form;
	  
	form.on('submit(form-login)', function(data){
		
//	    layer.msg(JSON.stringify(data.field)); 校验用户名以及密码的合法性
	    
//		login(data)
	    
//		return false;
	});
	
	
	function login(data){
//		alert("SS")
//		window.location.href="main";
		
		/*$.ajax({
			
			type:'post',
			
			url:'',
			
			data:{}
		
			success:function(data){
				
				
			}
			
		})*/
	}
	
	/*exports('index', function(){
	  
		alert("注册模块")
		
		
	}); */
  
}).extend({sliderVerify: 'modules/sliderVerify/sliderVerify'})



/*layui.define(["layer","jquery"],function (exports) {
	   var obj = {
	       login : function (url,data,$,targetUrl) {
	           $.post(url,{code:data.code},function (res) {
	             if (res.code&&res.code==400){
	                 layer.msg(res.msg,{icon:1},function () {
	                     window.location.href = targetUrl;
	                 });
	             }else{
	                 layer.msg(res.msg,{icon:1},function () {
	                     window.location.href = targetUrl;
	                 });
	             }
	           });
	       }
	   }
	   exports("login",obj);
});
*/