package templatePattern.syncCallback;

/**
 * @projectName: java-design-patter
 * @package: templatePattern.callback
 * @className: Main
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2024/3/3 11:00
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("开始下载图片");
        DownloadPic task = new DownloadPic(new Callback() {
            @Override
            public void downloadCallBack() {
                System.out.println("下载完成");
            }
        });
        task.downloadFromUrl();
    }

}

interface Callback {
    void downloadCallBack();
}

class DownloadPic{
    private final Callback downloadCallBack;
    public DownloadPic(Callback callback){
        this.downloadCallBack = callback;
    }
    public void downloadFromUrl(){
        try{
            Thread.sleep(5000); // 模拟下载
        }
        catch (Exception e){
            System.out.println("下载失败");
        }
        downloadCallBack.downloadCallBack();
    }
}
