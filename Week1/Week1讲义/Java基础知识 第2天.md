# Java基础知识 第2天

【学习目标】理解、了解、应用、记忆



1.【理解】能够灵活的使用Java中的各种运算符

a. 【应用】独立编写代码使用(+,-,,/,%,++,--等)算数运算符完成数学运算

b. 【应用】阐述取余和除法的区别

c. 【理解】阐述字符和字符串参与加法运算操作需要注意的事项

d. 【理解】阐述++和--的作用，以及++，--在前或在后的区别

e. 【理解】阐述赋值运算符和扩展运算符有哪些

f. 【理解】阐述关系运算符有哪些，关系运算符得到的结果是什么

g. 【理解】阐述逻辑运算符的基本使用及&与&&的区别

h. 【应用】阐述三元运算符使用格式及使用场景



2.【应用】使用Scanner完成键盘录入功能

a. 【应用】阐述键盘录入的基本步骤

b. 【应用】独立编写代码，使用键盘录入的方式完成：求两个数的和、判断两个数是否相等、获取三个数中的最大值

 

# 第1章 运算符

**• 运算符**

对常量和变量进行操作的符号称为运算符



**• 表达式**

用运算符把常量或者变量连接符号的Java语法的式子，就可以称为表达式。不同运算符连接的式子体现的是不同类型的表达式，例如：定义两个int类型的变量a,b，做加法(a + b)



**• 常用运算符**

算术运算符

赋值运算符

关系运算符

逻辑运算符

三元运算符



## 1.1 算数运算符

### 1.1.1 算数运算符概述

**什么是运算符**

​	 就是对常量和变量进行操作的符号



**算数运算符有哪些**

​	 +,-,*,/,%,++,--



==**注意**==
	一旦运算当中有不同类型的数据，那么结果将会是数据类型范围大的那种。



### 1.1.2 案例一

```java
/**
 * 算术运算符的使用
 * 
 * 运算符：对常量和变量进行操作的符号
 * 表达式：用运算符连接起来的符合java语法的式子。不同类型的运算符连接起来的式子是不同的表达式。
 * 
 * 运算符分类：
 * 		算术运算符，赋值运算符，关系运算符，逻辑运算符，三元运算符。
 * 
 * 算术运算符：
 * 		+，-，*，/的基本使用
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// 定义两个变量
		int a = 3;
		int b = 4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		// 整数相除只能得到整数，要想得到小数，就必须有浮点数参与运算
		System.out.println(3 / 4);
		System.out.println(3.0 / 4);
	}
}
```



### 1.1.3 算数运算符取余和除法的区别

 %：取余运算符。得到的是两个相除数据的余数。

 /：除法运算符。得到是两个相除数据的商。 

 使用场景： %和/ 判断两个数据是否整除。



### 1.1.4 案例二

```java
/**
 * 算数运算符取余和除法的区别
 */
public class OperatorDemo2 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;

		System.out.println(a / b);
		System.out.println(a % b);
	}
}
```



### 1.1.5 字符和字符串参与加法操作

**字符参与运算：**其实是拿该字符对应的数值来操作。‘a’	97  ，    ‘A’	65  ，  ‘0’	48



**字符串参与运算：**这里其实做的不是加法运算，而是字符串拼接。字符串和其他类型的数据做拼接，结果是字符串类型的。



### 1.1.6 案例三

```java
//字符和字符串参与加法操作的区别
public class OperatorDemo3 {
	public static void main(String[] args) {
		// 整数加法
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println("------------------");

		// 字符参与加法操作
		char c = '0';
		char c2 = 'a';
		System.out.println(a + c);
		System.out.println(a + c2);
		System.out.println("------------------");

		// 字符串参与加法操作
		System.out.println("hello" + a);
		System.out.println("hello" + a + b); // "hello"+10,然后再和b进行拼接
		System.out.println(a + b + "hello");
	}
}
```



### 1.1.7 算数运算符++和--的用法

++,--运算符：对变量做加1或者减1的操作。

++或者--既可以放在变量的后面，也可以放在变量的前面。

​	 **单独使用的时候，++或者--无论是放在变量的前面还是后面，结果是一样的。**



参与操作的时候：

 	**如果++或者--在变量的后面，先拿变量参与操作，后变量做++或者--；**

​	 **如果++或者--在变量的前面，先变量做++或者--，后拿变量参与操作。**



注意：

​	**只有变量才能使用自增、自减运算符。常量不可发生改变，所以不能用。**



### 1.1.8 案例四

```java
//算数运算符++和--的用法
public class OperatorDemo4 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a:" + a);

		// 单独使用
		// a++;
		// ++a;
		// System.out.println("a:" + a);

		// 参与操作使用
        int i = 1;
		//++ -- 在后面的情况，先赋值，再运算
		System.out.println("i++:"+(i++));  //1
		System.out.println("i:"+i); //2
		
		//++ -- 在前面的情况，先运算，再赋值
		int j = 1;
		System.out.println("++j:"+(++j));  //2
		System.out.println("j:"+j); //2
	}
}
```



