public List<LogMessage> removeMessages(String keyword){

	ArrayList<LogMessage> ans = new ArrayList<LogMessage>();
	int i = 0;
	while(i < messageList.size()){
		if(messageList.get(i).containsWord(keyword)){
			ans.add(messageList.remove(i));
		}
		else{
			i += 1
		}
	}
	return ans;
}
