# 高校一起吧

together of QDU.

## 后台管理页面

成功部署并运行后访问 <http://localhost/manage>

## MacOS

### 安装 Homebrew

`/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`

### 安装 JDK、Maven

`brew install java maven`

### 将本项目 clone 到本地

`git clone https://github.com/shenglin-feng/togetherQDU.git --depth=1 ~/togetherQDU && cd ~/togetherQDU`

### 启动服务

`mvn spring-boot:run`

## CentOS 系（Ubuntu 系大同小异）

### 安装 JDK、Maven、Git

`yum -y install java-latest-openjdk-* maven git`

### 将本项目 clone 到本地

`git clone https://github.com/shenglin-feng/togetherQDU.git --depth=1 ~/togetherQDU && cd ~/togetherQDU`

### 启动服务

`mvn spring-boot:run`

## Windows

没有 Windows 电脑，请自行摸索。
