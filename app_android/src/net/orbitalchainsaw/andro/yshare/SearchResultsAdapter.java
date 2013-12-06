package net.orbitalchainsaw.andro.yshare;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchResultsAdapter extends ArrayAdapter<Event>{
	private static int resId;
	private static Context context;
	private static ArrayList<Event> events;

	public SearchResultsAdapter(Context context, int resource, ArrayList<Event> events) {
		super(context, resource);
		
		this.resId = resource;
		this.context = context;
		this.events = events;
	}
	
	public View getView(int position, View convertView, ViewGroup parent){
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(resId, parent, false);
		
		TextView eventTitle = (TextView)rowView.findViewById(R.id.element_title);
		ImageView eventImg = (ImageView)rowView.findViewById(R.id.element_img);
		
		FillSearchResultTask fillSearchResultTask = new FillSearchResultTask(eventTitle, eventImg);
		fillSearchResultTask.execute(events.get(position));
		
		return rowView;		
	}

}
