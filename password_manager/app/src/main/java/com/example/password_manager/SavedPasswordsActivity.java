package com.example.password_manager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SavedPasswordsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PasswordAdapter passwordAdapter;
    private List<PasswordItem> passwordItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_passwords);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample data
        passwordItemList = new ArrayList<>();
        passwordItemList.add(new PasswordItem("Example Website", "AccountName", "Password123", "2024-08-25"));

        passwordAdapter = new PasswordAdapter(passwordItemList);
        recyclerView.setAdapter(passwordAdapter);
    }

    private class PasswordAdapter extends RecyclerView.Adapter<PasswordAdapter.PasswordViewHolder> {

        private final List<PasswordItem> passwordItemList;

        PasswordAdapter(List<PasswordItem> passwordItemList) {
            this.passwordItemList = passwordItemList;
        }

        @NonNull
        @Override
        public PasswordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_saved_password, parent, false);
            return new PasswordViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PasswordViewHolder holder, int position) {
            PasswordItem item = passwordItemList.get(position);

            holder.websiteNameTextView.setText(item.getWebsiteName());
            holder.accountNameTextView.setText("Account Name: " + item.getAccountName());
            holder.passwordTextView.setText("Password: " + item.getPassword());
            holder.dateOfGenerationTextView.setText("Date of Generation: " + item.getDateOfGeneration());

            holder.itemView.setOnClickListener(v -> {
                boolean isExpanded = holder.detailsLayout.getVisibility() == View.VISIBLE;
                holder.detailsLayout.setVisibility(isExpanded ? View.GONE : View.VISIBLE);
            });

            holder.regenerateButton.setOnClickListener(v -> {
                // TODO: Implement regenerate password logic
            });
        }

        @Override
        public int getItemCount() {
            return passwordItemList.size();
        }

        class PasswordViewHolder extends RecyclerView.ViewHolder {

            final TextView websiteNameTextView;
            final TextView accountNameTextView;
            final TextView passwordTextView;
            final TextView dateOfGenerationTextView;
            final LinearLayout detailsLayout;
            final Button regenerateButton;

            PasswordViewHolder(View itemView) {
                super(itemView);
                websiteNameTextView = itemView.findViewById(R.id.websiteName);
                accountNameTextView = itemView.findViewById(R.id.accountName);
                passwordTextView = itemView.findViewById(R.id.password);
                dateOfGenerationTextView = itemView.findViewById(R.id.dateOfGeneration);
                detailsLayout = itemView.findViewById(R.id.detailsLayout);
                regenerateButton = itemView.findViewById(R.id.regenerateButton);
            }
        }
    }

    // Data model class
    private static class PasswordItem {
        private final String websiteName;
        private final String accountName;
        private final String password;
        private final String dateOfGeneration;

        PasswordItem(String websiteName, String accountName, String password, String dateOfGeneration) {
            this.websiteName = websiteName;
            this.accountName = accountName;
            this.password = password;
            this.dateOfGeneration = dateOfGeneration;
        }

        String getWebsiteName() {
            return websiteName;
        }

        String getAccountName() {
            return accountName;
        }

        String getPassword() {
            return password;
        }

        String getDateOfGeneration() {
            return dateOfGeneration;
        }
    }
}
