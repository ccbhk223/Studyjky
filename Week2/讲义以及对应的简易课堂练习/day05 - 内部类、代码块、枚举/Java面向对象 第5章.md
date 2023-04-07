# Java面向对象 第5章 - 内部类、代码块、枚举

## 今日内容

- 内部类(很抽象)
  - 知识完整性（成员变量，方法，构造器，代码块，内部类）
  - 只关注语法即可，实际开发几乎无用，主要是sun公司自己用，能理解即可
  - **匿名内部类（重点,必须掌握的）**
- 代码块（成员变量，方法，构造器，代码块，内部类）
- 枚举
  - 面向对象的一种特殊类型，做信息分类和信息标志的。

 

## 教学目标

- [ ] 说出内部类的概念
  - [ ] 定义在一个类里面的类就是内部类。

- [ ] 能够写出静态代码块的
  - [ ] static{ 
  - [ ] }




# 第1章 内部类

## 1.1 内部类基本概念

内部类即在类中定义另外一个类，是一个相对概念。

内部类分为成员内部类与局部内部类。

定义时是一个正常定义类的过程，同样包含各种修饰符、继承与实现关系等。

内部类可以直接访问外部类的所有成员。

外部类编译后会出现两个class文件。

(在日常的企业级开发中，我们很少会使用到内部类来实现业务逻辑)

**可以使用的修饰符：访问权限修饰符、static、final、abstract**



## 1.2 成员内部类

###  1.2.1 成员内部类格式

成员内部类：在一个类的内部申明一个类，当你使用内部类时，可以通过外部类对象访问，就跟操作成员属性、成员方法一样。

定义格式

```java
public class Outer{
	class Inner{
		//其他代码
	}
}
```

访问格式：

```java
Outer.Inner  x = new Outer().new Inner();
```



### 1.2.2 案例

NestedClass成员内部类

```java
/**  
* @ClassName: NestedClass  
* @Description: 成员内部类
*    
* 外部类
*/
public class NestedClass {
	/**  
	* @Fields name : 姓名  
	*/  
	private String name = "Jack";
	
	/**  
	* @ClassName: InnerClass  
	* @Description: 成员内部类
	*    
	*/
	public class InnerClass {
		public void innerMethod() {
			System.out.println("内部类的方法被调用了");
			System.out.println("外部类的成员变量name的值为:"+name);
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
```



NestedClassDemo成员内部类测试类

```java
/**  
* @ClassName: NestedClassDemo  
* @Description: 成员内部类测试类
*    
*    内部类是一个相对概念，即类中定义类
*    内部类可以直接访问外部类的所有成员
*    
*    内部类：
*    	成员内部类：定义在成员位置
*    	局部内部类：定义在局部位置，即一个方法内
*    
*    成员内部类创建对象，必须有外部类对象，才能有内部类对象
*    Outer.Inner  x = new Outer().new Inner();
*/
public class NestedClassDemo {
	public static void main(String[] args) {
		//创建成员内部类对象
		NestedClass.InnerClass inner = new NestedClass().new InnerClass();
		inner.innerMethod();
	}
}
```



## 1.3 局部内部类

### 1.3.1 局部内部类格式

局部内部类：在一个类的方法中申明内部类，当你调用这个方法时，才可以使用内部类（用的较少）

定义格式

```java
public class Outer{
	public void method{
		class Inner{
			//其他代码
		}
	}
}
```

访问格式：

```java
只能在外部类的方法中创建对象并访问。
```



### 1.3.1 案例

NestedClass局部内部类

```java
/**  
* @ClassName: NestedClass  
* @Description: 局部内部类
*    
*    外部类
*/
public class NestedClass {
	/**  
	* @Fields name : 姓名  
	*/  
	private String name = "Jack";
	
	/**  
	* @Title: outerMethod  
	* @Description: 外部类的方法      
	*/
	public void outerMethod() {

		/**  
		* @ClassName: InnerClass  
		* @Description: 局部内部类
		*/
		class InnerClass {
			public void innerMethod() {
				System.out.println("内部类的方法被调用了");
				System.out.println("外部类的成员变量name的值为:"+name);
			}
		}
		
		//定义好类之后可以使用类
		InnerClass inner = new InnerClass();
		inner.innerMethod();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
```



NestedClassDemo局部内部类测试类

```java
/**  
* @ClassName: NestedClassDemo  
* @Description: 局部内部类测试类
*    
*    内部类是一个相对概念，即类中定义类
*    内部类可以直接访问外部类的所有成员
*    
*    内部类：
*    	成员内部类：定义在成员位置
*    	局部内部类：定义在局部位置，即一个方法内，符合先定义再使用！
*    
*    成员内部类创建对象，必须有外部类对象，才能有内部类对象
*    Outer.Inner  x = new Outer().new Inner();
*/
public class NestedClassDemo {
	public static void main(String[] args) {
		//创建外部类对象
		NestedClass nc = new NestedClass();
		//通过外部类对象调用方法访问局部内部类对象的操作
		nc.outerMethod();
	}
}
```



