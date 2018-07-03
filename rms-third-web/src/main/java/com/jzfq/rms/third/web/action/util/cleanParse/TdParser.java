package com.jzfq.rms.third.web.action.util.cleanParse;

import com.jzfq.rms.third.common.domain.*;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.common.pojo.tongdun.HitRule;
import com.jzfq.rms.third.common.pojo.tongdun.Policy;

import java.util.*;

public class TdParser {


    /**
     * t_third_td_seq_order_data 同盾 订单流水关联表
     *
     * @param apiResp
     * @return
     */

    public static TThirdTdSeqOrderData getSeqData(FraudApiResponse apiResp, String orderNo, String traceId, String name, String idCard, String phone,Date requstTime) {
        TThirdTdSeqOrderData data = new TThirdTdSeqOrderData();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setcSeqId(apiResp.getSeq_id());
        data.setcOrderNo(orderNo);
        data.setcTraceId(traceId);
        data.setcName(name);
        data.setcIdCard(idCard);
        data.setcPhone(phone);
        data.setcCreattime(requstTime);
        return data;
    }


    /**
     * t_third_td_main_data 基础信息主表
     *
     * @param apiResp
     * @return
     */

    public static TThirdTdMainData getMainData(FraudApiResponse apiResp,Date requestTime) {
        TThirdTdMainData data = new TThirdTdMainData();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setcSeqId(apiResp.getSeq_id());
        data.setcSuccess(apiResp.getSuccess().toString());
        data.setcReasonCode(apiResp.getReason_code());
        data.setcSpendTime(apiResp.getSpend_time().toString());
        data.setcPolicySetName(apiResp.getPolicy_set_name());
        data.setcFinalScore(apiResp.getFinal_score().toString());
        data.setcFinalDecision(apiResp.getFinal_decision());
        data.setcCreattime(requestTime);
        return data;
    }

    /**
     * t_third_td_main_data 地理信息表
     *
     * @param apiResp
     * @return
     */

    public static TThirdTdGeoipInfoData getGeoInfoData(FraudApiResponse apiResp,Date requestTime) {
        TThirdTdGeoipInfoData data = new TThirdTdGeoipInfoData();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setcSeqId(apiResp.getSeq_id());
        Map<String, String> map = apiResp.getGeoip_info();
        data.setcCity(map.get("city"));
        data.setcCityId(map.get("cityId"));
        data.setcCounty(map.get("country"));
        data.setcCountryId(map.get("countryId"));
        data.setcProvince(map.get("province"));
        data.setcProvinceId(map.get("provinceId"));
        data.setcCounty(map.get("county"));
        data.setcStreet(map.get("street"));
        data.setcIsp(map.get("isp"));
        data.setcLatitude(map.get("latitude"));
        data.setcLongitude(map.get("longitude"));
        data.setcLip(map.get("lip"));
        data.setcCreattime(requestTime);
        return data;
    }


    /**
     * t_third_td_attribution_data 手机号信息表
     *
     * @param apiResp
     * @return
     */

    public static TThirdTdAttributionData getAttrInfoData(FraudApiResponse apiResp,Date requestTime) {
        TThirdTdAttributionData data = new TThirdTdAttributionData();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setcSeqId(apiResp.getSeq_id());
        Map<String, String> map = apiResp.getGeoip_info();
        data.setcIdcardProvince(map.get("idCardProvince"));
        data.setcIdcardCity(map.get("idCardCity"));
        data.setcCounty(map.get("country"));
        data.setcMobileAddressProvince(map.get("mobileAddressProvince"));
        data.setcMobileAddressCity(map.get("mobileAddressCity"));
        data.setcCreattime(requestTime);
        return data;
    }


    /**
     * t_third_td_policy_set_data 命中策略信息表表
     *
     * @param apiResp
     * @return
     */

    public static List<TThirdTdPolicySetData> getPolicySetInfoData(FraudApiResponse apiResp,Date requestTime) {
        List<TThirdTdPolicySetData> list = new ArrayList<>();
        if (null != apiResp.getPolicy_set() && apiResp.getPolicy_set().size() > 0) {
            for (Policy cy : apiResp.getPolicy_set()) {
                TThirdTdPolicySetData data = new TThirdTdPolicySetData();
                data.setcId(UUID.randomUUID().toString().replaceAll("-",""));
                data.setcSeqId(apiResp.getSeq_id());
                data.setcPolicyUuid(cy.getPolicy_uuid());
                data.setcPolicyDecision(cy.getPolicy_decision());
                data.setcPolicyMode(cy.getPolicy_mode());
                data.setcPolicyScore(String.valueOf(cy.getPolicy_score()));
                data.setcPolicyName(cy.getPolicy_name());
                data.setcRiskType(cy.getRisk_type());
                data.setRuleDatas(getRulesInfoData(cy.getHit_rules(),cy.getPolicy_uuid(),requestTime));
                data.setcCreattime(requestTime);
                list.add(data);
            }
        }
        return list;
    }


