# Java基础知识 第5天

【学习目标】理解、了解、应用、记忆



**1. 【理解】能够独立编写代码定义方法并调用方法**

a. 【理解】阐述方法的定义格式

b. 【应用】独立编写代码,完成求和方法的定义和调用 

c. 【理解】能够画图阐述方法调用的执行流程



**2.【应用】能够独立编写代码完成方法的相关练习**

a. 【应用】定义方法完成练习：获取两个数据中较大值、比较两个数据是否相等、获取三个数据中的较大值

b. 【应用】阐述返回值为void的方法与其他返回值类型方法有什么不同

c. 【应用】定义方法完成打印1到n之间的数据练习、打印所有的水仙花数练习



**3. 【理解】理解方法重载及不同类型参数在方法中如何传递**

a. 【理解】阐述什么是方法重载及方法重载的特点

b. 【应用】独立编写代码完成方法重载练习之比较数据是否相等的练习

c. 【理解】阐述基本数据类型作为参数传递的特点

d. 【理解】阐述引用数据类型作为参数传递的特点



**4.【应用】独立编写代码完成方法操作数组的练习**

a. 【应用】独立编写代码，定义方法完成: 数组获取最值练习、数组元素求和练习



**5.【应用】String类**

a. 【应用】能够熟练写出String类的常用构造方法

b. 【理解】能够阐述创建字符串对象两种方式的区别

c. 【应用】能够独立写出String判断功能与获取功能相关案例

d. 【应用】能够独立写出String转换功能与其它功能相关案例



# 第1章 方法的概述及基本使用

## 1.1 定义方法

### 1.1.1 方法的概述

​		假设有一个游戏程序，程序在运行过程中，要不断地发射炮弹(植物大战僵尸)。发射炮弹的动作需要编写100行的代码，在每次实现发射炮弹的地方都需要重复地编写这100行代码，这样程序会变得很臃肿，可读性也非常差。为了解决代码重复编写的问题，可以将发射炮弹的代码提取出来放在一个{}中，并为这段代码起个名字，这样在每次发射炮弹的地方通过这个名字来调用发射炮弹的代码就可以了。上述过程中，所提取出来的代码可以被看作是程序中定义的一个方法，程序在需要发射炮弹时调用该方法即可。

简单的说：方法就是完成特定功能的代码块 Math.random();Arrays.sort();

在很多语言里面都有函数的定义 , 函数在Java中被称为方法。



### 1.1.2 方法语法

```java
修饰符 返回值类型/void 方法名(数据类型 参数名1，数据类型 参数名2…) {

			//方法体
			
    		//没有返回值 return;
			return 返回值;

}
```



### 1.1.3 方法语法名词解释

修饰符：目前记住 public公开的  static静态的

返回值类型： 用于限定返回值的数据类型

方法名：一个名字，为了方便我们调用方法

数据类型：用于接收调用方法时传入的数据的类型

参数名：用于接收调用方法时传入的数据的变量

方法体：完成功能的代码

return 结束方法，把返回值带给调用者。不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。 



注意：

1.方法定义时， 方法必须定义在类中的方法外， 方法不能定义在另一个方法的内部 。

2.method()被 main ()调用后直接输出结果，而main()并不需要 method()的执行结果，所以被定义为void 。 



## 1.2 定义方法的几种形式

```java
1 无返回值，没有形式参数列表

2 有返回值，无形式参数列表

3 无返回值，有形式参数列表

4 有返回值，有形式参数列表

5 静态方法
```



## 1.3 方法的课堂练习

### 1.3.1 方法的练习1 - 有返回值

```java
//练习1：键盘录入两个数据，定义方法返回两个数中的较大值

//练习2：键盘录入两个数据，定义方法比较两个数是否相等

//练习3：键盘录入三个数据，定义方法返回三个数中的最大值
```



### 1.3.2 方法的练习2 - void无返回值

```java
//练习4：写一个方法，传递一个整数(大于1)，在控制台打印1到该数据的值。

//练习5：写一个方法，把所有的水仙花数打印在控制台
```



# 第2章 方法的重载

## 2.1 方法重载的概述和基本使用

在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。



方法重载：

与返回值类型无关，只看方法名和参数列表，在调用时，虚拟机通过参数列表的不同来区分同名方法。



