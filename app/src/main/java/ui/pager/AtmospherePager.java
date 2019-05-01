package ui.pager;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.administrator.demo.R;

import serialport_utils.Send_Controller;

/**
 * Created by Lenovo on 2019/1/18.
 */

public class AtmospherePager extends BasePager {

    private RadioButton rbFOne;
    private RadioButton rbYFwo;
    private RadioGroup rgAtmosphere;

    public AtmospherePager(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        View view = View.inflate(mActivity, R.layout.pager_atmosphere, null);
        rgAtmosphere = (RadioGroup) view.findViewById(R.id.rg_Atmosphere);
        rbFOne = (RadioButton) view.findViewById(R.id.rb_Atmosphere_one);
        rbYFwo = (RadioButton) view.findViewById(R.id.rb_Atmosphere_two);
//        initData(1);
        rgAtmosphere.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.rb_Atmosphere_one:
                        Send_Controller.isClicked=1;
                        Send_Controller.send_type=26;



                        break;
                    case R.id.rb_Atmosphere_two:

                        Send_Controller.isClicked=1;
                        Send_Controller.send_type=25;
                        break;


                }
            }
        });

        return view;
    }

    @Override
    public void initData(int i) {

    }


}
