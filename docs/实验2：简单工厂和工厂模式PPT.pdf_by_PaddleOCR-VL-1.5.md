### 实验二：简单工厂和工厂方法模式

实验与创新实践教育中心 • 计算机与数据技术实验教学部

#### 本学期实验总体安排

##### 初始版本

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//4c0ea5ed-b687-4ea3-81e8-ceee96c623fe/markdown_1/imgs/img_in_image_box_305_220_534_571.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A56Z%2F-1%2F%2Ffc065d81b03b98b8861910a5137ad428fd52e522205a683c63ef07ed3599774d" alt="Image" width="11%" /></div>


##### 最终版本

↓

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//4c0ea5ed-b687-4ea3-81e8-ceee96c623fe/markdown_1/imgs/img_in_image_box_305_651_536_1002.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A56Z%2F-1%2F%2Ff33ee739d85d91daea129e7a350e317db22024810d4c0d4b3f2e58b6c7303496" alt="Image" width="12%" /></div>


游戏主界面

英雄机移动

英雄机子弹直射

碰撞检测

统计得分和生命值

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//4c0ea5ed-b687-4ea3-81e8-ceee96c623fe/markdown_1/imgs/img_in_image_box_631_458_698_521.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A56Z%2F-1%2F%2Fb8fa9fe0755fc05be869a92b07ee17f9f6a516a338e9e98a95da59863eec8507" alt="Image" width="3%" /></div>


##### 采用简单工厂模式

同单工厂模式

创建道具

采用工厂方法模式

创建敌机

02

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//4c0ea5ed-b687-4ea3-81e8-ceee96c623fe/markdown_1/imgs/img_in_image_box_938_285_1027_389.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A57Z%2F-1%2F%2Ffbf69bd3419b0af1fc056f7fceed32cb58236ccb2182e3c764036a68e6ce30e7" alt="Image" width="4%" /></div>


采用数据访问对象模式

实现得分排行榜

添加JUnit单元测试

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//4c0ea5ed-b687-4ea3-81e8-ceee96c623fe/markdown_1/imgs/img_in_image_box_949_477_1031_582.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A57Z%2F-1%2F%2F798ebdf285902849c7d615409fc9c2b212cee39c51b1ee600c886093cd0f8923" alt="Image" width="4%" /></div>


采用观察者模式

实现炸弹、冰冻道具

采用模板模式

实现三种游戏难度

01

UML建模

精英敌机生成、攻击

道具生成、加血道具生效

采用单例模式创建英雄机

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//4c0ea5ed-b687-4ea3-81e8-ceee96c623fe/markdown_1/imgs/img_in_image_box_1109_566_1201_673.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A57Z%2F-1%2F%2Ffee4b82a5ac9ae5460445cb012c6e2f0381e3f30804b0b9a0303b0a489c9dc9b" alt="Image" width="4%" /></div>


03

04

采用策略模式

实现不同飞机的发射弹道

两种火力道具生效

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//4c0ea5ed-b687-4ea3-81e8-ceee96c623fe/markdown_1/imgs/img_in_image_box_1111_753_1200_859.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A57Z%2F-1%2F%2F1fa7c88fad0a9dd4b77a13738b2cee3aa356e2ff0305a07709c70b79611e34df" alt="Image" width="4%" /></div>


05

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//4c0ea5ed-b687-4ea3-81e8-ceee96c623fe/markdown_1/imgs/img_in_image_box_941_853_1029_963.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A58Z%2F-1%2F%2Fbf52026c35200710ec54e28712a43f27d2250d0bc1cc6d98c012ce53188fb701" alt="Image" width="4%" /></div>


06

使用Swing添加游戏难度选择和

排行榜界面

使用多线程实现音效控制及火力

道具状态恢复

#### 本学期实验总体安排