```java
public class MethodDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// 求和
		int result = sum(a, b);
		System.out.println("result:" + result);

		int c = 30;
		// 求和
		//int result2 = sum2(a,b,c);
		//System.out.println("result2:"+result2);
		result = sum(a,b,c);
		System.out.println("result:"+result);
	}
	
	/**  
	 @Title: sum  
	 @Description: 两个float类型的数据求和  
	 @param a
	 @param b
	 @return    
	*/
	public static float sum(float a,float b) {
		return a + b;
	}

	/**  
	 @Title: sum  
	 @Description: 三个整数的求和 
	 @param a
	 @param b
	 @param c
	 @return    
	*/
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}
	
	/**  
	 @Title: sum2  
	 @Description: 三个整数的求和  
	 @param a
	 @param b
	 @param c
	 @return    
	*/
	/**
	public static int sum2(int a, int b, int c) {
		return a + b + c;
	}*/
	
	/**  
	 @Title: sum  
	 @Description: 两个整数的求和  
	 @param a
	 @param b
	 @return    
	*/
	public static int sum(int a, int b) {
		return a + b;
	}
}
```



## 2.2 方法重载练习

```java
//需求：比较数据是否相等。参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中进行测试
```



# 第3章 参数传递

形式参数：用于接收实际数据的变量

实际参数：实际参与运算的变量



## 3.1 方法的形式参数为基本数据类型

方法的参数是基本类型的时候：形式参数的改变不影响实际参数。

```java
//方法的参数是基本类型的时候：形式参数的改变不影响实际参数
public class ArgsDemo {
	
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
		change(a, b);
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
	}

	/**  
	 @Title: change  
	 @Description: 改变形参的值  
	 @param a
	 @param b    
	*/
	public static void change(int a, int b) { // a=10,b=20
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
		a = b;     // a=20;
		b = a + b; // b=40;
		System.out.println("a:" + a + ",b:" + b);// a:20,b:40
	}

}
```



## 3.2 方法的形式参数是基本类型图解

![image-20201020201504821](image\image-20201020201504821.png)



## 3.3 方法的形式参数为引用数据类型  String?  Integer?

方法的参数是引用类型：形式参数的改变直接影响实际参数

```java
public class ArgsDemo2 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 1, 2, 3, 4, 5 };
		
        // 遍历数组
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("----------------");
		change(arr);
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
	/**  
	 @Title: change  
	 @Description: 如果元素是偶数，值就变为以前的2倍 
	 @param arr    
	*/
	public static void change(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			// 如果元素是偶数，值就变为以前的2倍
			if (arr[x] % 2 == 0) {
				arr[x] = 2;
			}
		}
	}
}
```



## 3.4 方法的形式参数是引用类型图

![image-20201020201737097](image\image-20201020201737097.png)

 

## 3.5 通过方法操作数组的课堂练习

```java
//练习1：把获取数组最值改进为方法实现，并调用方法

//练习2：写一个方法，用于对数组进行求和，并调用方法。
```



# 第4章 String类

由多个字符组成的一串数据

字符串其本质是一个字符数组



## 4.1 String类概述

通过JDK提供的API，查看String类的说明

A:"abc"是String类的一个实例,或者成为String类的一个对象

B:字符串字面值"abc"也可以看成是一个字符串对象

C:字符串是常量，一旦被赋值，就不能被改变

D:字符串本质是一个字符数组



## 4.2 String类的构造方法

```java
String(String original):把字符串数据封装成字符串对象

String(char[] value):把字符数组的数据封装成字符串对象

String(char[] value, int index, int count):把字符数组中的一部分数据封装成字符串对象
```



**案例**

```java
public class StringDemo {
	public static void main(String[] args) {
		//方式1
		//String(String original):把字符串数据封装成字符串对象
		String s1 = new String("hello");
		System.out.println("s1:"+s1);
		System.out.println("---------");
		
		//方式2
		//String(char[] value):把字符数组的数据封装成字符串对象
		char[] chs = {'h','e','l','l','o'};
		String s2 = new String(chs);
		System.out.println("s2:"+s2);
		System.out.println("---------");
		
		//方式3
		//String(char[] value, int index, int count):把字符数组中的一部分数据封装成字符串对象
		//String s3 = new String(chs,0,chs.length);
		String s3 = new String(chs,1,3);
		System.out.println("s3:"+s3);
		System.out.println("---------");
		
		//方式4
		String s4 = "hello";
		System.out.println("s4:"+s4);

	}
}
```



## 4.3 创建字符串对象两种方式的区别

通过构造方法创建的字符串对象和直接赋值方式创建的字符串对象有什么区别呢?

- 通过构造方法创建字符串对象是在堆内存。

- 直接赋值方式创建对象是在方法区的常量池。

