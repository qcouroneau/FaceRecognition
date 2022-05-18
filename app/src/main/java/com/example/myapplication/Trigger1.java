//package com.example.myapplication;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//import androidx.navigation.fragment.NavHostFragment;
//
//import com.example.myapplication.databinding.FragmentFirstBinding;
//import com.example.myapplication.databinding.Trigger1Binding;
//
//public class Trigger1 extends Fragment {
//    private Trigger1Binding binding;
//
//    @Override
//    public View onCreateView(
//            LayoutInflater inflater, ViewGroup container,
//            Bundle savedInstanceState
//    ) {
//
//        binding = Trigger1Binding.inflate(inflater, container, false);
//        return binding.getRoot();
//
//    }
//
//    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        binding.button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(Trigger1.this)
//                        .navigate(R.id.action_Trigger1_to_FirstFragment);
//            }
//        });
//    }
//
//}
