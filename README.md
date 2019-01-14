# IDEA 配置《算法 第四版》环境

## 下载文件
首先，我们需要从[本书网站](https://algs4.cs.princeton.edu/home/)下载两个文件：
- 运行库：[algs4.jar](https://algs4.cs.princeton.edu/code/algs4.jar)
- 数据：[algs4-data.zip](https://algs4.cs.princeton.edu/code/algs4-data.zip)

## 运行库的配置
### 设置环境变量
把``algs4.jar``放到任意一个目录中，比如``D:\Code\jar``，然后打开``控制面板->系统和安全->系统
->高级系统设置->环境变量``，在系统变量中添加''CLASSPATH''，值为``algs4.jar``所在目录``D:\Code\jar\algs4.jar``。
![19_1_14_1.png](https://i.loli.net/2019/01/14/5c3c310fbcef7.png)
![19_1_14_2.png](https://i.loli.net/2019/01/14/5c3c310fda891.png)
![19_1_14_3.png](https://i.loli.net/2019/01/14/5c3c310fdbdca.png)


## IDEA的配置
### 新建项目
打开``File->New->Project``，然后一步步往下操作就行，此处就不写了。
### 为项目加载运行库

打开``File->Project Structure->Modules->Dependencies``，然后点击右上角加号，选择``JARs or directories``，找到刚才``algs4.jar``所在目录，选择``algs4.jar``，确认即可。
![19_1_14_4.png](https://i.loli.net/2019/01/14/5c3c310fdc90b.png)
![19_1_14_5.png](https://i.loli.net/2019/01/14/5c3c310fc90c6.png)
![19_1_14_6.png](https://i.loli.net/2019/01/14/5c3c310fc8031.png)
![19_1_14_7.png](https://i.loli.net/2019/01/14/5c3c310fd0738.png)
![19_1_14_8.png](https://i.loli.net/2019/01/14/5c3c310fb8392.png)

## 运行程序
首先把下载的数据文件``algs4-data.zip``解压到一个文件夹，比如``D:\Code\data``，以运行[BinarySearch.java](https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/BinarySearch.java.html)为例。
首先点击IDEA左下方``Terminal``,进入命令行模式，输入下面的命令：
- 编译 ``javac Ch_1_1/BinarySearch.java`` 
- 运行 ``java Ch_1_1.BinarySearch D:/Code/data/tinyW.txt < D:/Code/data/tinyT.txt ``

编译的命令为：``javac [文件位置]``

运行的命令为：``java [包名.类名]``

**注意：编译命令的文件有``.java``后缀，运行命令没有。**

![19_1_14_9.png](https://i.loli.net/2019/01/14/5c3c310fdf848.png)
![19_1_14_10.png](https://i.loli.net/2019/01/14/5c3c310fb6ada.png)


# 参考资料
[《算法》第四版 IDEA 运行环境的搭建-Umyng-博客园](https://www.cnblogs.com/junhong1995/p/7769006.html)