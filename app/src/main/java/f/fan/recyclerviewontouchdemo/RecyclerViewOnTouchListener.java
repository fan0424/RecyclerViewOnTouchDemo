package f.fan.recyclerviewontouchdemo;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * recyclerView的点击监听
 * Created by fan.feng on 2019/3/14.
 */
public class RecyclerViewOnTouchListener implements View.OnTouchListener {

    private Context mContext;
    private GestureDetector gestureDetector;
    private OnClickListener callback;

    public RecyclerViewOnTouchListener(Context context, OnClickListener listener){
        if(context == null){
            return;
        }
        this.mContext = context;
        this.callback = listener;
        gestureDetector = new GestureDetector(mContext, new GestureDetector.SimpleOnGestureListener() {

            /**
             * 单击
             * @param e
             * @return
             */
            @Override
            public boolean onSingleTapConfirmed(MotionEvent e) {

                if(callback != null){
                    callback.onSingleClick((int)e.getX(), (int)e.getY());
                }

                return super.onSingleTapConfirmed(e);
            }

            /**
             * 双击
             * @param e
             * @return
             */
            @Override
            public boolean onDoubleTap(MotionEvent e) {
                if(callback != null){
                    callback.onDoubleClick();
                }
                return super.onDoubleTap(e);
            }
        });
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }


    interface OnClickListener{
        /**
         * 单击
         * @param touthX 点击的x坐标
         * @param touchY 点击的y坐标
         */
        void onSingleClick(int touthX, int touchY);

        /**
         * 双击
         */
        void onDoubleClick();
    }
}