    /**
     * t_third_td_hit_rules_data 命中对应策略规则信息表表
     *
     * @param rules
     * @return
     */

    public static List<TThirdTdHitRulesData> getRulesInfoData(List<HitRule> rules, String policyId,Date requestTime) {
        List<TThirdTdHitRulesData> list = new ArrayList<>();
        if (null != rules && rules.size() > 0) {
            for (HitRule rule : rules) {
                TThirdTdHitRulesData data = new TThirdTdHitRulesData();
                data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
                data.setcRuleId(rule.getId());
                data.setcDecision(rule.getDecision());
                data.setcName(rule.getName());
                data.setcUuid(rule.getUuid());
                data.setcScore(String.valueOf(rule.getScore()));
                //关联规则集id
                data.setcPolicyUuid(policyId);
                data.setcCreattime(requestTime);
                list.add(data);
            }
        }
        return list;
    }



    /**
     * t_third_td_h5_data 网页端\(^o^)/~
     * 信息表
     *
     * @param apiResp
     * @return
     */

    public static TThirdTdH5Data getH5InfoData(FraudApiResponse apiResp,Date requestTime) {
        TThirdTdH5Data data = new TThirdTdH5Data();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setcSeqId(apiResp.getSeq_id());
        Map<String, Object> map = apiResp.getDevice_info();
        if (null != map) {
            data.setcCookieEnabled(map.get("cookieEnabled") == null ? "" : map.get("cookieEnabled").toString());
            data.setcOs(map.get("os") == null ? "" :map.get("os").toString());
            data.setcTrueIp(map.get("trueIp") == null ? "" :map.get("trueIp").toString());
            data.setcUserAgent(map.get("userAgent") == null ? "" :map.get("userAgent").toString());
            data.setcSmartId(map.get("smartId") == null ? "" :map.get("smartId").toString());
            data.setcCanvas(map.get("canvas") == null ? "" :map.get("canvas").toString());
            data.setcLanguageRes(map.get("languageRes") == null ? "" :map.get("languageRes").toString());
            data.setcScreenRes(map.get("screenRes") == null ? "" :map.get("screenRes").toString());
            data.setcVersion(map.get("version") == null ? "" :map.get("version").toString());
            data.setcPluginList(map.get("pluginList") == null ? "" :map.get("pluginList").toString());
            data.setcTokenId(map.get("tokenId") == null ? "" :map.get("tokenId").toString());
            data.setcDeviceType(map.get("deviceType") == null ? "" :map.get("deviceType").toString());
            data.setcFlashEnabled(map.get("flashEnabled") == null ? "" :map.get("flashEnabled").toString());
            data.setcReferer(map.get("referer") == null ? "" :map.get("referer").toString());
            data.setcFontid(map.get("fontId") == null ? "" :map.get("fontId").toString());
            data.setcDeviceid(map.get("deviceId") == null ? "" :map.get("deviceId").toString());
            data.setcBrowser(map.get("browser") == null ? "" :map.get("browser").toString());
            data.setcBrowserType(map.get("browserType") == null ? "" :map.get("browserType").toString());
            data.setcTcpOs(map.get("tcpOs") == null ? "" :map.get("tcpOs").toString());
            data.setcBrowserVersion(map.get("browserVersion") == null ? "" :map.get("browserVersion").toString());
            data.setcCreattime(requestTime);
        }
        return data;
    }

    /**
     * t_third_td_andriod_data 安卓端\(^o^)/~
     * 信息表
     *
     * @param apiResp
     * @return
     */

