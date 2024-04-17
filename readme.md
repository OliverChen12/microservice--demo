## 商品管理微服务——product

service端口：8010

client端口：8018

接口：

1. 根据获取商品信息： **GET** http://localhost:8018/findByProductId/{{productId}}

2. 展示所有商品信息： **GET** http://localhost:8018/queryAllProduct

3. 添加商品：**POST** http://localhost:8018/addProduct

   传入参数：

   ​	productName：string   

   ​	stock：integer  
   
   ​	price：double(或integer)
   
   返回值：
   
   ​	类型：string	内容：“添加商品成功！”
   
   
   
   

## 出库入库微服务——inoutStore

service端口：8011

client端口：8019

接口：

1. 根据ID增加库存：**GET** http://localhost:8019/addStockByProductId/{{productId}}
2. 根据ID减少库存：**GET** http://localhost:8019/subStockByProductId/{{productId}}



## 用户登录微服务——user

service端口：8012

client端口：8020

接口：

1. **POST** http://localhost:8020/login

   传入参数：

   ​	username：string	

   ​	password：string

   返回值：

   ​	登陆成功返回值为：

   ​		类型：string	内容： “登录成功！” 

   ​	登录失败返回值为：

   ​		类型：string	内容： "用户名或密码错误！"

   ​	