```java
public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		System.out.println("s1==s2:"+(s1==s2)); //false
		
		String s3 = "hello";
		System.out.println("s1==s3:"+(s1==s3)); //false
		System.out.println("s2==s3:"+(s2==s3)); //true

	}
}
```

注意：==比较

基本数据类型：比较的是基本数据类型的值是否相同

引用数据类型：比较的是引用数据类型的地址值是否相同



![image-20201020204419443](image\image-20201020204419443.png) 

注意：直接赋值方式创建对象是在方法区的常量池，为了方便字符串的重复使用。



## 4.4 String类的判断功能

```java
boolean equals(Object obj):比较字符串的内容是否相同

boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写

boolean startsWith(String str):判断字符串对象是否以指定的str开头

boolean endsWith(String str):判断字符串对象是否以指定的str结尾
```



**案例**

```java
//Object:是类层次结构中的根类，所有的类都直接或者间接的继承自该类。如果一个方法的形式参数是Object，那么这里我们就可以传递它的任意的子类对象。
public class StringDemo {
	public static void main(String[] args) {
		//创建字符串对象
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		
		//boolean equals(Object obj):比较字符串的内容是否相同
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("-----------");
		
		//boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("-----------");
		
		//boolean startsWith(String str):判断字符串对象是否以指定的str开头
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.startsWith("ll"));
	}
}
```



**练习**

```java
//需求:模拟登录,给三次机会,并提示还有几次
```



## 4.5 String类的获取功能

```java
int length():获取字符串的长度，其实也就是字符个数

char charAt(int index):获取指定索引处的字符

int indexOf(String str):获取str在字符串对象中第一次出现的索引

String substring(int start):从start开始截取字符串

String substring(int start,int end):从start开始，到end结束截取字符串。包括start，不包括end
```



**案例**

```java
public class StringDemo {
	public static void main(String[] args) {
		//创建字符串对象
		String s = "helloworld";
		
		//int length():获取字符串的长度，其实也就是字符个数
		System.out.println(s.length());
		System.out.println("--------");
		
		//char charAt(int index):获取指定索引处的字符
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println("--------");
		
		//int indexOf(String str):获取str在字符串对象中第一次出现的索引
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("owo"));
		System.out.println(s.indexOf("ak"));
		System.out.println("--------");
		
		//String substring(int start):从start开始截取字符串
		System.out.println(s.substring(0));
		System.out.println(s.substring(5));
		System.out.println("--------");
		
		//String substring(int start,int end):从start开始，到end结束截取字符串
		System.out.println(s.substring(0, s.length()));
		System.out.println(s.substring(3,8));

	}
}
```



**练习**

```java
//练习1：遍历字符串(获取字符串中的每一个字符)
//练习2：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
```



## 4.6 String类的转换功能

```java
char[] toCharArray():把字符串转换为字符数组

String toLowerCase():把字符串转换为小写字符串

String toUpperCase():把字符串转换为大写字符串
```



**案例**

```java
public class StringDemo {
	public static void main(String[] args) {
		//创建字符串对象
		String s = "abcde";
		
		//char[] toCharArray():把字符串转换为字符数组
		char[] chs = s.toCharArray();
		for(int x=0; x<chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("-----------");
		
		//String toLowerCase():把字符串转换为小写字符串
		System.out.println("HelloWorld".toLowerCase());
		//String toUpperCase():把字符串转换为大写字符串
		System.out.println("HelloWorld".toUpperCase());
	}

}
```



**练习**

```java
//需求：键盘录入一个字符串，把该字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
```



## 4.7 String类的其它功能

**案例**

```java
//去除字符串两端空格	 String trim()
//按照指定符号分割字符串 String[] split(String str)
public class StringDemo {
	public static void main(String[] args) {
		//创建字符串对象
		String s1 = "helloworld";
		String s2 = "  helloworld  ";
		String s3 = "  hello  world  ";
		System.out.println("---"+s1+"---");
		System.out.println("---"+s1.trim()+"---");
		System.out.println("---"+s2+"---");
		System.out.println("---"+s2.trim()+"---");
		System.out.println("---"+s3+"---");
		System.out.println("---"+s3.trim()+"---");
		System.out.println("-------------------");

		//String[] split(String str)
		//创建字符串对象
		String s4 = "aa,bb,cc";
		String[] strArray = s4.split(",");
		for(int x=0; x<strArray.length; x++) {
			System.out.println(strArray[x]);
		}
	}
}
```



**练习**

```java
//练习1：把数组中的数据按照指定格式拼接成一个字符串

//练习2：字符串反转

//练习3：定义一个方法，实现数组中元素添加时，数组能够扩容
```

