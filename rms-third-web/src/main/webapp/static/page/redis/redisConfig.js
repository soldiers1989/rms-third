$(function(){

})

function selectValue() {
    var key = $('#redis-key').val();
    var property = $('#redis-property').val();
    if(!key||key ==''){
        $('#keyNullModel').modal({
            keyboard: true
        })
        return;
    }
    $("#redis-value").val('');
    var json = {key:key,property:property,method:"select"};
    var params = createParams('P001','01',json)
    $.ajax({
        url:"/inter",
        data:params,
        dataType:"JSON",
        type:"POST",
        success: function(data){
            if(data.code == 200){
                $("#redis-value").val(data.data);
            } else {
                alert(data.msg);
            }
        }
    });
}

function updateValue() {
    var key = $('#redis-key').val();
    var property = $('#redis-property').val();
    var value = $('#redis-value').val();
    if(!key||key ==''){
        $('#keyNullModel').modal({
            keyboard: true
        })
        return;
    }
    if(!value||value ==''){
        $('#valueNullModel').modal({
            keyboard: true
        })
        return;
    }
    var json = {key:key,property:property,value:value,method:"update"};
    var params = createParams('P001','01',json)
    $.ajax({
        url:"/inter",
        data:params,
        dataType:"JSON",
        type:"POST",
        success: function(data){
            if(data){
                alert(data.msg);
            }else{
                alert('相应为空');
            }
        }
    });
}

function deleteData(){
    var key = $('#redis-key').val();
    var property = $('#redis-property').val();
    if(!key||key ==''){
        $('#keyNullModel').modal({
            keyboard: true
        })
        return;
    }
    var json = {key:key, property:property, method:"delete"};
    var params = createParams('P001','01',json)
    $.ajax({
        url:"/inter",
        data:params,
        dataType:"JSON",
        type:"POST",
        success: function(data){
            if(data){
                alert(data.msg);
            }else{
                alert('相应为空');
            }
        }
    });
}
