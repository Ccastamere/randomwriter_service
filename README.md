# 基于Travis搭建的CI/CD环境 —— 潘子奕 裘鹏泽 宋博仪 陶心旋 袁添镱
* CI部署选择
* CI环境配置
* CD环境配置
## 为什么选择Travis
* 对开源项目免费
* 和Github项目对接便利
* 配置环境方便快捷
## 配置Travis的CI环境
* 授权
  > 通过Github账号授权Travis CI访问代码库
* 选择
  > 选择需要托付CI的代码库
* 配置
  > 配置托付CI项目的配置文件
* travis.yml配置文件
  > ![图片1](http://m.qpic.cn/psb?/V12LxBG70sO6H3/.H8f8gxwOM1LJ4wIOQQ5d1rBWungzAB*KB8NI.WEmqk!/b/dDABAAAAAAAA&bo=TwJTAQAAAAADBz0!&rf=viewer_4)
  >> 在.travis.yml中配置language，jdk版本等项目信息
## 配置Travis的CD环境
### 为什么选择Heroku
* Heroku平台灵活性高，支持多种语言
* 和Github项目对接便利
* 插件和扩展内容丰富
* travis.yml配置文件
  > ![图片2]（http://m.qpic.cn/psb?/V12LxBG70sO6H3/.H8f8gxwOM1LJ4wIOQQ5d1rBWungzAB*KB8NI.WEmqk!/b/dDABAAAAAAAA&bo=TwJTAQAAAAADFy0!&rf=viewer_4）
  >> 在.travis.yml的deploy中配置CD相关信息如provider, api_key等信息