    public static TThirdTdAndriodData getAndriodInfoData(FraudApiResponse apiResp,Date requestTime) {
        TThirdTdAndriodData data = new TThirdTdAndriodData();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setcSeqId(apiResp.getSeq_id());
        Map<String, Object> map = apiResp.getDevice_info();
        if (null != map) {
            data.setcFmversion(map.get("fmVersion") == null ? "" : map.get("fmVersion").toString());
            data.setcOs(map.get("os") == null ? "" :map.get("os").toString());
            data.setcDeviceId(map.get("deviceId") == null ? "" :map.get("deviceId").toString());
            data.setcActiveTime(map.get("activeTime") == null ? "" :map.get("activeTime").toString());
            data.setcAvailableMemery(map.get("availableMemery") == null ? "" :map.get("availableMemery").toString());
            data.setcAvailableStorage(map.get("availableStorage") == null ? "" :map.get("availableStorage").toString());
            data.setcBasebandVersion(map.get("basebandVersion") == null ? "" :map.get("basebandVersion").toString());
            data.setcBatteryLevel(map.get("batteryLevel") == null ? "" :map.get("batteryLevel").toString());
            data.setcBatteryStatus(map.get("batteryStatus") == null ? "" :map.get("batteryStatus").toString());
            data.setcBlueMac(map.get("blueMac") == null ? "" :map.get("blueMac").toString());
            data.setcBootTime(map.get("bootTime") == null ? "" :map.get("bootTime").toString());
            data.setcBrand(map.get("brand") == null ? "" :map.get("brand").toString());
            data.setcCarrier(map.get("carrier") == null ? "" :map.get("carrier").toString());
            data.setcCellIp(map.get("cellIp") == null ? "" :map.get("cellIp").toString());
            data.setcCountryIso(map.get("countryIso") == null ? "" :map.get("countryIso").toString());
            data.setcCpuhardware(map.get("cpuHardware") == null ? "" :map.get("cpuHardware").toString());
            data.setcCpuserial(map.get("cpuSerial") == null ? "" :map.get("cpuSerial").toString());
            data.setcCpuspeed(map.get("cpuSpeed") == null ? "" :map.get("cpuSpeed").toString());
            data.setcCputype(map.get("cpuType") == null ? "" :map.get("cpuType").toString());
            data.setcDeviceconfig(map.get("deviceConfig") == null ? "" :map.get("deviceConfig").toString());
            data.setcDevicename(map.get("deviceName") == null ? "" :map.get("deviceName").toString());
            data.setcDisplay(map.get("display") == null ? "" :map.get("display").toString());
            data.setcDnsaddress(map.get("dnsAddress") == null ? "" :map.get("dnsAddress").toString());
            data.setcFirmversion(map.get("firmVersion") == null ? "" :map.get("firmVersion").toString());
            data.setcGateway(map.get("gateway") == null ? "" :map.get("gateway").toString());
            data.setcHardware(map.get("hardware") == null ? "" :map.get("hardware").toString());
            data.setcHost(map.get("host") == null ? "" :map.get("host").toString());
            data.setcImei(map.get("imei") == null ? "" :map.get("imei").toString());
            data.setcIsbatteryusage(map.get("isBatteryUsage") == null ? "" :map.get("isBatteryUsage").toString());
            data.setcIsroot(map.get("isRoot") == null ? "" :map.get("isRoot").toString());
            data.setcLanguage(map.get("language") == null ? "" :map.get("language").toString());
            data.setcMcc(map.get("mcc") == null ? "" :map.get("mcc").toString());
            data.setcMnc(map.get("mnc") == null ? "" :map.get("mnc").toString());
            data.setcModel(map.get("model") == null ? "" :map.get("model").toString());
            data.setcMusichash(map.get("musicHash") == null ? "" :map.get("musicHash").toString());
            data.setcPhonenumber(map.get("phoneNumber") == null ? "" :map.get("phoneNumber").toString());
            data.setcPhonetype(map.get("phoneType") == null ? "" :map.get("phoneType").toString());
            data.setcProduct(map.get("product") == null ? "" :map.get("product").toString());
            data.setcProxystr(map.get("proxyStr") == null ? "" :map.get("proxyStr").toString());
            data.setcRodevice(map.get("roDevice") == null ? "" :map.get("roDevice").toString());
            data.setcRomodel(map.get("roModel") == null ? "" :map.get("roModel").toString());
            data.setcRoname(map.get("roName") == null ? "" :map.get("roName").toString());
            data.setcScreenres(map.get("screenRes") == null ? "" :map.get("screenRes").toString());
            data.setcSdkversion(map.get("sdkVersion") == null ? "" :map.get("sdkVersion").toString());
            data.setcSerialno(map.get("serialNo") == null ? "" :map.get("serialNo").toString());
            data.setcSimoperator(map.get("simOperator") == null ? "" :map.get("simOperator").toString());
            data.setcSimserial(map.get("simSerial") == null ? "" :map.get("simSerial").toString());
            data.setcSubscriberid(map.get("subscriberId") == null ? "" :map.get("subscriberId").toString());
            data.setcTags(map.get("tags") == null ? "" :map.get("tags").toString());
            data.setcTdid(map.get("tdid") == null ? "" :map.get("tdid").toString());
            data.setcTimezone(map.get("timeZone") == null ? "" :map.get("timeZone").toString());
            data.setcTotalmemory(map.get("totalMemory") == null ? "" :map.get("totalMemory").toString());
            data.setcTotalstorage(map.get("totalStorage") == null ? "" :map.get("totalStorage").toString());
            data.setcTrueip(map.get("trueIp") == null ? "" :map.get("trueIp").toString());
            data.setcUdid(map.get("udid") == null ? "" :map.get("udid").toString());
            data.setcUptime(map.get("upTime") == null ? "" :map.get("upTime").toString());
            data.setcUseragent(map.get("userAgent") == null ? "" :map.get("userAgent").toString());
            data.setcVoicemail(map.get("voiceMail") == null ? "" :map.get("voiceMail").toString());
            data.setcVpnip(map.get("vpnIp") == null ? "" :map.get("vpnIp").toString());
            data.setcWifiip(map.get("wifiIp") == null ? "" :map.get("wifiIp").toString());
            data.setcWifimac(map.get("wifiMac") == null ? "" :map.get("wifiMac").toString());
            data.setcCreattime(requestTime);
        }
        return data;
    }




