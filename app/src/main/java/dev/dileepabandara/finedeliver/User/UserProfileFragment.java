/*
   --------------------------------------
      Developed by
      Dileepa Bandara
      https://dileepabandara.github.io
      contact.dileepabandara@gmail.com
      ©dileepabandara.dev
      2021
   --------------------------------------
*/

package dev.dileepabandara.finedeliver.User;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import dev.dileepabandara.finedeliver.HelperClasses.UserDetailsHelperClass;
import dev.dileepabandara.finedeliver.R;

public class UserProfileFragment extends Fragment {

    TextView txtName, txtPhone, txtEmail;
    DatabaseReference databaseReference;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_profile, container, false);

        txtName = view.findViewById(R.id.textView29);
        txtPhone = view.findViewById(R.id.textView30);
        txtEmail = view.findViewById(R.id.textView31);

        getUserDetails();

        return view;
    }

    private void getUserDetails() {
        try {
            String userID = FirebaseAuth.getInstance().getCurrentUser().getUid();
            databaseReference = FirebaseDatabase.getInstance().getReference("Users").child(userID);
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()) {
                        UserDetailsHelperClass userDetailsHelperClass = snapshot.getValue(UserDetailsHelperClass.class);
                        if (userDetailsHelperClass != null) {
                            txtName.setText(userDetailsHelperClass.getUserName());
                            txtPhone.setText(userDetailsHelperClass.getUserPhone());
                            txtEmail.setText(userDetailsHelperClass.getUserEmail());
                        }
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            Toast.makeText(getContext(), "Error fetching user details", Toast.LENGTH_SHORT).show();
        }
    }
}