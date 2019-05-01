package ui.fargment;

import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.example.administrator.demo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import serialport_utils.Send_Controller;


/**
 * Created by Lenovo on 2019/1/7.
 * 窗帘
 */

public class CurtainFargment extends BaseFragment {


    private static final String TAG ="CurtainFargment" ;
    Unbinder unbinder;
    private boolean isBoolean;

    @BindView(R.id.ll_curtain_round)
    LinearLayout llCurtainRound;
    private RadioGroup rgCurtain;
    private RadioGroup rgCurtain1;


    @Override
    protected void initData() {

    }

    @Override
    protected View initView() {
        //加载界面
        View view = View.inflate(getActivity(), R.layout.fargment_curtain, null);


        unbinder = ButterKnife.bind(this, view);
        rgCurtain = (RadioGroup) view.findViewById(R.id.rg_curtain);
        rgCurtain1 = (RadioGroup) view.findViewById(R.id.rg_curtain1);


        for (int i = 0; i < 3; i++) {
            // 添加下面的小圆点
            ImageView grayRoundView = new ImageView(getContext());

            // 设置灰色的圆图
            grayRoundView.setImageResource(R.drawable.gray_round);
            // 添加小圆点的距离
            if (i != 0) {
                // 生成布局参数
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                layoutParams.leftMargin = 15;// 设置左边距
                // 设置布局参数
                grayRoundView.setLayoutParams(layoutParams);
            }

            // 添加到布局
            llCurtainRound.addView(grayRoundView);
        }
        rgCurtain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.rb_curtainkai:
//                        Send_Controller.isClicked=1;
//                        Send_Controller.send_type=12;
                        Log.e(TAG, " 第一个窗帘开 " );
                        Send_Controller.isClicked=2;
                        Send_Controller.send_type=1;

                        break;
                    case R.id.rb_curtainting:


//                        Toast.makeText(mActivty, "窗帘停", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_curtainguan:
                        Log.e(TAG, " 第一个窗帘关 " );
                        Send_Controller.isClicked=2;
                        Send_Controller.send_type=2;
                        break;

                }

            }
        });
        rgCurtain1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.rb_curtainkai1:
//                        Send_Controller.isClicked=1;
//                        Send_Controller.send_type=12;
                        Log.e(TAG, " 第2个窗帘开 " );

                        Send_Controller.isClicked=2;
                        Send_Controller.send_type=3;

                        break;
                    case R.id.rb_curtainting1:


//                        Toast.makeText(mActivty, "窗帘停", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_curtainguan1:

                        Log.e(TAG, " 第2个窗帘关" );

                        Send_Controller.isClicked=2;
                        Send_Controller.send_type=4;
                        break;

                }

            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

//    @OnClick({R.id.curtain_open, R.id.curtain_out, R.id.curtain_close})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.curtain_open:
//                Toast.makeText(getActivity(), "窗帘开启", Toast.LENGTH_LONG).show();
//                curtain.setBackgroundResource(R.drawable.curtain1_anim);
//                AnimationDrawable background1 = (AnimationDrawable) curtain.getBackground();
//                background1.start();
//                break;
//            case R.id.curtain_out:
//                break;
//            case R.id.curtain_close:
//                Toast.makeText(getActivity(), "窗帘关闭", Toast.LENGTH_LONG).show();
//                curtain.setBackgroundResource(R.drawable.curtain_anim);
//                AnimationDrawable background = (AnimationDrawable) curtain.getBackground();
//                background.start();
//                break;
//        }
//    }
}
