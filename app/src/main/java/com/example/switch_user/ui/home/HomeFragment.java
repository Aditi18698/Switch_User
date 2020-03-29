package com.example.switch_user.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.switch_user.DataBaseHelper1;
import com.example.switch_user.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    Spinner spinner;
    DataBaseHelper1 dataBaseHelper1;

    String table_Name;
    private HomeViewModel homeViewModel;

}