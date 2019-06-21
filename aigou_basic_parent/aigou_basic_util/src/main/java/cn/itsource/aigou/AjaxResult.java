package cn.itsource.aigou;

public class AjaxResult {
    private boolean success=true;
    private String msg="操作成功";

    private Object object;//到时候前台需要返回对象的话

    public static AjaxResult li(){
        return new AjaxResult();
    }

    public static void main(String[] args) {
        //链式编程
        AjaxResult.li().setSuccess(false).setMsg("操作失败").setObject("obj");
    }


    public AjaxResult() {
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
