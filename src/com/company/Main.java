/*
学习目标：接口(具体明确各个类必须实现的行为的抽象类型)；与协议类似；是抽象方法的集合;
实际应用：多人协作编程；面向接口编程；一个类通过继承接口的方式，从而来继承接口的抽象方法。
概念定义：- 接口与实现分离
        - A common interface can be expressed differently for each different subtype.
        - A common interface establishes a basic form of what is common for all the derived classes
        - 抽象类可使用共同的接口操纵一组类
        - An interface is a form and used to establish a protocol between classes
        - 接口不能被实例化
另请参阅：- https://en.wikipedia.org/wiki/Interface_(Java)
        - https://en.wikipedia.org/wiki/Multiple_inheritance
        - https://www.youtube.com/watch?v=UYPxgmTNoHs&t=497s
        - https://www.runoob.com/java/java-interfaces.html
        - https://www.bilibili.com/read/cv4960817?share_medium=iphone&share_plat=ios&share_source=WEIXIN&share_tag=s_i&timestamp=1599004301&unique_k=GyZ5KM
        - "Thinking in Java", 4th Edition, Bruce Eckel
调用API: N/A

commit操作的是本地库，是将本地修改过的文件提交到本地库中。
push操作的是远程库，将本地库中的最新信息发送给远程库
*/

package com.company;

public class Main {

    public static void main(String[] args) {
        Bear myBear = new Bear();
        System.out.println("My bear eats " + myBear.eat() + " fish every day.");
        System.out.print("My bear walks ");
        myBear.travel();
        System.out.println("My bear never drinks " + myBear.drink() + ".");
        System.out.println("Is my bear old? " + myBear.isSenior());

        Cousin Jim = new Cousin();
        System.out.println("Jim ate " + Jim.eat() + " burgers last year.");
        System.out.print("Jim visits ");
        Jim.travel();
        System.out.println("Jim always drinks " + Jim.drink() + " before he goes to bed.");
        System.out.println("Is Jim old? " + Jim.isSenior());

        Virus coronaVirus = new Virus();
        System.out.println("Coronaviruses ate " + coronaVirus.eat() + " cell yesterday.");
        System.out.print("Coronaviruses sometimes ");
        coronaVirus.travel();
        System.out.println("Coronaviruses drink " + coronaVirus.drink());
        System.out.println("Are coronaviruses old? " + coronaVirus.isSenior());

        Ultraman myUltraman = new Ultraman();
        System.out.println("My Ultraman ate " + myUltraman.eat() + " aliens yesterday.");
        System.out.println("My Ultraman flies at " + myUltraman.speed() + " km/h.");
        System.out.print("My Ultraman sometimes ");
        myUltraman.travel();
        System.out.println("My Ultraman drinks " + myUltraman.drink());
        System.out.println("Are my Ultraman old? " + myUltraman.isSenior());

        Cousin myDaughter = new Cousin();
        System.out.println("My daughter prefers to drink " + myDaughter.drink() + ".");

        Bear myMom = new Bear();
        System.out.println("My mom hates drinking " + myMom.drink() + ".");

        Virus Trump = new Virus();
        System.out.println("Trump drinks " + Trump.drink() + ".");
    }
}

