
## 1. 简单工厂模式
### 优点
1. 对象创建和使用分离，工厂类包含必要的判断逻辑，决定什么时候创建哪一个产品实例
2. 客户端仅仅只需要知道具体产品所对应的参数即可
3. 可使用配置文件的方式更换和增加新的具体产品类
### 缺点
1. 工厂职责过重，包含所有产品的创建逻辑
2. 扩展困难，一旦增加新的产品类，就必须修改工厂类方法
3. 使用静态工厂，造成工厂角色无法形成继承的等级结构
4. 多引入类的个数

### 适用场景
1. 工厂类负责创建的对象较少
2. 客户端只知道工厂类的参数，对如何创建对象并不关心

## 2. 工厂方法模式
### 优点
1. 增加新产品时，只需要增加一个新的产品工厂和工厂类即可，符合"开闭原则"
2. 多态工厂模式，隐藏具体创建何种产品与创建产品的具体细节

### 缺点
1. 增加新产品时，需要增加一个新的产品工厂和工厂类，一定程度上增加了系统的复杂度
2. 考虑到系统的扩展性，可引入抽象层与XML配置文件的方式，可能用到DOM，反射等技术。
