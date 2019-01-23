#sentinel集成apollo
##一、参考资料
###1.Sentinel：
    https://github.com/alibaba/Sentinel
###2.apollo：
    https://github.com/ctripcorp/apollo
###3.前提：事先配置apollo服务
    https://github.com/ctripcorp/apollo/wiki/Quick-Start 

##二、如何集成
###1.apollo规则key：
    sentinel.flowrule.key

###2.apollo对应规则值：
   
    [
        {
            "resource": "hello",
            "controlBehavior": 0,
            "count": 1,
            "grade": 1,
            "limitApp": "default",
            "strategy": 0
        }
    ]
    
        //resource：资源名，即限流规则的作用对象
        //count: 限流阈值
        //grade: 限流阈值类型（QPS 或并发线程数）
        //limitApp: 流控针对的调用来源，若为 default 则不区分调用来源
        //strategy: 调用关系限流策略
        //controlBehavior: 流量控制效果（直接拒绝、Warm Up、匀速排队
        
###3.核心配置：
    java代码： SentinelConfiguration.loadRules()
    
##三、启动spring boot
    访问 localhost:8888/test
    开始测试吧 ^_^
 