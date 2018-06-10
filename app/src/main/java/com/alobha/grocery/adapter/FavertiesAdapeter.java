package com.alobha.grocery.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.alobha.grocery.R;

public class FavertiesAdapeter extends BaseAdapter {
		private LayoutInflater mInflater;

		ArrayList<userdata> userdatas;

		public FavertiesAdapeter(Activity mcontext,
				ArrayList<userdata> userDatas) {

			this.userdatas = userDatas;
			mInflater = (LayoutInflater) mcontext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		}
		
		

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return userdatas.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {
			final ViewHolder holder;
			if (convertView == null) {
				convertView = mInflater.inflate(R.layout.faverties_row,null);
				holder = new ViewHolder();

				holder.imgSelection = (ImageView) convertView
						.findViewById(R.id.ivHomeImage);
				holder.imgSelectionOrangeArrow = (ImageView) convertView
						.findViewById(R.id.ivOrangeArrow);
				holder.imgSelectionVertDevider = (ImageView) convertView
						.findViewById(R.id.ivVertDevider);
				holder.imgSelectionGreenCartIcon = (ImageView) convertView
						.findViewById(R.id.ivGreenCartIcon);
				//holder.imgSelectionActiveStares = (ImageView) convertView
				//		.findViewById(R.id.ivActiveStar);
				//holder.imgSelectionActiveStars = (ImageView) convertView
				//		.findViewById(R.id.ivActiveStars);
				//holder.imgSelectionActiveStares = (ImageView) convertView
				//		.findViewById(R.id.ivActiveStares);
				//holder.imgSelectionRatingStar = (ImageView) convertView
				//		.findViewById(R.id.ivRatingStar);
				//holder.imgSelectionRatingStar = (ImageView) convertView
				//		.findViewById(R.id.ivRatingStars);
				holder.ratb=(RatingBar)convertView.findViewById(R.id.rb_rats);	

				holder.tvName = (TextView) convertView
						.findViewById(R.id.tvFruitDetail);
				holder.tvName1 = (TextView) convertView
						.findViewById(R.id.tvCSA);
				holder.tvName2 = (TextView) convertView
						.findViewById(R.id.tvPrice);




				convertView.setTag(holder);

			} else {
				holder = (ViewHolder) convertView.getTag();
			}

		holder.tvName.setText(userdatas.get(position)
					.getfruitdetail());
			holder.tvName1.setText( userdatas.get(position)
					.getsetfruitname());
			holder.tvName2.setText(userdatas.get(position)
					.getsetfruitprice());
			

			return convertView;
		}

		public class ViewHolder {
			public ImageView imgSelectionRatingStar;
			public ImageView imgSelectionActiveStares;
			public ImageView imgSelectionActiveStars;
			public ImageView imgSelectiProductActivityonActiveStar;
			public ImageView imgSelectionGreenCartIcon;
			public ImageView imgSelectionVertDevider;
			public ImageView imgSelectionOrangeArrow;
			public TextView tvName3;
			TextView tvName2;
			TextView tvName1;
			RatingBar ratb;
			TextView tvName;
			ImageView imgSelection;
		}
	}