<table border=1 style='margin: auto; word-wrap: break-word;'><tr><td style='text-align: center; word-wrap: break-word;'>实验项目</td><td style='text-align: center; word-wrap: break-word;'>二</td><td style='text-align: center; word-wrap: break-word;'>二</td><td style='text-align: center; word-wrap: break-word;'>三</td><td style='text-align: center; word-wrap: break-word;'>四</td><td style='text-align: center; word-wrap: break-word;'>五</td><td style='text-align: center; word-wrap: break-word;'>六</td></tr><tr><td style='text-align: center; word-wrap: break-word;'>学时数</td><td style='text-align: center; word-wrap: break-word;'>2</td><td style='text-align: center; word-wrap: break-word;'>2</td><td style='text-align: center; word-wrap: break-word;'>2</td><td style='text-align: center; word-wrap: break-word;'>2</td><td style='text-align: center; word-wrap: break-word;'>4</td><td style='text-align: center; word-wrap: break-word;'>4</td></tr><tr><td style='text-align: center; word-wrap: break-word;'>实验内容</td><td style='text-align: center; word-wrap: break-word;'>系统分析 单例模式</td><td style='text-align: center; word-wrap: break-word;'>简单工厂 工厂方法 模式</td><td style='text-align: center; word-wrap: break-word;'>策略模式</td><td style='text-align: center; word-wrap: break-word;'>JUnit 数据访问 对象模式</td><td style='text-align: center; word-wrap: break-word;'>Swing 多线程</td><td style='text-align: center; word-wrap: break-word;'>观察者模式 模板模式</td></tr><tr><td style='text-align: center; word-wrap: break-word;'>时间节点</td><td style='text-align: center; word-wrap: break-word;'></td><td style='text-align: center; word-wrap: break-word;'></td><td style='text-align: center; word-wrap: break-word;'>中期</td><td style='text-align: center; word-wrap: break-word;'></td><td style='text-align: center; word-wrap: break-word;'></td><td style='text-align: center; word-wrap: break-word;'>结项</td></tr><tr><td style='text-align: center; word-wrap: break-word;'>提交内容</td><td style='text-align: center; word-wrap: break-word;'></td><td style='text-align: center; word-wrap: break-word;'></td><td style='text-align: center; word-wrap: break-word;'>UML类图 项目代码</td><td style='text-align: center; word-wrap: break-word;'></td><td style='text-align: center; word-wrap: break-word;'></td><td style='text-align: center; word-wrap: break-word;'>结项报告 代码、类图 展示视频</td></tr></table>

实验课程共 16 个学时，6 个实验项目，总成绩为 30 分。

## 目录

01 实验目的    
02 实验任务    
03 实验原理    
04 实验步骤

实验与创新实践教育中心

#### 实验目的

- 深入理解简单工厂与工厂方法模式的设计意图及结构

• 结合案例，规范绘制两种模式的UML类图

• 掌握重构方法，通过代码实现并应用两种工厂模式

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//4c0ea5ed-b687-4ea3-81e8-ceee96c623fe/markdown_4/imgs/img_in_image_box_1334_405_1766_855.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A41%3A01Z%2F-1%2F%2F6a971ead3382f364ce7c5780dd9553b930cf0b0f01234840d6fa74f4e288d493" alt="Image" width="22%" /></div>


#### 实验任务

1. 深入学习简单工厂模式与工厂方法模式的设计原理，结合实例完成两种模式的UML结构图绘制；

2. 对系统中的敌机、道具创建逻辑进行代码重构：

• 采用简单工厂实现道具对象的创建

• 采用工厂方法模式实现敌机对象的创建

3. 完成本次迭代开发清单中的全部任务

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//a126afb4-e676-4438-9f4a-c91b775a8499/markdown_0/imgs/img_in_image_box_1295_619_1660_909.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A55Z%2F-1%2F%2F1f7bc546c6edddcb16ea7c7dde7c76ee15ff7f71ea0de4434919e0c29a0c7a88" alt="Image" width="19%" /></div>


#### 实验步骤：道具创建场景分析（1）

## 道具 创建场景 分析

游戏中有5种道具：加血、火力、超级火力、炸弹和冰冻道具。

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//a126afb4-e676-4438-9f4a-c91b775a8499/markdown_1/imgs/img_in_image_box_937_538_1531_620.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A56Z%2F-1%2F%2F0340907eaf5d2bee23d0773286a359f08bd3c0fe232f7f2895315ee8f4e77f6b" alt="Image" width="30%" /></div>


所有道具均在特定敌机被击毁时按预设概率随机掉落生成，生成后以固定速度向屏幕下方移动，英雄机碰撞后自动触发对应效果，不同道具的效果存在差异。

