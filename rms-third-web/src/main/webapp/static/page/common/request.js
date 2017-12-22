var STR_APPSECRET = '93dd7a6468807ade';

function createParams(apiId,version,json){
    var params = {};
    params.traceID = 'rms-third';
    params.timestamp = (new Date()).valueOf();
    params.appId = '23';
    params.apiId = apiId;
    params.callSystemID = '23';
    params.params = JSON.stringify(json);
    params.v = version;
    params.token = creatToken(params.appId,params.apiId,STR_APPSECRET,params.timestamp);
    return params;
}

function creatToken(appId,apiId,secret,timestamp){
    var token = '';
    var tokenRoot = appId + secret + apiId + timestamp;
    return hex_md5(tokenRoot).toUpperCase();
}