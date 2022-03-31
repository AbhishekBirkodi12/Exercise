public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob)
    {
        this.width=ob.width;
        this.height=ob.height;
        this.depth=ob.depth;
    }
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }

    double volume(){
        return width*height*depth;
    }

    Box display(Box a){
        return a;

    }
}

class Test{
    public static void main(String[] args) {
        Box box=new Box(10,15,12);
        Box myClone=new Box(box);

        double vol;
        vol=box.volume();
        System.out.println("volume of myBox is :"+vol);

        vol=myClone.volume();
        System.out.println("volume of myClone is :"+vol);

        Box b=box.display(box);
        System.out.println(b);
        System.out.println(b.height);
        System.out.println(b.depth);
        System.out.println(b.width);
    }
}
