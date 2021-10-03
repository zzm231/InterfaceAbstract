import javax.swing.text.html.StyleSheet;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btn;
    ImageView iv;

    //当界面被创建就自动调用OnClick方法
    public MainActivity(){
        onCreate();
    }

    @Override
    public void onCreate() {
        //主界面如何布局
        //添加一个按钮
        btn = new Button("分享","红色");

        //添加一张图片
        iv = new ImageView("周杰伦");

        //将创建的控件添加到当前界面
        childs.add(iv);
        childs.add(btn);

        //如果一个控件需要监听事件 那么就必须实现监听事件接口
        //1.告诉按钮是谁在监听这个事件
        btn.listener = this;

        //2.
        iv.listener = new View.OnClickListener() {
            @Override
            public void OnClick(View v) {
                System.out.println("图片被点击了");
            }
        };
    }

    @Override
    public void onDestory() {
        //
    }

    //当事件触发了 就会调用这个接口
    @Override
    public void OnClick(View v) {
        System.out.println("按钮被点击了");
    }

    //模拟触摸
    public void touch(){
        //将屏幕触摸的事件传递给按钮
        btn.getTouchEvent();
        iv.getTouchEvent();
    }
}
