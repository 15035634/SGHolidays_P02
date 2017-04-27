package sg.edu.rp.c347.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15035634 on 27/4/2017.
 */

public class HolidayList {

    private ArrayList<String> hol;
    private Context context;
    private TextView tvHolName;
    private ImageView ivLogo;

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View holidayView = inflater.inflate(R.layout.holidays, parent, false);

        tvHolName = (TextView) holidayView.findViewById(R.id.tvHolidayType);
        ivLogo = (ImageView) holidayView.findViewById(R.id.ivHoliday1);

        String currentString = hol.get(position);

       // tvHolName.setText(currentString.g);

        return holidayView;
    }

}