#### 实验步骤：道具创建场景分析（2）

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//a126afb4-e676-4438-9f4a-c91b775a8499/markdown_2/imgs/img_in_image_box_97_204_172_299.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A56Z%2F-1%2F%2F1e678fad48e4d9bcc1a6c7e09dacaa72989c3f9b8b62f7e5906d6c53f2063b3a" alt="Image" width="3%" /></div>


#### 请思考：

1. 掉落道具的职责分给哪个类?

##### Game类

##### 敌机子类

#### 敌机父类

2. 如果增加一种新型道具，需要修改哪些代码？

封装变化 → 将所有对象的创建集中在一个地方管理

#### 实验步骤：简单工厂模式结构图

简单工厂模式（Simple Factory Pattern）属于创建型设计模式，由一个工厂类根据传入的参数，决定创建并返回哪一种产品类实例。

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//a126afb4-e676-4438-9f4a-c91b775a8499/markdown_3/imgs/img_in_image_box_289_390_1528_957.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A58Z%2F-1%2F%2Fe7bc06bb56fa0cfd50f8df17e39c529e25e4de88444f91a1e35074a29e0d73cf" alt="Image" width="64%" /></div>


<div style="text-align: center;"><div style="text-align: center;">简单工厂模式结构图</div> </div>


#### 实验步骤：简单工厂模式示例代码

##### ① 创建一个接口, 充当产品角色;

public interface Product {
    void show();
}

##### ② 创建两个实体类，充当具体产品角色；

public class ConcreteProductA implements Product {
@Override
public void show() {
    System.out.println("I am product A.");
}
public class ConcreteProductB implements Product {
@Override
public void show() {
    System.out.println("I am product B.");
}
}

##### ③ 创建一个简单工厂类，负责创建产品；

public class SimpleFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Unknown product type!");
        }
    }
}

##### ④ 客户端调用工厂方法获取不同类型的产品

public class SimpleFactoryPatternDemo {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.show();
        Product productB = SimpleFactory.createProduct("B");
        productB.show();
    }
}

#### 实验步骤：敌机创建场景分析（1）

敌机

创建场景

分析

游戏中，敌机是核心作战单位，目前主要涵盖5种类型：

普通、精英、精锐、王牌和Boss 敌机。

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//9836f2f7-9302-4cf5-a788-6ca95a3e4851/markdown_0/imgs/img_in_image_box_860_492_1528_595.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A55Z%2F-1%2F%2Fc17fc97d7a2daa32922521789ae66e5725877e51c43914b2c8140cfa54420205" alt="Image" width="34%" /></div>


不同类型敌机在属性、行为及生成逻辑上存在显著差异，且游戏运行过程中会持续、随机生成各类敌机，生成逻辑分散且复杂。另外，随着游戏版本的迭代，未来极可能引入更多新型敌机，系统必须具备良好的可扩展性。

#### 实验步骤：敌机创建场景分析（2）

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//9836f2f7-9302-4cf5-a788-6ca95a3e4851/markdown_1/imgs/img_in_image_box_97_203_174_299.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A56Z%2F-1%2F%2F6f19ee5d1c0aeaa308c51492cbe7ceacc0a49de0f33c68aeb9e2ed1d9b4edb83" alt="Image" width="4%" /></div>


#### 请思考：

### 针对接口编程，而不是针对实现编程！

1. 目前在哪个类创建敌机？如何创建？

if (enemyAircrafts.size() < enemyMaxNumber) {
    enemyAircrafts.add new MobEnemy
    (int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.MOB_ENEMY_IMAGE.getWidth()))
    (int) (Math.random() * Main.WINDOW_HEIGHT * 0.05),
    speedX: 0,
    speedY: 10,
    hp: 30
});
Game类

2. 若敌机增加一种属性 “防御力”，需要改动哪些代码？

3. 若增加一种新型敌机，需要改动哪些代码？

违反

单一职责

违反

开闭原则

违反

依赖倒转

#### 实验步骤：工厂方法模式结构图

工厂方法模式（Factory Method Pattern）也是一种创建型设计模式，其在父类中提供一个创建对象的方法，由子类决定实例化对象的类型。

3 创建者（Creator）类声明返回产品对象的工厂方法。该方法的返回对象类型必须与产品接口相匹配。

