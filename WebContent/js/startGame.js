function test1(request){
	$.ajax({
        url:'startGame',
        type:'GET',
        data:{
            'request':request,
        }
    })
    .done(function(data){
    	alert(data);
    })
    .fail(function(data){
    	alert(data);
    });
}