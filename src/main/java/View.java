/**
 * 管理一个视图显示和事件监听
 */
public class View {
    // 所有视图都共有的属性
    String backgroundColor;
    String borderColor;

    // 记录谁想监听这个事件
    // 暂时我不确定是谁要监听我这个事件
    // 但是要监听我这个事件的人一定实现了我这个接口
    OnClickListener listener;

    // 所有的视图都要监听事件
    public interface OnClickListener{
        //定义一套方法 约束外部使用这些方法来监听事件
        void OnClick(View v);
    }

    //用于控件接收触摸事件
    public void getTouchEvent(){
        //调用监听者里面的OnClick方法
        listener.OnClick(this);
    }
}