## 1.4 匿名内部类

### 1.4.1 概述

匿名内部类：在创建一个类时没有类名，**简化代码**时创建的，在实现一个接口或new一个类时创建。

匿名内部类是局部内部类的一种。

过程：

临时定义一个类型的子类

定义后即刻创建刚刚定义的这个类的对象

目的：

匿名内部类是创建某个类型子类对象的快捷方式。

我们为了临时定义一个类的子类，并创建这个子类的对象而使用匿名内部类。



### 1.4.2 匿名内部类格式

将定义子类与创建子类对象两个步骤由一个格式一次完成。

虽然是两个步骤，但是两个步骤是连在一起的、即时的。

匿名内部类如果不定义变量引用，则也是匿名对象。

格式如下：

```java
new 父类(){
	//重写需要重写的方法
};
```



例如：

已经存在的父类：

```java
public abstract class Person{
	public abstract void eat();
}
```



定义并创建该父类的子类对象，并用多态的方式赋值给父类引用变量

```java
Person  p = new Person(){
	public void eat() {
		System.out.println(“我吃了”);
	}
};
```



### 1.4.3 案例

Animal抽象父类

```java
/**  
* @ClassName: Animal  
* @Description: 抽象父类Animal
*    
*    吃饭,睡觉的抽象方法
*/
public abstract class Animal {
	//抽象方法
	/**  
	* @Title: eat  
	* @Description: 吃饭的方法      
	*/
	public abstract void eat();
	/**  
	* @Title: sleep  
	* @Description: 睡觉的方法      
	*/
	public abstract void sleep();
}
```



Dog具体子类

```java
/**  
* @ClassName: Dog  
* @Description: 子类Dog类
*    
*    定义子类,重写父类方法
*/
public class Dog extends Animal {
	//重写方法
	/**  
	* @Title: eat  
	* @Description: 狗吃饭的方法
	* @see com.igeek_04.Animal#eat()
	*/
	@Override
	public void eat() {
		System.out.println("吃骨头");
	}

	/**  
	* @Title: sleep  
	* @Description: 狗睡觉的方法 
	* @see com.igeek_04.Animal#sleep()
	*/
	@Override
	public void sleep() {
		System.out.println("趴着睡");
	}
}
```



AnonymousInnerClass匿名内部类的测试类

```java
/**  
* @ClassName: AnonymousInnerClass  
* @Description: 匿名内部类的测试类
*    
*  匿名内部类
*  
*  目的:创建某个类(接口)的子类对象
*  		步骤1:定义带名字的子类
*  		步骤2:创建对象
*  
*  匿名内部类是创建某个类型子类对象的快捷方式
*  我们为了临时定义一个类的子类，并创建这个子类的对象而使用匿名内部类。
*  
*  将定义子类与创建子类对象两个步骤由一个格式一次完成
*  
*  匿名内部类格式:
*  	new 父类(){
*  		//重写需要重写的方法
*  	};	
*/
public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		
		//使用有名字的子类(多态使用)
		Animal ad = new Dog();
		ad.eat();
		ad.sleep();
		
		//使用匿名内部类
		Animal a = new Animal(){

			/**  
			* @Title: eat  
			* @Description: 吃草的方法  
			* @see com.igeek_04.Animal#eat()
			*/
			@Override
			public void eat() {
				System.out.println("吃草");
			}

			/**  
			* @Title: sleep  
			* @Description: 睡觉的方法  
			* @see com.igeek_04.Animal#sleep()
			*/
			@Override
			public void sleep() {
				System.out.println("仰着睡");
			}
		};
		
		a.eat();
		a.sleep();
	}
}
```



## 1.5 静态内部类

### 1.5.1 静态内部类格式

静态内部类：在一个类的内部申明一个用static修饰的类，当你使用内部类时，可以通过外部类访问，就跟操作静态成员属性、静态成员方法一样。

定义格式：

```java
public class Outer{
	static class Inner{
		//其他代码
	}
}
```



访问格式：

```java
//同类中可以省略外部类名访问
Inner x = new Inner();
//不同类中
Outer.Inner i = new Outer.Inner();
```



# 第2章 代码块

## 2.1 引入

类的成分：
​    1.成员变量
​    2.构造器
​    3.成员方法
​    4.代码块
​    5.内部类

我们已经学完了成员变量，构造器，成员方法，接下来我们来介绍以下代码快，代码块按照有无static可以分为静态代码块和实例代码块。



## 2.2 静态代码块

**静态代码块**
​         必须有static修饰，必须放在类下。与类一起加载执行。

**格式**

```java
static{
     // 执行代码
}
```

**特点**：

- 每次执行类，加载类的时候都会先执行静态代码块一次。
- 静态代码块是自动触发执行的，只要程序启动静态代码块就会先执行一次。
- 作用：在启动程序之前可以做资源的初始化，一般用于初始化静态资源。

**案例演示**

