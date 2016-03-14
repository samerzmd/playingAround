package project.buildable.com.buildtypessample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainCommonFragment extends Fragment {


    public MainCommonFragment() {
        // Required empty public constructor
    }
    public static MainCommonFragment newInstance(){
        return new MainCommonFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main_common, container, false);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getChildFragmentManager(), FragmentPagerItems.with(getActivity())
                .add("a",BlankFragment1.class)
                .add("b",BlankFragment2.class)
                .add("c",BlankFragment1.class)
                .add("d",BlankFragment2.class)
                .add("e",BlankFragment1.class)
                .add("f",BlankFragment2.class)
                .create());

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = (SmartTabLayout) view.findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(viewPager);
        return view;
    }

}
