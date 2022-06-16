package com.hacktiv8.finalproject4.ui.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;
import com.hacktiv8.finalproject4.R;
import com.hacktiv8.finalproject4.SearchTicketActivity;
import com.hacktiv8.finalproject4.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment implements View.OnClickListener{

    Intent intent;

    private FragmentSearchBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        intent = new Intent(getActivity(), SearchTicketActivity.class);
        final Button button = (Button) root.findViewById(R.id.btn_cari);
        button.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_cari) {
            startActivity(intent);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