```java
public class DaimaKuaiDemo01 {
    public static String sc_name ;

    // 1.静态代码块
    static {
        // 初始化静态资源
        sc_name = "张三";
        System.out.println("静态代码块执行！");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行");
        System.out.println(sc_name);
    }
}

```



## 2.3 实例代码块

**实例代码块**
​         没有static修饰，必须放在类下。与对象初始化一起加载。

**格式**

```java
{
     // 执行代码
}
```

**特点**：

- 无static修饰。属于对象，与对象的创建一起执行的。
- 每次调用构造器初始化对象，实例代码块都要自动触发执行一次。
- 实例代码块实际上是提取到每一个构造器中去执行的。
- 作用：实例代码块用于初始化对象的资源。

**案例演示**

```java
public class DaimaKuaiDemo02 {
   
    private String name ;

    // 实例代码块。 无static修饰。
    {
        System.out.println("实例代码块执行");
        name = "dl";
    }

    // 构造器
    public DaimaKuaiDemo02(){
        //System.out.println("实例代码块执行");
    }

    // 有参数构造器
    public DaimaKuaiDemo02(String name){
        //System.out.println("实例代码块执行");
    }

    public static void main(String[] args) {
        // 匿名对象，创建出来没有给变量。
        new DaimaKuaiDemo02();
        new DaimaKuaiDemo02();
        new DaimaKuaiDemo02("xulei");
    }
}
// 输出三次：实例代码块执行
```



# 第3章 枚举

## 3.1 不使用枚举存在的问题

假设我们要定义一个人类，人类中包含姓名和性别。通常会将性别定义成字符串类型，效果如下：

```java
public class Person {
    private String name;
    private String sex;

    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
	
    // 省略get/set/toString方法
}
```

```java
public class Demo01 {
    public static void main(String[] args) {
        Person p1 = new Person("张三", "男");
        Person p2 = new Person("张三", "abc"); // 因为性别是字符串,所以我们可以传入任意字符串
    }
}
```

不使用枚举存在的问题：可以给性别传入任意的字符串，导致性别是非法的数据，不安全。



## 3.2 枚举的作用与应用场景

枚举的作用：一个方法接收的参数是固定范围之内的时候，那么即可使用枚举。



## 3.3 枚举的基本语法

### 3.3.1 枚举的概念

枚举是一种特殊类。枚举是有固定实例个数的类型，我们可以把枚举理解成有固定个数实例的多例模式。



### 3.3.2 定义枚举的格式

```java
enum 枚举名 {
    第一行都是罗列枚举实例,这些枚举实例直接写大写名字即可。
}
```



### 3.3.3 入门案例

1.定义枚举：BOY表示男，GIRL表示女

```java
enum Sex {
    BOY, GIRL; // 男，女
}
```



2.Person中的性别有String类型改为Sex枚举类型

```java
public class Person {
    private String name;
    private Sex sex;

    public Person() {
    }

    public Person(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }
    // 省略get/set/toString方法
}
```



3.使用是只能传入枚举中的固定值

```java
public class Demo02 {
    public static void main(String[] args) {
        Person p1 = new Person("张三", Sex.BOY);
        Person p2 = new Person("张三", Sex.GIRL);
        Person p3 = new Person("张三", "abc");
    }
}
```



### 3.3.4 枚举的其他内容

枚举的本质是一个类，我们刚才定义的Sex枚举最终效果如下：

```java
enum Sex {
    BOY, GIRL; // 男，女
}

// 枚举的本质是一个类，我们刚才定义的Sex枚举相当于下面的类
final class SEX extends java.lang.Enum<SEX> {
    public static final SEX BOY = new SEX();
    public static final SEX GIRL = new SEX();
    public static SEX[] values();
    public static SEX valueOf(java.lang.String);
    static {};
}
```

枚举的本质是一个类，所以枚举中还可以有成员变量，成员方法等。

```java
public enum Sex {
    BOY(18), GIRL(16);

    public int age;

    Sex(int age) {
        this.age = age;
    }

    public void showAge() {
        System.out.println("年龄是: " + age);
    }
}
```

```java
public class Demo03 {
    public static void main(String[] args) {
        Person p1 = new Person("张三", Sex.BOY);
        Person p2 = new Person("张三", Sex.GIRL);

        Sex.BOY.showAge();
        Sex.GIRL.showAge();
    }
}
```



## 3.4 枚举的应用

**枚举的作用：枚举通常可以用于做信息的分类，如性别，方向，季度等。**

枚举表示性别：

```java
public enum Sex {
    MAIL, FEMAIL;
}
```

枚举表示方向：

```java
public enum Orientation {
    UP, RIGHT, DOWN, LEFT;
}
```

枚举表示季度

```java
public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
}
```



## 3.5 小结

- 枚举类在第一行罗列若干个枚举对象。（多例）
- 第一行都是常量，存储的是枚举类的对象。
- 枚举是不能在外部创建对象的，枚举的构造器默认是私有的。
- 枚举通常用于做信息的标志和分类。