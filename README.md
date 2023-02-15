# ReggieGit

#### 介绍
该项目为点餐下单项目，包含用户和商家完整的功能业务代码，分后台管理端和用户移动端两方面开发设计，补充了项目部分的业务接口

本项目由  **spirng + springboot + mybatis-plus + redis + mysql + git + swagger + apifox** 等技术及工具完成，该项目环境为 **服务器测试环境** ，设置为多环境开发，可以自行调节

#### 项目架构

采用前后端分离技术，前端部署nginx，后端部署Tomcat

采用主从复制技术，主库写入，从库读出，避免单点故障
 
采用Redis缓存，对热点key存储，降低查询数据库的压力

注：由于个人用的时单体服务器，所以只在虚拟机上实现了主从复制和前后端分离，所以这个项目代码还是单体项目
#### 使用说明

git clone 克隆到你本地idea，注意更改环境，我用的是服务器的ip和端口，自己使用是记得切换开发环境

#### 参与贡献

除前端接口外，后端补充逻辑业务独立实现

贡献者：gk8
