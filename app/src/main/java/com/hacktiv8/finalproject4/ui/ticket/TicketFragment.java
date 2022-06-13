package com.hacktiv8.finalproject4.ui.ticket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.hacktiv8.finalproject4.databinding.FragmentTicketBinding;

public class TicketFragment extends Fragment {

    private FragmentTicketBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TicketViewModel ticketViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(TicketViewModel.class);

        binding = FragmentTicketBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        ticketViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}