### 1.1.9 课堂练习

```java
//练习1
int sum=0,i=2;
sum=(i++)+(++i)+(++i)+(i--)+(i++)+(--i)+(i++)-(i--);
      2     4     5     5     4     4     4     5     

//练习2
int i=3;
int sum=0;
sum=(i++)+(i--)*(i++)+(++i)+(i++)-(--i)+(++i);   
      3     4     3     5     5     5     6    
```



## 1.2 赋值运算符

### 1.2.1 赋值运算符分类

基本的赋值运算符：=

扩展的赋值运算符：+=,-=,=,/=,%=

+=:	a+=20;相当于==a = (a的数据类型)(a + 20)==;



**注意：**
 	1. 只有变量才能使用赋值运算符，常量不能进行赋值。
 	2. 复合赋值运算符其中==隐含了一个强制类型转换==。



### 1.2.2 案例五

```java
//赋值运算符的使用
public class OperatorDemo5 {
	public static void main(String[] args) {
		// 把10赋值给int类型的变量a
		int a = 10;

		// += 把左边和右边的数据进行运算，最后赋值给左边。左边的只能是变量
		a += 10;// 相当于a = a + 10
		System.out.println("a:" + a);
		System.out.println("----------------------");

		short s = 10;
		// s += 20; // 相当于 s = s + 20;
		s = (short) (s + 20);
		System.out.println("s:" + s);
	}
}
```



## 1.3 关系运算符

### 1.3.1 基本使用及注意事项

关系运算符包含以下内容:

==,!=,>,>=,<,<=



**注意：**

1. 关系运算符的结果都是boolean型，要么是true，要么是false。
2. 如果进行多次判断，不能连着写。
例如：数学当中的写法，10 < x < 20，但是程序当中不允许这种写法。
3. 关系运算符“==”不能误写成“=”，"="代表赋值。



### 1.3.2 案例六

```java
//关系运算符
public class OperatorDemo6 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("-----------------");
		System.out.println(a != b);
        System.out.println(a != c);
		System.out.println("-----------------");
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("-----------------");
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("-----------------");

		int x = 3;
		int y = 4;
		// System.out.println(x == y);
		// System.out.println(x = y);// 把y赋值给x，把x的值输出
	}
}
```



>面试题：=和==的区别？
>
>= 赋值；
>
>== 判断前后值是否相等，当是基本数据类型时比较的是二进制，当是引用数据类型时比较的是地址。



## 1.4 逻辑运算符

### 1.4.1 逻辑运算符概述

逻辑运算符有哪些

​	&,|,^,~        //位运算符、逻辑运算符

​    !                  //逻辑运算符

​	&&,||        //逻辑运算符

 

**结论：**

```java
 & 逻辑与：有false则false。

 | 逻辑或：有true则true。

 ^ 逻辑异或：相同为false，不同为true。

 ! 逻辑非：非false则true，非true则false。

 && 与（并且）：全都是true，才是true；否则就是false
 
 || 或（或者）：至少一个是true，就是true；全都是false，才是false

 !  非（取反）：本来是true，变成false；本来是false，变成true
```



 **注意：**

​	1.逻辑运算符一般用于连接boolean类型的表达式或者值。

​	2.与“&&”，或“||”，具有短路效果：如果根据左边已经可以判断得到最终结果，那么右边的代码将不再执行，从而节省一定的性能。

​	3.与、或需要左右各自有一个boolean值，但是取反只要有唯一的一个boolean值即可。

​	4.与、或两种运算符，如果有多个条件，可以连续写。
​		两个条件：条件A && 条件B
​		多个条件：条件A && 条件B && 条件C





### 1.4.2 案例七

```java
//逻辑运算符：用于连接关系表达式
public class OperatorDemo7 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println((a > b) & (a > c));// false & false
		System.out.println((a < b) & (a > c)); // true & false
		System.out.println((a > b) & (a < c)); // false & true
		System.out.println((a < b) & (a < c)); // true & true
		System.out.println("---------------");
		System.out.println((a > b) | (a > c));// false | false
        System.out.println((a < b) | (a > c)); // true | false
		System.out.println((a > b) | (a < c)); // false | true
		System.out.println((a < b) | (a < c)); // true | true
		System.out.println("---------------");
		System.out.println((a > b) ^ (a > c));// false ^ false
		System.out.println((a < b) ^ (a > c)); // true ^ false
		System.out.println((a > b) ^ (a < c)); // false ^ true
		System.out.println((a < b) ^ (a < c)); // true ^ true
		System.out.println("---------------");
		System.out.println((a > b)); // false
		System.out.println(!(a > b)); // !false
		System.out.println(!!(a > b)); // !!false
	}
}
```



