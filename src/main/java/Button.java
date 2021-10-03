/**
 * 创建按钮类
 */
public class Button extends View {
    String title;
    String titleColor;

    public Button(String title,String titleColor){
        this.title = title;
        this.titleColor = titleColor;
    }

    public void getTouchEvent(){
        //调用监听这=者里面的OnClick方法
        listener.OnClick(this);
    }
}