    /**
     * t_third_td_ios_data IOS端\(^o^)/~
     * 信息表
     *
     * @param apiResp
     * @return
     */

    public static TThirdTdIosData getIOSInfoData(FraudApiResponse apiResp,Date requestTime) {
        TThirdTdIosData data = new TThirdTdIosData();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        data.setcSeqId(apiResp.getSeq_id());
        Map<String, Object> map = apiResp.getDevice_info();
        if (null != map) {
            data.setcOs(map.get("os") == null ? "" :map.get("os").toString());
            data.setcVersion(map.get("version") == null ? "" :map.get("version").toString());
            data.setcTokenid(map.get("tokenId") == null ? "" :map.get("tokenId").toString());
            data.setcDeviceid(map.get("deviceId") == null ? "" :map.get("deviceId").toString());
            data.setcIdfa(map.get("idfa") == null ? "" : map.get("idfa").toString());
            data.setcIdfv(map.get("idfv") == null ? "" :map.get("idfv").toString());
            data.setcUuid(map.get("uuid") == null ? "" :map.get("uuid").toString());
            data.setcBoottime(map.get("bootTime") == null ? "" :map.get("bootTime").toString());
            data.setcCurrenttime(map.get("currentTime") == null ? "" :map.get("currentTime").toString());
            data.setcTotalspace(map.get("totalSpace") == null ? "" :map.get("totalSpace").toString());
            data.setcFreespace(map.get("freeSpace") == null ? "" :map.get("freeSpace").toString());
            data.setcMemory(map.get("memory") == null ? "" :map.get("memory").toString());
            data.setBrightness(map.get("brightness") == null ? "" :map.get("brightness").toString());
            data.setBattery(map.get("battery") == null ? "" :map.get("battery").toString());
            data.setCellip(map.get("cellIp") == null ? "" :map.get("cellIp").toString());
            data.setWifiip(map.get("wifiIp") == null ? "" :map.get("wifiIp").toString());
            data.setWifinetmask(map.get("wifiNetmask") == null ? "" :map.get("wifiNetmask").toString());
            data.setVpnip(map.get("vpnIp") == null ? "" :map.get("vpnIp").toString());
            data.setVpnnetmask(map.get("vpnNetmask") == null ? "" :map.get("vpnNetmask").toString());
            data.setMac(map.get("mac") == null ? "" :map.get("mac").toString());
            data.setNetworktype(map.get("networkType") == null ? "" :map.get("networkType").toString());
            data.setSsid(map.get("ssid") == null ? "" :map.get("ssid").toString());
            data.setBssid(map.get("bssid") == null ? "" :map.get("bssid").toString());
            data.setProxytype(map.get("proxyType") == null ? "" :map.get("proxyType").toString());
            data.setProxyurl(map.get("proxyUrl") == null ? "" :map.get("proxyUrl").toString());
            data.setDns(map.get("dns") == null ? "" :map.get("dns").toString());
            data.setJailbreak(map.get("jailbreak") == null ? "" :map.get("jailbreak").toString());
            data.setPlatform(map.get("platform") == null ? "" :map.get("platform").toString());
            data.setOsversion(map.get("osVersion") == null ? "" :map.get("osVersion").toString());
            data.setDevicename(map.get("deviceName") == null ? "" :map.get("deviceName").toString());
            data.setCarrier(map.get("carrier") == null ? "" :map.get("carrier").toString());
            data.setCountryiso(map.get("countryIso") == null ? "" :map.get("countryIso").toString());
            data.setMcc(map.get("mcc") == null ? "" :map.get("mcc").toString());
            data.setMnc(map.get("mnc") == null ? "" :map.get("mnc").toString());
            data.setBundleid(map.get("bundleId") == null ? "" :map.get("bundleId").toString());
            data.setLanguages(map.get("languages") == null ? "" :map.get("languages").toString());
            data.setTrueip(map.get("trueIp") == null ? "" :map.get("trueIp").toString());
            data.setcTotalspace(map.get("totalSpaceFree") == null ? "" :map.get("totalSpaceFree").toString());
            data.setcCreattime(requestTime);
        }
        return data;
    }










}