### 1.4.3 逻辑运算符&&与&的区别

> 面试题：&&和&的区别?
>
> 最终结果一样。
>
> ​	&&具有短路效果。左边是false，右边不执行。
>
> ​	&是无论左边是false还是true,右边都会执行

​	

> ||和|的区别?
>
> 最终结果一样
>
> ​	||具有短路效果.左边是true,右边不执行
>
> ​	|是无论左边是false还是true,右边都会执行

​	

### 1.4.4 案例八

```java
//逻辑运算符&&与&的区别
public class OperatorDemo8 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println((a > b) && (a > c));// false && false
		System.out.println((a < b) && (a > c)); // true && false
		System.out.println((a > b) && (a < c)); // false && true
		System.out.println((a < b) && (a < c)); // true && true
		System.out.println("---------------");
		System.out.println((a > b) || (a > c));// false || false
		System.out.println((a < b) || (a > c)); // true || false
		System.out.println((a > b) || (a < c)); // false || true
		System.out.println((a < b) || (a < c)); // true || true
		System.out.println("---------------");

		int x = 3;
		int y = 4;
		// System.out.println((x++ > 4) & (y++ > 5)); // false & false
		System.out.println((x++ > 4) && (y++ > 5)); // false && false
		System.out.println("x:" + x);
		System.out.println("y:" + y);
	}
}
```



## 1.5 三元运算符 

一元运算符：只需要一个数据就可以进行操作的运算符。例如：取反!、自增++、自减--
二元运算符：需要两个数据才可以进行操作的运算符。例如：加法+、赋值=
三元运算符：需要三个数据才可以进行操作的运算符。



### 1.5.1 三元运算符概述

**格式**

​	==(关系表达式)?表达式1：表达式2；==

​	如果条件为true，运算后的结果是表达式1；

​	如果条件为false，运算后的结果是表达式2；



**示例**

​	获取两个数中大数。

​	int x=3,y=4,z;

​	z = (x>y)?x:y;  //z变量存储的就是两个数的大数



**注意**

1. 必须同时保证表达式A和表达式B都符合左侧数据类型的要求。
2. 三元运算符的结果必须被使用。



### 1.5.2 案例九

```java
//三元运算符
public class OperatorDemo9 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int c = (a > b) ? a : b;
		System.out.println("c:" + c);
	}
}
```



### 1.5.3 课堂练习

```java
//练习1：比较两个数是否相同

//练习2：获取三个数中的最大值
```



## 1.6 移位运算符

\>> 有符号右移

> \>>有符号右移，对于正数发生右移时，高位直接补0；对于负数发生右移时，高位直接补1

\>>> 无符号右移    

>\>>> 无符号右移，无论正数或负数发生右移时，高位都直接补0

<< 左移

>\<<  左移运算符，值变大，低位补0



## 1.7 重点和小结

1、使用(+,-,,/,%,++,--等)算数运算符

2、取余和除法的区别

3、字符和字符串参与加法运算操作需要注意的事项

4、++和--的作用，以及++，--在前或在后的区别

5、赋值运算符和扩展运算符

6、关系运算符，关系运算符的结果

7、逻辑运算符的基本使用及&与&&的区别

8、三元运算符



# 第2章 键盘录入

## 2.1 键盘录入的基本步骤

### 2.1.1 键盘录入数据概述

我们目前在写程序的时候，数据值都是固定的，但是实际开发中，数据值肯定是变化的，所以，把数据改进为键盘录入，提高程序的灵活性。



**键盘录入数据的步骤:**

1.导包(位置放到class定义的上面)

​	import java.util.Scanner;

2.创建对象

​	Scanner sc = new Scanner(System.in);

3.接收数据

​	int x = sc.nextInt();



### 2.1.2 案例十

```java
import java.util.Scanner;

//实现键盘录入数据
public class ScannerDemo {
	public static void main(String[] args) {
		//创建键盘录入数据的对象
		Scanner sc = new Scanner(System.in);
        
        //接收数据
		System.out.println("请录入一个整数：");
		int i = sc.nextInt();
		
		//输出数据
		System.out.println("i:"+i);
	}
}
```



## 2.2 键盘录入的练习

### 2.2.1 键盘录入两个数据并求和

 键盘录入两个数据，并对这两个数据求和，输出其结果

 键盘录入：

 		A:导包

 		B:创建对象

 		C:接收数据



### 2.2.2 案例十一

```java
//键盘录入两个数据并求和
import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
        // 创建对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		// 对数据进行求和
		int sum = a + b;
		System.out.println("sum:" + sum);
	}
}
```



### 2.2.3 课堂练习

```java
//练习1：键盘录入两个数据，比较这两个数据是否相等
//练习2：键盘录入三个数据，获取这三个数据中的最大值
```

