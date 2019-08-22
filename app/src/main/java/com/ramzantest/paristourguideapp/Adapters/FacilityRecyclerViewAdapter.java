package com.ramzantest.paristourguideapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ramzantest.paristourguideapp.Classes.CallableTouristFacility;
import com.ramzantest.paristourguideapp.Classes.Monument;
import com.ramzantest.paristourguideapp.Classes.PublicGarden;
import com.ramzantest.paristourguideapp.Classes.TouristFacility;
import com.ramzantest.paristourguideapp.R;

import java.util.ArrayList;

public class FacilityRecyclerViewAdapter extends RecyclerView.Adapter<FacilityRecyclerViewAdapter.FacilityViewHolder> {
    private Context context;
    private ArrayList<? extends TouristFacility> facilities;

    public FacilityRecyclerViewAdapter(Context context, ArrayList<? extends TouristFacility> facilities) {
        this.context = context;
        this.facilities = facilities;
    }

    @NonNull
    @Override
    public FacilityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FacilityViewHolder((LayoutInflater.from(parent.getContext())).inflate(R.layout.recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FacilityViewHolder holder, int position) {
        // getting the current facility
        TouristFacility currentTouristFacility = facilities.get(position);

        // displaying the attributes of the facility {rating, visits, name, location, type}
        holder.facilityRatingTextView.setText(currentTouristFacility.getRating() + context.getString(R.string.out_of_five_string));
        holder.facilityVisitsTextView.setText(currentTouristFacility.getAverageVisitsPerDay() + " " + context.getString(R.string.per_day_string));
        holder.facilityNameTextView.setText(currentTouristFacility.getName());
        holder.facilityLocationTextView.setText(currentTouristFacility.getLocationAddress());
        holder.facilityTypeTextView.setText(currentTouristFacility.getTypeStringId());

        // setting the images
        holder.facilityTypeImageView.setImageResource(currentTouristFacility.getTypeIconId());
        holder.facilityMainImageView.setImageResource(currentTouristFacility.getPictureId());

        // if the current facility has a phone number
        if (currentTouristFacility instanceof CallableTouristFacility) {
            holder.facilityPhoneViewGroup.setVisibility(View.VISIBLE);
            holder.facilityPhoneTextView.setText(((CallableTouristFacility) currentTouristFacility).getSupportPhoneNumber());
        }

        // if the current facility is a monument
        if (currentTouristFacility instanceof Monument) {
            holder.facilityBuiltSinceViewGroup.setVisibility(View.VISIBLE);
            holder.facilityBuiltSinceTextView.setText(String.valueOf(((Monument) currentTouristFacility).getBuiltSince()));
        }

        // if the current facility is a public garden
        if (currentTouristFacility instanceof PublicGarden) {
            holder.facilityAreaViewGroup.setVisibility(View.VISIBLE);
            holder.facilityAreaTextView.setText(((PublicGarden) currentTouristFacility).getAreaInSquareMetre() + " " + context.getString(R.string.square_metre_string));
        }

    }

    @Override
    public int getItemCount() {
        return facilities.size();
    }

    static class FacilityViewHolder extends RecyclerView.ViewHolder {
        View facilityPhoneViewGroup;
        View facilityAreaViewGroup;
        View facilityBuiltSinceViewGroup;

        TextView facilityRatingTextView;
        TextView facilityVisitsTextView;
        TextView facilityPhoneTextView;
        TextView facilityAreaTextView;
        TextView facilityBuiltSinceTextView;
        TextView facilityNameTextView;
        TextView facilityLocationTextView;
        TextView facilityTypeTextView;

        ImageView facilityMainImageView;
        ImageView facilityTypeImageView;

        FacilityViewHolder(@NonNull View itemView) {
            super(itemView);
            facilityPhoneViewGroup = itemView.findViewById(R.id.phone_view_group);
            facilityAreaViewGroup = itemView.findViewById(R.id.area_view_group);
            facilityBuiltSinceViewGroup = itemView.findViewById(R.id.built_since_view_group);

            facilityRatingTextView = itemView.findViewById(R.id.rating_text_view);
            facilityVisitsTextView = itemView.findViewById(R.id.visits_text_view);
            facilityPhoneTextView = itemView.findViewById(R.id.phone_text_view);
            facilityAreaTextView = itemView.findViewById(R.id.area_text_view);
            facilityBuiltSinceTextView = itemView.findViewById(R.id.built_since_text_view);
            facilityNameTextView = itemView.findViewById(R.id.item_name_text_view);
            facilityLocationTextView = itemView.findViewById(R.id.item_location_text_view);
            facilityTypeTextView = itemView.findViewById(R.id.item_type_text_view);

            facilityMainImageView = itemView.findViewById(R.id.item_main_image_view);
            facilityTypeImageView = itemView.findViewById(R.id.item_type_image_view);
        }
    }
}
