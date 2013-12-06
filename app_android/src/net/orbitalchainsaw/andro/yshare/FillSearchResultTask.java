package net.orbitalchainsaw.andro.yshare;

import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.TextView;

public class FillSearchResultTask extends AsyncTask<Event, Void, Void>{
	private static TextView text;
	private static ImageView image;
	
	public FillSearchResultTask(TextView textView, ImageView imageView){
		super();
		text = textView;
		image = imageView;
	}

	@Override
	protected Void doInBackground(Event... params) {
		if(params.length < 1)
			return null;
		
		Event event = params[0];
		text.setText(event.getTitle());
				
		return null;
	}

}
