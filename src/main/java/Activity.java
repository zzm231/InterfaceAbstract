import java.util.ArrayList;
import java.util.stream.StreamSupport;

/**
 * 管理界面的抽象类 定义了一个界面创建到结束的模板
 */
public abstract class Activity {
    //保存这个界面的所有子视图
    public ArrayList<View> childs = new ArrayList<>();

    //界面创建
    public abstract void onCreate();

    //界面销毁
    public abstract void onDestory();

    //将子控件添加到当前界面上
    //接收的时候是用父类去接收子类
    //当需要访问子类内容的时候 就要强制转换为对应的类
    public void addChild(View v){
        if (v instanceof Button){
            Button btn = (Button) v;
            System.out.println(btn.title+"按钮显示到界面上了");
        }

        if (v instanceof ImageView){
            ImageView iv = (ImageView) v;
            System.out.println(iv.picture+"的图片加载到界面上了");
        }

        //保存子类控件
        childs.add(v);
    }
}















