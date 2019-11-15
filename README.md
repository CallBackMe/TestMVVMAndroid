## 一、Android MVVM 核心知识

 
 **1、核心概念**
 
**MVVM** 三层组成：
 
**View**：主要进行视图控件的一些初始设置，==不应该有任何的数据逻辑操作==。「eg：Activity、Fragment、xml」

**Model**：定义实体类，以及获取业务数据模型，比如通过数据库或者网络来操作数据等。

**ViewModel**：作为连接 View 与 Model 的中间桥梁，ViewModel 与 Model 直接交互，处理完业务逻辑后，通过 ==DataBinding== 将数据变化反应到用户界面上。

**2、Android studio集成**

**环境配置**

在 Module:app 的 build.gradle 文件添加如下代码：

    android {
        dataBinding {
            enabled = true
        }
    }


**使用方法查看Demo**


## 二、MVVM优点

1. 不再需要编写 findViewById，
2. 更新 UI 数据时不需再切换至 UI 线程

针对第一个优点，有人说，已经有 ButterKnife 了。针对第二个优点，也有人说，有 RxJava 了。但是 DataBinding，不仅仅能解决这2个问题，它的核心优势在于，它解决了将数据分解映射到各个 view 的问题。针对每个 Activity 或者 Fragment 的布局，在编译阶段，它会生成一个ViewDataBinding 类的对象，该对象持有 Activity 要展示的数据和布局中的各个 view 的引用。同时还有如下优势：将数据分解到各个 view、在 UI 线程上更新数据、监控数据的变化，实时更新，这样一来，你要展示的数据已经和展示它的布局紧紧绑定在了一起。这才是 DataBinding 真正的魅力所在。


