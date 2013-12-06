package net.orbitalchainsaw.andro.yshare;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class SearchResultsFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstState){
		View rootView = (View) inflater.inflate(
				R.layout.fragment_search_results, container, false);
		
		//TODO
		ArrayList<Event> events = sortArray(new ArrayList<Event>());
		
		ListView list = (ListView)rootView.findViewById(R.id.searchResultsList);
		SearchResultsAdapter adapter = new SearchResultsAdapter(
				getActivity(), R.layout.fragment_search_results_element, events);
		list.setAdapter(adapter);
		
		return rootView;
	}
	
	protected ArrayList<Event> sortArray(ArrayList<Event> events){
		return events;
	}

}
