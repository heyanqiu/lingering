package com.qf.lingering.utils;

/**
 * Created by heyanqiu on 2017/2/20.
 * 默认的常量和系统的常量
 */

public class Util {
    //乐文接口
    String documentPath = "http://wawa.fm:9090/wawa/api.php/document/getmgdocument";
    //猎乐接口第一页
    String magzinePathpage01 = "http://wawa.fm:9090/wawa/api.php/magazine/mgmagazineList?platform=yyandroid&r=10&timestrap=1487252636927&api_key=08b1e567157582019f7fe639c841c42a&category.id=543&page=6&sign=6d2c42705c0029a878ac492efb6300ceb0c50d6ca433789d37423e23e39d3742";
    //猎乐接口第二页
    String magzinePathpage02 = "http://wawa.fm:9090/wawa/api.php/magazine/mgmagazineList?platform=yyandroid&r=10&timestrap=1487252590762&api_key=08b1e567157582019f7fe639c841c42a&category.id=543&page=5&sign=3d7f4c73d8f5261c7c9908a7aba8366536397361538db23f576a39097e5a2be6";
    //遇见接口
    String meetPath = "http://wawa.fm:9090/wawa/api.php/user/meetList?platform=yyandroid&r=30&timestrap=1487253050809&api_key=08b1e567157582019f7fe639c841c42a&page=1&sign=aecbf7bfb94541fdd4d009d3d524e1ccf4e53b65ee1ce57c3d6d4a6fbc22469a";
    //音乐人
    String musicianPath = "http://wawa.fm:9090/wawa/api.php/Musician/list?platform=yyandroid&timestrap=1487322826843&api_key=08b1e567157582019f7fe639c841c42a&sign=1a9d237c47963c4d7b34bea1faecc442b432c66e1537c252e987ce665bd23aeb&page=1&r=12&type=0";

}
