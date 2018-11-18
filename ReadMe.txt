本项目主要为个人学习java网络编程创建，使用GPL协议！
在学习、分发的过程中请保留作者信息，不胜感激！
email：guoliao502@163.com 欢迎大家来信交流！

本项目主要包含以下接口：
Server 主要完成配置初始化、启动、停止、状态返回；用户可以自定义实现不同的server监听
Listener 主要完成连接处理，任务封装；针对不同Server完成不同连接处理
Task 主要针对不同请求，完成消息处理
Processor 主要处理Task
Request 请求数据实体类
Response 响应数据实体类

主要流程为Server使用Listener完成监听、连接建立、封装Task；提交Task到Processor处理，并输出返回