你可以将工厂方法声明为抽象方法，强制要求每个子类以不同方式实现该方法。或者，你也可以在基础工厂方法中返回默认产品类型。

注意，尽管它的名字是创建者，但它最主要的职责并不是创建产品。一般来说，创建者类包含一些与产品相关的核心业务逻辑。工厂方法将这些逻辑处理从具体产品类中分离出来。打个比方，大型软件开发公司拥有程序员培训部门。但是，这些公司的主要工作还是编写代码，而非生产程序员。

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//9836f2f7-9302-4cf5-a788-6ca95a3e4851/markdown_2/imgs/img_in_image_box_577_371_1356_1060.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A58Z%2F-1%2F%2F780d138db34d48c85e399f1d06d8d7188f2ad8422bbac4eee01304f3a2ca607f" alt="Image" width="40%" /></div>


关键代码：创建过程

在其子类执行

#### 实验步骤：图形工厂举例（工厂方法模式）

假如我们要开发一个图形工厂，可生产3种类型的图形产品：圆形、长方形、正方形。我们该如何用工厂方法模式实现呢？

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//9836f2f7-9302-4cf5-a788-6ca95a3e4851/markdown_3/imgs/img_in_image_box_978_287_1755_923.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A59Z%2F-1%2F%2F6da3147dd385cd84ace4efd542a23b970500881b5d127c8aee256189f8ef48cc" alt="Image" width="40%" /></div>


#### 实验步骤：图形工厂举例（1）

产品系：创建 Shape 接口和实现该接口的三个图形实体类。

① 创建Shape接口, 充当产品角色;

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//9836f2f7-9302-4cf5-a788-6ca95a3e4851/markdown_4/imgs/img_in_image_box_47_389_955_993.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A41%3A01Z%2F-1%2F%2F71ee5a08e706e27be3a09f48184057089b962059b8be55935f3fe9667544bd23" alt="Image" width="47%" /></div>


<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//9836f2f7-9302-4cf5-a788-6ca95a3e4851/markdown_4/imgs/img_in_image_box_1025_255_1733_968.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A41%3A01Z%2F-1%2F%2F3aeeebe39db4333aeb603a17ef551f14312353ce38edfda42006e21c511c767e" alt="Image" width="36%" /></div>


② 创建三个图形实体类，充当具体产品角色；

#### 实验步骤：图形工厂举例（2）

工厂系：创建工厂接口 ShapeFactory和实现该接口的三个具体工厂实体类。

③ 创建工厂接口ShapeFactory，充当创建者角色；

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//413af2f3-c27d-436f-99f0-b9a7b8c856e7/markdown_0/imgs/img_in_image_box_60_501_946_869.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A57Z%2F-1%2F%2Fadbc4bbbca8f0a830e6a82d651e96a087db91a8348dfa2887e7f702ad8610af6" alt="Image" width="46%" /></div>


public interface ShapeFactory {
    public abstract Shape createShape();
}

④ 创建三个工厂实体类，充当具体创建者角色。

public class RectangleFactory implements ShapeFactory {

@Override
public Shape createShape() {
    return new Rectangle();
}
}

public class SquareFactory implements ShapeFactory {

@Override
public Shape createShape() {
    return new Square();
}
}

