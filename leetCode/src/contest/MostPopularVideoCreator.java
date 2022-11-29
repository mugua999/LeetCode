package contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

public class MostPopularVideoCreator {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        List<Creator> list = new ArrayList<>();
        
        for (int i = 0; i < creators.length; i++) {
        	
        }
        
        
        return null;
    }
    
    private class Creator{
    	String name;
    	TreeMap<Integer, String> videos;
    	Integer totalView;
    	
    	public Creator(String name) {
    		this.name = name;
    		this.videos = new TreeMap<>();
    		totalView = 0;
    	}
    	
    	public void addVideo(int views, String name) {
    		videos.put(views, name);
    		totalView += views;
    	}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public TreeMap<Integer, String> getVideos() {
			return videos;
		}

		public void setVideos(TreeMap<Integer, String> videos) {
			this.videos = videos;
		}

		public Integer getTotalView() {
			return totalView;
		}

		public void setTotalView(Integer totalView) {
			this.totalView = totalView;
		}
    	
    	public boolean equals(Creator creator) {
    		return creator.getName().equals(this.name);
    	}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(name, totalView, videos);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Creator other = (Creator) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(name, other.name);
		}

		private MostPopularVideoCreator getEnclosingInstance() {
			return MostPopularVideoCreator.this;
		}
    	
    }
}

