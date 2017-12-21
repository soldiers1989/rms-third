$(function(){

})

function selectValue() {
    var key = $('#redis-key').val();
    var property = $('#redis-property').val();
    if(!key||key ==''){
        $('#keyNullModel').modal({
            keyboard: true
        })
    }

}

function updateValue() {
    var key = $('#redis-key').val();
    var property = $('#redis-property').val();
    var value = $('#redis-value').val();
    if(!key||key ==''){
        $('#keyNullModel').modal({
            keyboard: true
        })
    }
    if(!value||value ==''){
        $('#valueNullModel').modal({
            keyboard: true
        })
    }
}

function deleteData(){
    var key = $('#redis-key').val();
    var property = $('#redis-property').val();
    if(!key||key ==''){
        $('#keyNullModel').modal({
            keyboard: true
        })
    }
}
