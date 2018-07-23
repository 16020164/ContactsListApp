package sg.edu.rp.c346.contactslistapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<Contact> ContactList;

    //TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        ContactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvContact = rowView.findViewById(R.id.textViewContact);
        TextView tvCode = rowView.findViewById(R.id.textViewCode);

        Contact currentItem = ContactList.get(position);
        String name = currentItem.getName();
        String contact = currentItem.getContact();
        String code = currentItem.getCode();

        tvName.setText(name);
        tvContact.setText(contact);
        tvCode.setText(code);

        return rowView;
    }
}