public class CircleFactory implements ShapeFactory {

@Override
public Shape createShape() {
    return new Circle();
}

#### 实验步骤：图形工厂举例（3）

⑤ 客户端FactoryPatternDemo 类使用 ShapeFactory 来获取不同的Shape对象。

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//413af2f3-c27d-436f-99f0-b9a7b8c856e7/markdown_1/imgs/img_in_image_box_84_387_900_982.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A59Z%2F-1%2F%2F5a1be9da8d31037a45b0a11965713e82a26a3df064d8e4184aba4cd536639733" alt="Image" width="42%" /></div>


public static void main(String[] args) {
    ShapeFactory shapeFactory;
    Shape shape;

    //获取Circle的对象，并调用它的draw方法
    shapeFactory = new CircleFactory();
    shape = shapeFactory.createShape();
    shape.draw();

    //获取Rectangle的对象，并调用它的draw方法
    shapeFactory = new RectangleFactory();
    shape = shapeFactory.createShape();
    shape.draw();

    //获取Square的对象，并调用它的draw方法
    shapeFactory = new SquareFactory();
    shape = shapeFactory.createShape();
    shape.draw();
}

Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.

#### 实验步骤：图形工厂举例（4）

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//413af2f3-c27d-436f-99f0-b9a7b8c856e7/markdown_2/imgs/img_in_image_box_103_174_179_266.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A40%3A59Z%2F-1%2F%2F274a4f951e19142cf8831a1aeec3f3417962bb349fabd769ed46718fbbbda780" alt="Image" width="3%" /></div>


#### 请思考：如何添加一个三角形图形？

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//413af2f3-c27d-436f-99f0-b9a7b8c856e7/markdown_2/imgs/img_in_image_box_110_335_884_1020.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A41%3A00Z%2F-1%2F%2Ffe61cc8f5dcfbad1140b4bef9fb0a10e0d3b97ce39032e5d9a7088ab0a2b5a76" alt="Image" width="40%" /></div>


public static void main(String[] args) {
    ShapeFactory shapeFactory;
    Shape shape;

    //获取Circle的对象，并调用它的draw方法
    shapeFactory = new CircleFactory();
    shape = shapeFactory.createShape();
    shape.draw();

    //获取Rectangle的对象，并调用它的draw方法
    shapeFactory = new RectangleFactory();
    shape = shapeFactory.createShape();
    shape.draw();

    //获取Square的对象，并调用它的draw方法
    shapeFactory = new SquareFactory();
    shape = shapeFactory.createShape();
    shape.draw();

    //获取Triangle的对象，并调用它的draw方法
    shapeFactory = new TriangleFactory();
    shape = shapeFactory.createShape();
    shape.draw();
}

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//413af2f3-c27d-436f-99f0-b9a7b8c856e7/markdown_2/imgs/img_in_image_box_1733_536_1840_641.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A41%3A00Z%2F-1%2F%2F0987f9900dc1ddef0407cf8e36353ebd65b1d7f263f3e4911005035214e5ca5f" alt="Image" width="5%" /></div>


#### 思考题

#### 若采用抽象工厂模式创建敌机和道具是否合适？

A. 合适

B. 不合适

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//413af2f3-c27d-436f-99f0-b9a7b8c856e7/markdown_3/imgs/img_in_image_box_882_539_1741_996.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A41%3A01Z%2F-1%2F%2Ff84965afc07dddaa4939d741f4ba563910dcfe485d5bba3c950a45ef266c4f9c" alt="Image" width="44%" /></div>


产品等级结构

#### 本次迭代开发目标（1）

### 任务清单(CheckList)

##### UML类图设计

① 结合实例，按照规范绘制简单工厂模式与工厂方法模式的结构类图

##### 设计模式应用

② 完成代码重构，使用简单工厂模式实现道具创建，使用工厂方法模式实现敌机创建

##### 敌机生成

③ 界面上可观察到4种敌机（Boss机除外）按周期随机出现

##### 敌机移动

④ 精锐和王牌敌机向屏幕下方移动，且可左右移动

<div style="text-align: center;"><img src="https://pplines-online.bj.bcebos.com/deploy/official/paddleocr/pp-ocr-vl-15//413af2f3-c27d-436f-99f0-b9a7b8c856e7/markdown_4/imgs/img_in_image_box_1402_910_1633_1002.jpg?authorization=bce-auth-v1%2FALTAKzReLNvew3ySINYJ0fuAMN%2F2026-04-03T06%3A41%3A02Z%2F-1%2F%2Fb7d4cad49535ac28ae400c8f7a51cb476d9e3d2df4bfd986fd11e973e1170419" alt="Image" width="12%" /></div>


#### 本次迭代开发目标（2）

### 任务清单(CheckList)

##### 敌机攻击

⑤ 精锐敌机按设定周期向下直射双排子弹，王牌敌机采用扇形散射弹道，单次同时发射 3 颗子弹

##### 道具生成

⑥ 精锐敌机、王牌敌机被击毁时按概率随机掉落某一种道具；其中精锐敌机可掉落 4 种道具（不含冰冻）中的一种，王牌敌机可掉落 5 种道具中的一种

##### 道具效果

⑦ 除加血道具外，其余道具生效时在控制台输出提示信息即可

### 同学们，请开始实验吧！

THANK YOU

实验与创新实践教育中心

